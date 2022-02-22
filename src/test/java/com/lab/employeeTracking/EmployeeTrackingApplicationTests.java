package com.lab.employeeTracking;

import com.lab.employeeTracking.models.Employee;
import com.lab.employeeTracking.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackingApplicationTests {
	private Employee jack;

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		jack = new Employee("Jack",25,1001,"jack@emal.com");
		employeeRepository.save(jack);
	}


}
