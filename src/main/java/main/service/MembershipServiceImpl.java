package main.service;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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
	public List<MembershipListDTO> findMembershipListEntityByFiscalYearAndRenewAndMemberType(int fiscal_year, boolean renew, int memberType, String sort) {
		List<MembershipListEntity> membershipListEntities;
		membershipListEntities = membershipListRepository.findMembershipListEntityByFiscalYearAndRenewAndMemberType(fiscal_year,renew,memberType);
		var membershipListDTO = membershipListEntities.stream().map(o -> new MembershipListDTO(o.getMsId(),o.getMembershipId(),
				o.getJoinDate(), o.getfName(), o.getlName(), o.getMemType(), o.getAddress(),o.getCity(),o.getState(),o.getZip())).collect(Collectors.toList());
		return sortList(membershipListDTO, sort);
	}


	private List<MembershipListDTO> sortList(List<MembershipListDTO> l, String sort) {
		if(sort.equals("fname")) {
			l.sort(Comparator.comparing(MembershipListDTO::getFname));
		} else if (sort.equals("lname")) {
			l.sort(Comparator.comparing(MembershipListDTO::getLname));
		} else if (sort.equals("type")) {
			l.sort(Comparator.comparing(MembershipListDTO::getMem_type));
		} else if (sort.equals("date")) {
			l.sort(Comparator.comparing(MembershipListDTO::getJoin_date));
		} else if (sort.equals("adrs")) {
			l.sort(Comparator.comparing(MembershipListDTO::getAddress));
		} else if (sort.equals("city")) {
			l.sort(Comparator.comparing(MembershipListDTO::getCity));
		} else if (sort.equals("state")) {
			l.sort(Comparator.comparing(MembershipListDTO::getState));
		} else if (sort.equals("zip")) {
			l.sort(Comparator.comparing(MembershipListDTO::getZip));
		} else {
			l.sort(Comparator.comparing(MembershipListDTO::getMembership_id));
		}
		return l;
	}


	@Override
	public List<MembershipDTO> getAllDTO() {
		List<MembershipEntity> membershipOriginal = getAll();
		var membershipDTO = membershipOriginal.stream()
				.map(o -> new MembershipDTO(o.getMsId(),o.getpId(), o.getJoinDate(), o.getMemType(), o.getAddress(), o.getCity(), o.getState(), o.getZip())).collect(Collectors.toList());
		return membershipDTO;
	}
}
