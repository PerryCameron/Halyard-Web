package main.service;

import java.util.List;

import main.dto.PersonDTO;
import main.model.PersonEntity;

public interface PersonService {

	public List<PersonEntity> getAll();
	
	public PersonEntity getById(int id);
	
	public List<PersonDTO> getByMSID(int msid);
	
	public void saveOrUpdate(PersonEntity person);
	
	public void delete(int id);
	
	public List<PersonDTO> getAllDTO();
	
	public List<PersonDTO> getSelectDTO(int msid);

	// public List<Person> getPrimaryMember(int type);
	
}
