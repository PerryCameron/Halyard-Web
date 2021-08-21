package main.service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import main.model.MembershipEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dto.MembershipDTO;
import main.repository.MembershipRepository;

@Service
public class MembershipServiceImpl implements MembershipService {

	@Autowired
	private MembershipRepository membershipRepository;
	
	@Override
	public List<MembershipEntity> getAll() {
		return membershipRepository.findAll();
	}

	@Override
	public MembershipEntity getById(int id) {
		return membershipRepository.getById(id);
	}

	@Override
	public void saveOrUpdate(MembershipEntity membershipOriginal) {
		if(membershipOriginal.getMsId() == 0) {
			membershipOriginal.setJoinDate((java.sql.Date) new Date());
		}
		membershipRepository.save(membershipOriginal);
	}

	@Override
	public void delete(int id) {
		membershipRepository.deleteById(id);
	}
	
	@Override
	public List<MembershipDTO> findMembershipsByCity(String city) {
		List<MembershipEntity> membershipOriginal = membershipRepository.findMembershipsByCity(city);
		var membershipDTO = membershipOriginal.stream()
				.map(o -> new MembershipDTO(o.getMsId(),o.getpId(), o.getJoinDate(), o.getMemType(), o.getAddress(), o.getCity(), o.getState(), o.getZip())).collect(Collectors.toList());
		return membershipDTO;
	}
	

	@Override
	public List<MembershipDTO> getAllDTO() {
		List<MembershipEntity> membershipOriginal = getAll();
		var membershipDTO = membershipOriginal.stream()
				.map(o -> new MembershipDTO(o.getMsId(),o.getpId(), o.getJoinDate(), o.getMemType(), o.getAddress(), o.getCity(), o.getState(), o.getZip())).collect(Collectors.toList());
		return membershipDTO;
	}

//	@Override
//	public List<MembershipDTO> findMembershipsByPersonMember_type(int member_type) {
//		List<MembershipEntity> membershipOriginal = getAll();
//		var membershipDTO = membershipOriginal.stream()
//				.map(o -> new MembershipDTO(o.getMsId(),o.getpId(), o.getJoinDate(), o.getMemType(), o.getAddress(), o.getCity(), o.getState(), o.getZip())).collect(Collectors.toList());
//		return membershipDTO;
//	}

	//  @Override
	//  public List<Membership> findByMemberType(int type) {
	//  	return membershipRepository.findByMemberType(type);
	//  }

}
