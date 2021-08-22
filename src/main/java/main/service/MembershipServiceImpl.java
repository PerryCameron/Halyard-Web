package main.service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import main.dto.MembershipIdDTO;
import main.model.MembershipEntity;
import main.model.MembershipIdEntity;
import main.repository.MembershipIdRepository;
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
	public List<MembershipDTO> findMembershipsByCity(String city) {
		List<MembershipEntity> membershipEntity = membershipRepository.findMembershipsByCity(city);
		var membershipDTO = membershipEntity.stream()
				.map(o -> new MembershipDTO(o.getMsId(),o.getpId(), o.getJoinDate(), o.getMemType(), o.getAddress(), o.getCity(), o.getState(), o.getZip())).collect(Collectors.toList());
		return membershipDTO;
	}

	@Override
	public List<MembershipIdDTO> findMembershipIdEntityByFiscalYear(int fiscalYear) {
		List<MembershipIdEntity> membershipIdEntity = membershipIdRepository.findMembershipIdEntityByFiscalYear(fiscalYear);
		var membershipListDTO = membershipIdEntity.stream().map(o -> new MembershipIdDTO(o.getMid(),o.getFiscalYear(),
				o.getMembershipId(),o.getRenew(),o.getMemType(),o.getSelected(),o.getMembershipByMsId().getMsId(),o.getMembershipByMsId().getpId(),
				o.getMembershipByMsId().getJoinDate(),o.getMembershipByMsId().getAddress(),o.getMembershipByMsId().getCity(),o.getMembershipByMsId().getState(),
				o.getMembershipByMsId().getZip())).collect(Collectors.toList());
		return membershipListDTO;
	}


	@Override
	public List<MembershipDTO> getAllDTO() {
		List<MembershipEntity> membershipOriginal = getAll();
		var membershipDTO = membershipOriginal.stream()
				.map(o -> new MembershipDTO(o.getMsId(),o.getpId(), o.getJoinDate(), o.getMemType(), o.getAddress(), o.getCity(), o.getState(), o.getZip())).collect(Collectors.toList());
		return membershipDTO;
	}

}
