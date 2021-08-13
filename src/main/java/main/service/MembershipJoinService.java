package main.service;

import java.util.List;

import main.dto.MembershipDTO;
import main.dto.MembershipJoinDTO;
import main.model.Membership;

public interface MembershipJoinService {

	public List<MembershipJoinDTO> getAll();
	
	//public Membership getById(int id);
	
	//public void saveOrUpdate(Membership offer);
	
	//public void delete(int id);
	
	//public List<MembershipDTO> getAllDTO();
	
	//public List<MembershipDTO> findMembershipsByCity(String city);
	

}
