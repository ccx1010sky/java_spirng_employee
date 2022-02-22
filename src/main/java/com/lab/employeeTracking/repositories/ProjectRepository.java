package com.lab.employeeTracking.repositories;

import com.lab.employeeTracking.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}
