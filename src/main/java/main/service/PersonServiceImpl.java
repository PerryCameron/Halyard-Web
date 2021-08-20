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
		if(person.getMs_id() == 0) {
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
				.map(o -> new PersonDTO(o.getP_id(), o.getMs_id(), o.getMember_type(), o.getF_name(), o.getL_name(), o.getBirthday(), o.getOccupation(), o.getBuisness(),false, o.getNick_name()))
				.collect(Collectors.toList());
		return personDTO;
	}

	@Override
	public List<PersonDTO> getSelectDTO(int msid) {
		List<Person> people = getAll();
		List<PersonDTO> personDTO = new ArrayList<>();
		for(Person p: people) {
			if(p.getMs_id() == msid) {
				personDTO.add(new PersonDTO(p.getP_id(), p.getMs_id(), p.getMember_type(), p.getF_name(), p.getL_name(), p.getBirthday(), p.getOccupation(), p.getBuisness(),false, p.getNick_name()));
			}
		}
		return personDTO;
	}

	@Override
	public List<PersonDTO> getByMSID(int msid) {
		return null;
	}

	// @Override
	// public List<Person> getPrimaryMember(int type) {
	// 	return personRepository.findPrimaryMember(type);
	// }





}
