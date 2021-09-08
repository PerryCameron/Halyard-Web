package main.repository;



import main.model.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Integer>{

    List<PersonEntity> findPersonEntityByMembershipByMsId_MsId(int ms_id);

}
