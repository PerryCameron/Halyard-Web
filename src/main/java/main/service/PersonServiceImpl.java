package main.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import main.model.MembershipEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.model.PersonEntity;
import main.dto.PersonDTO;
import main.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public List<PersonEntity> getAll() {
		return personRepository.findAll();
	}

	@Override
	public PersonEntity getById(int id) {
		return personRepository.getById(id);
	}

	@Override
	public void saveOrUpdate(PersonEntity person) {
		if(person.getMembershipByMsId().getMsId() == 0) {
			person.setBirthday((java.sql.Date) new Date());
		}
		personRepository.save(person);
	}

	@Override
	public void delete(int id) {
		personRepository.deleteById(id);
	}

	@Override
	public List<PersonDTO> getAllDTO() {
		List<PersonEntity> people = getAll();
		var personDTO = people.stream()
				.map(o -> new PersonDTO(o.getpId(), o.getMembershipByMsId().getMsId(), o.getfName(), o.getlName(), o.getBirthday(), o.getOccupation(), o.getBuisness(),false, o.getNickName()))
				.collect(Collectors.toList());
		return personDTO;
	}

	@Override
	public List<PersonDTO> getSelectDTO(int msid) {
		List<PersonEntity> people = getAll();
		List<PersonDTO> personDTO = new ArrayList<>();
		for(PersonEntity p: people) {
			if(p.getMembershipByMsId().getMsId() == msid) {
				personDTO.add(new PersonDTO(p.getpId(), p.getMembershipByMsId().getMsId(), p.getfName(), p.getlName(), p.getBirthday(), p.getOccupation(), p.getBuisness(),false, p.getNickName()));
			}
		}
		return personDTO;
	}

	@Override
	public List<PersonDTO> getByMsId(int msId) {
		List<PersonEntity> personEntities = personRepository.findPersonEntityByMembershipByMsId_MsId(msId);
		var personDTOS = personEntities.stream().map(o-> new PersonDTO(o.getpId(),o.getMemberType(),
				o.getfName(),o.getlName(),o.getBirthday(),o.getOccupation(),o.getBuisness(),o.getIsActive(),o.getNickName())).collect(Collectors.toList());
		return personDTOS;
	}

}
