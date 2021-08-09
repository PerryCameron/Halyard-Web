package main.service;

import java.util.List;

import main.dto.PersonDTO;
import main.model.Person;

public interface PersonService {

	public List<Person> getAll();
	
	public Person getById(int id);
	
	public List<PersonDTO> getByMSID(int msid);
	
	public void saveOrUpdate(Person person);
	
	public void delete(int id);
	
	public List<PersonDTO> getAllDTO();
	
	public List<PersonDTO> getSelectDTO(int msid);
	
}
