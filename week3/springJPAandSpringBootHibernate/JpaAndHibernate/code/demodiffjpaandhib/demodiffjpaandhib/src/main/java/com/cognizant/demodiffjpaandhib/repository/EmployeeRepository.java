package com.cognizant.demodiffjpaandhib.repository;
import com.cognizant.demodiffjpaandhib.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}