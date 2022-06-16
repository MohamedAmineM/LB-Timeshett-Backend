package com.timesheet.demo.repostitories;








import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.timesheet.demo.model.Employee;






@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
	
	

	List<Employee> findByNameEmployee(String name);
	Optional<Employee> findByEmailEmployee(String emailEmployee);

	/*
	List<Employee> findByAbsenceIdAbsence(Integer id);
	
	*/
	
		

	
	 
	
			
	
	

}
