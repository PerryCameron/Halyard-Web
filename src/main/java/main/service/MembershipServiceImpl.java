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
		if(membership.getMsid() == 0) {
			membership.setJoinDate(new Date());
		}
		membershipRepository.save(membership);
	}

	@Override
	public void delete(int id) {
		membershipRepository.deleteById(id);
	}
//
//	@Override
//	public List<MembershipDTO> getAllDTO() {
//		List<Membership> membership = getAll();
//		//membership.forEach((n) -> System.out.println(n));
//		System.out.println("The size is " + membership.size());
//		List<MembershipDTO> membershipDTO = membership.stream()
//				.map(o -> new MembershipDTO(o.getMsid(), o.getPid(), o.getJoinDate(), o.getMemType(), o.getAddress(), o.getCity(), o.getState(), o.getZip(), null))
//				.collect(Collectors.toList());
//		return membershipDTO;
//	}
	

	@Override
	public List<MembershipDTO> getAllDTO() {
		List<Membership> membership = getAll();
		//List<PersonDTO> person = new PersonServiceImpl().getSelectDTO(null);
		membership.forEach((n) -> System.out.println(n.getPeople().size()));
		
		List<MembershipDTO> membershipDTO = membership.stream()
				.map(o -> new MembershipDTO(o.getMsid(), o.getPid() + "" , o.getJoinDate(), o.getMemType(), o.getAddress(), o.getCity(), o.getState(), o.getZip()))
				.collect(Collectors.toList());
		return membershipDTO;
	}
	

}
