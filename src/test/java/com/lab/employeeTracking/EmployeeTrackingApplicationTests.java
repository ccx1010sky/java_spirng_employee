package com.lab.employeeTracking;

import com.lab.employeeTracking.models.Department;
import com.lab.employeeTracking.models.Employee;
import com.lab.employeeTracking.models.Project;
import com.lab.employeeTracking.repositories.DepartmentRepository;
import com.lab.employeeTracking.repositories.EmployeeRepository;
import com.lab.employeeTracking.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;


@AutoConfigureTestDatabase
@SpringBootTest
class EmployeeTrackingApplicationTests {


	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository  projectRepository;


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

		Project project = new Project("java",2);
		projectRepository.save(project);
		Employee employee = new Employee("Jack","smith",1001,department);
		employeeRepository.save(employee);
		Employee employee1 = new Employee("Mike","Washington",1002,department);
		employeeRepository.save(employee1);


//		employee.addProject(project);
//		project.addEmployee(employee);






	}


}
