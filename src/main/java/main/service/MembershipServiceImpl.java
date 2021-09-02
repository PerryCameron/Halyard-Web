package main.service;

import java.util.Comparator;
import java.sql.Date;
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

	}

	@Override
	public void delete(int id) {
		membershipRepository.deleteById(id);
	}


	@Override
	public List<MembershipListDTO> findMembershipList(int fiscal_year, String rb, int memberType, String sort) {
		List<MembershipListEntity> membershipListEntities;
		if(rb.equals("option2")) { // non-renew
			membershipListEntities = membershipListRepository.findMembershipListEntityByFiscalYearAndRenewAndMemberType(fiscal_year, false, memberType);
		} else if(rb.equals("option3")) { // all
			membershipListEntities = membershipListRepository.findMembershipListEntityByFiscalYearAndMemberType(fiscal_year, memberType);
		} else if(rb.equals(("option4"))) { // new members
			Date begin = Date.valueOf(fiscal_year + "-01-01");
			Date end = Date.valueOf(fiscal_year + "-12-31");
			membershipListEntities = membershipListRepository.findMembershipListEntityWhereJoinDateIsBetween(begin, end);

		} else if(rb.equals(("option5"))) {  // return members
			membershipListEntities = null;
		} else if(rb.equals(("option6"))) {  // late dues
			membershipListEntities = null;
		} else {
			membershipListEntities = membershipListRepository.findMembershipListEntityByFiscalYearAndRenewAndMemberType(fiscal_year, true, memberType);
		}
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
