package com.lab.employeeTracking;

import com.lab.employeeTracking.models.Department;
import com.lab.employeeTracking.models.Employee;
import com.lab.employeeTracking.repositories.DepartmentRepository;
import com.lab.employeeTracking.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackingApplicationTests {


	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	void contextLoads() {
	}

//	@Test
//	public void createEmployee(){
//		jack = new Employee("Jack",25,1001,"jack@emal.com");
//		employeeRepository.save(jack);
//	}
	@Test
	public void createEmployeeAndDepartment(){
		Department  department = new Department("Tech");
		departmentRepository.save(department);

		Employee jack = new Employee("Jack","smith",1001,department);
		employeeRepository.save(jack);

	}


}
