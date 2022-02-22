package com.lab.employeeTracking.repositories;

import com.lab.employeeTracking.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository  extends JpaRepository<Department,Long> {
}
