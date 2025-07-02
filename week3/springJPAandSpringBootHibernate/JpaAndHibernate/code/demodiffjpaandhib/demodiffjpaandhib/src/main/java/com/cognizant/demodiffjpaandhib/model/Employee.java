package com.cognizant.demodiffjpaandhib.model;
import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String department;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
}
    