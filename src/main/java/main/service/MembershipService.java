package main.service;

import java.util.List;

import main.dto.MembershipDTO;
import main.dto.MembershipIdDTO;
import main.model.MembershipEntity;
import main.model.MembershipIdEntity;

public interface MembershipService {
	List<MembershipEntity> getAll();

	List<MembershipIdEntity> getAllMembershipId();

	MembershipEntity getById(int id);
	
	void saveOrUpdate(MembershipEntity offer);
	
	void delete(int id);
	
	List<MembershipDTO> getAllDTO();
	
	List<MembershipDTO> findMembershipsByCity(String city);
	
	List<MembershipIdDTO> findMembershipIdEntityByFiscalYear(int fiscalYear, boolean renew, String sort);
	// public List<Membership> findByMemberType(int type);
}
