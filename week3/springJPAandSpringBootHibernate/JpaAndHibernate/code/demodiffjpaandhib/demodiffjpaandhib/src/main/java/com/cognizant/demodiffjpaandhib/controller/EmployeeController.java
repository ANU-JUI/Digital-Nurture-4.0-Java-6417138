package com.cognizant.demodiffjpaandhib.controller;
import com.cognizant.demodiffjpaandhib.hibernate.*;
import com.cognizant.demodiffjpaandhib.jpa.*;
import com.cognizant.demodiffjpaandhib.model.*;
import com.cognizant.demodiffjpaandhib.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private Hib hibernateDAO;

    @Autowired
    private JpaEmployeeService jpaService;

    @Autowired
    private SpringDataJpaEmployeeService springDataService;

    @PostMapping("/hibernate")
    public String addWithHibernate(@RequestBody Employee employee) {
        return "Hibernate ID: " + hibernateDAO.addEmployee(employee);
    }

    @PostMapping("/jpa")
    public String addWithJPA(@RequestBody Employee employee) {
        jpaService.addEmployee(employee);
        return "Added with JPA";
    }

    @PostMapping("/spring-data")
    public String addWithSpringDataJPA(@RequestBody Employee employee) {
        springDataService.addEmployee(employee);
        return "Added with Spring Data JPA";
    }
}