package com.cognizant.demodiffjpaandhib.repository;

import com.cognizant.demodiffjpaandhib.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SpringDataJpaEmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Transactional
    public void addEmployee(Employee employee) {
        repository.save(employee);
    }
}