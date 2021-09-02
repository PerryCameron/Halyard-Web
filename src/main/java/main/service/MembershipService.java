package main.service;

import java.util.List;

import main.dto.MembershipDTO;
import main.dto.MembershipListDTO;
import main.model.MembershipEntity;
import main.model.MembershipIdEntity;

public interface MembershipService {
	List<MembershipEntity> getAll();

	List<MembershipIdEntity> getAllMembershipId();

	MembershipEntity getById(int id);
	
	void saveOrUpdate(MembershipEntity offer);
	
	void delete(int id);

	List<MembershipDTO> getAllDTO();

	List<MembershipListDTO> findMembershipList(int fiscal_year, String type, int memberType, String sort);
}
