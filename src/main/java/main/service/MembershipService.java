package main.service;

import java.util.List;

import main.dto.MembershipDTO;
import main.model.MembershipEntity;

public interface MembershipService {

	List<MembershipEntity> getAll();

	MembershipEntity getById(int id);
	
	void saveOrUpdate(MembershipEntity offer);
	
	void delete(int id);
	
	List<MembershipDTO> getAllDTO();
	
	List<MembershipDTO> findMembershipsByCity(String city);
	
//	List<MembershipDTO> findMembershipsByPersonMember_type(int member_type);
	// public List<Membership> findByMemberType(int type);
}
