package main.service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.model.Membership;
import main.model.Person;
import main.dto.MembershipDTO;
import main.dto.MembershipJoinDTO;
import main.repository.MembershipRepository;
import main.repository.PersonRepository;

@Service
public class MembershipServiceImpl implements MembershipService {

	@Autowired
	private MembershipRepository membershipRepository;
	
	@Autowired
	private PersonRepository personRepository;
	
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
		if(membership.getMsid() == 0) {
			membership.setJoinDate(new Date());
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
				.map(o -> new MembershipDTO(o.getMsid(),o.getPid(), o.getJoinDate(), o.getMemType(), o.getAddress(), o.getCity(), o.getState(), o.getZip(),o.getPeople())).collect(Collectors.toList());
		return membershipDTO;
	}
	

	@Override
	public List<MembershipDTO> getAllDTO() {
		List<Membership> membership = getAll();
		List<MembershipDTO> membershipDTO = membership.stream()
				.map(o -> new MembershipDTO(o.getMsid(),o.getPid(), o.getJoinDate(), o.getMemType(), o.getAddress(), o.getCity(), o.getState(), o.getZip(),o.getPeople())).collect(Collectors.toList());
		return membershipDTO;
	}

}
