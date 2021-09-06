package main.service;

import main.dto.TestDTO;
import main.repository.TestRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class TestRepositoryImpl implements TestRepository<TestDTO> {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Object[]> methodThatTestsDTO() {
        Query nativeQuery = em.createNativeQuery("SELECT id.MS_ID, m.JOIN_DATE, p.F_NAME FROM membership_id id inner join membership m on id.MS_ID=id.MEMBERSHIP_ID inner join person p on m.MS_ID=p.MS_ID");
        return nativeQuery.getResultList();
    }
}
