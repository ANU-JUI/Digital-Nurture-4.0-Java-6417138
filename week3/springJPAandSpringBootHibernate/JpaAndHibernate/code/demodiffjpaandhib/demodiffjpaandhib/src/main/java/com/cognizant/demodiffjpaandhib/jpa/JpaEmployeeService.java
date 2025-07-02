package com.cognizant.demodiffjpaandhib.jpa;

import com.cognizant.demodiffjpaandhib.model.*;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class JpaEmployeeService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void addEmployee(Employee employee) {
        entityManager.persist(employee);
    }
}
