package main.repository;



import main.model.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Integer>{
	
// @Query(value = "select p from Person p where p.memberType=?1")
// 	List<Person> findPrimaryMember(int type);

}
