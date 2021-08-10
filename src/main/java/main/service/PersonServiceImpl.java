package main.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.model.Person;
import main.dto.PersonDTO;
import main.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public List<Person> getAll() {
		return personRepository.findAll();
	}

	@Override
	public Person getById(int id) {
		return personRepository.getById(id);
	}

	@Override
	public void saveOrUpdate(Person person) {
		if(person.getMsid() == 0) {
			person.setBirthday(new Date());
		}
		personRepository.save(person);
	}

	@Override
	public void delete(int id) {
		personRepository.deleteById(id);
	}

	@Override
	public List<PersonDTO> getAllDTO() {
		List<Person> people = getAll();
		List<PersonDTO> personDTO = people.stream()
				.map(o -> new PersonDTO(o.getPid(), o.getMsid(), o.getMemberType(), o.getFirstName(), o.getLastName(), o.getBirthday(), o.getOccupation(), o.getBuisness(),false, o.getNickName()))
				.collect(Collectors.toList());
		return personDTO;
	}

	@Override
	public List<PersonDTO> getSelectDTO(int msid) {
		List<Person> people = getAll();
		List<PersonDTO> personDTO = new ArrayList<>();
		for(Person p: people) {
			if(p.getMsid() == msid) {
				personDTO.add(new PersonDTO(p.getPid(),p.getMsid(),p.getMemberType(), p.getFirstName(), p.getLastName(), p.getBirthday(), p.getOccupation(), p.getBuisness(),false, p.getNickName()));
			}
		}
		return personDTO;
	}

	@Override
	public List<PersonDTO> getByMSID(int msid) {
		// TODO Auto-generated method stub
		return null;
	}





}
