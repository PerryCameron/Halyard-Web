package main.service;

import java.util.List;

import main.model.MembershipDTO;
import main.model.Membership;

public interface MembershipService {

	public List<Membership> getAll();
	
	public Membership getById(int id);
	
	public void saveOrUpdate(Membership offer);
	
	public void delete(int id);
	
	public List<MembershipDTO> getAllDTO();
	
}