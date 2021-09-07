package main.service;

import java.util.List;

import main.dto.MembershipDTO;
import main.dto.MembershipIdDTO;
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

	void testFunction();

	List<MembershipIdDTO> findMembershipId(int fiscal_year, int ms_id);
	// for selecting a single membershipId DTO
	public MembershipIdDTO findIdByYear(int year, List<MembershipIdDTO> ids);
}
