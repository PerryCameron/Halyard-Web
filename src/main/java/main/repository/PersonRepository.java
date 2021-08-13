package main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{
	
	List<Person> findByMemberType(int memberType);

}
