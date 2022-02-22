package com.lab.employeeTracking.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name ="name")
    private String name;

    @Column(name = "duration")
    private int druation;

    @ManyToMany
    @JoinTable(
            name = "employees_projects",
            joinColumns = {@JoinColumn(
                    name = "project_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = { @JoinColumn(
                    name ="employee_id",
                    nullable = false,
                    updatable = false)
            })
    private List<Employee> employees;

    public Project(String name, int druation) {
        this.name = name;
        this.druation = druation;
        this.employees = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDruation() {
        return druation;
    }

    public void setDruation(int druation) {
        this.druation = druation;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
