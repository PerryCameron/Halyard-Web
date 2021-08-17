package main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import main.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{
	
@Query(value = "select p from Person p where p.memberType=1")
	List<Person> findPrimaryMember();

}
