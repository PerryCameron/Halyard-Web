package main.repository;

import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface TestRepository <TestDTO> {
    List<Object[]> methodThatTestsDTO();
}
