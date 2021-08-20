package main.service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.model.Membership;
import main.dto.MembershipDTO;
import main.repository.MembershipRepository;

@Service
public class MembershipServiceImpl implements MembershipService {

	@Autowired
	private MembershipRepository membershipRepository;
	
	@Override
	public List<Membership> getAll() {
		return membershipRepository.findAll();
	}

	@Override
	public Membership getById(int id) {
		return membershipRepository.getById(id);
	}

	@Override
	public void saveOrUpdate(Membership membership) {
		if(membership.getMs_id() == 0) {
			membership.setJoin_date(new Date());
		}
		membershipRepository.save(membership);
	}

	@Override
	public void delete(int id) {
		membershipRepository.deleteById(id);
	}
	
	@Override
	public List<MembershipDTO> findMembershipsByCity(String city) {
		List<Membership> membership = membershipRepository.findMembershipsByCity(city);
		List<MembershipDTO> membershipDTO = membership.stream()
				.map(o -> new MembershipDTO(o.getMs_id(),o.getP_id(), o.getJoin_date(), o.getMemType(), o.getAddress(), o.getCity(), o.getState(), o.getZip(),o.getPeople())).collect(Collectors.toList());
		return membershipDTO;
	}
	

	@Override
	public List<MembershipDTO> getAllDTO() {
		List<Membership> membership = getAll();
		List<MembershipDTO> membershipDTO = membership.stream()
				.map(o -> new MembershipDTO(o.getMs_id(),o.getP_id(), o.getJoin_date(), o.getMemType(), o.getAddress(), o.getCity(), o.getState(), o.getZip(),o.getPeople())).collect(Collectors.toList());
		return membershipDTO;
	}

	@Override
	public List<MembershipDTO> findMembershipsWithPeople() {
		List<Membership> membership = getAll();
		List<MembershipDTO> membershipDTO = membership.stream()
				.map(o -> new MembershipDTO(o.getMs_id(),o.getP_id(), o.getJoin_date(), o.getMemType(), o.getAddress(), o.getCity(), o.getState(), o.getZip(),o.getPeople())).collect(Collectors.toList());
		return membershipDTO;
	}

	//  @Override
	//  public List<Membership> findByMemberType(int type) {
	//  	return membershipRepository.findByMemberType(type);
	//  }

}
