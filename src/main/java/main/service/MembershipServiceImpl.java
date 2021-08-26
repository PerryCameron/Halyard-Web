package main.service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import main.dto.MembershipIdDTO;
import main.dto.MembershipListDTO;
import main.model.MembershipEntity;
import main.model.MembershipIdEntity;
import main.model.MembershipListEntity;
import main.repository.MembershipIdRepository;
import main.repository.MembershipListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dto.MembershipDTO;
import main.repository.MembershipRepository;

@Service
public class MembershipServiceImpl implements MembershipService {

	@Autowired
	private MembershipRepository membershipRepository;

	@Autowired
	private MembershipIdRepository membershipIdRepository;

	@Autowired
	private MembershipListRepository membershipListRepository;
	
	@Override
	public List<MembershipEntity> getAll() {
		return membershipRepository.findAll();
	}

	@Override
	public List<MembershipIdEntity> getAllMembershipId() {
		return membershipIdRepository.findAll();
	}

	@Override
	public MembershipEntity getById(int id) {
		return membershipRepository.getById(id);
	}

	@Override
	public void saveOrUpdate(MembershipEntity membershipEntity) {
		if(membershipEntity.getMsId() == 0) {
			membershipEntity.setJoinDate((java.sql.Date) new Date());
		}
		membershipRepository.save(membershipEntity);
	}

	@Override
	public void delete(int id) {
		membershipRepository.deleteById(id);
	}


	@Override
	public List<MembershipListDTO> findMembershipListEntityByFiscalYearAndRenewAndMemberTypeOrderByMembershipId(int fiscal_year, boolean renew, int memberType) {
		List<MembershipListEntity> membershipListEntities;
		membershipListEntities = membershipListRepository.findMembershipListEntityByFiscalYearAndRenewAndMemberTypeOrderByMembershipId(fiscal_year,renew,memberType);
		var membershipListDTO = membershipListEntities.stream().map(o -> new MembershipListDTO(o.getMsId(),o.getMembershipId(),
				o.getJoinDate(), o.getfName(), o.getlName(), o.getMemType(), o.getAddress(),o.getCity(),o.getState(),o.getZip())).collect(Collectors.toList());
		return membershipListDTO;
	}


	@Override
	public List<MembershipDTO> getAllDTO() {
		List<MembershipEntity> membershipOriginal = getAll();
		var membershipDTO = membershipOriginal.stream()
				.map(o -> new MembershipDTO(o.getMsId(),o.getpId(), o.getJoinDate(), o.getMemType(), o.getAddress(), o.getCity(), o.getState(), o.getZip())).collect(Collectors.toList());
		return membershipDTO;
	}

	// This is the full Query I need
	// select id.membershipId ,m,p.fName,p.lName, id.memType from MembershipEntity m inner join MembershipIdEntity id on m.msId=id.membershipByMsId.msId inner join PersonEntity p on m.msId=p.membershipByMsId.msId where id.fiscalYear=2021 and id.renew=true and p.memberType=1

}
