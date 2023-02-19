package springboot1.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot1.springbootbackend.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee , Long> {

	
	
	
	
}
