package com.lab.employeeTracking.repositories;

import com.lab.employeeTracking.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
