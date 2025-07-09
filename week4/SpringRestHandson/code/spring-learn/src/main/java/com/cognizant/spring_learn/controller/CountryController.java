package com.cognizant.spring_learn.controller;
 import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.Country;
import com.cognizant.spring_learn.service.CountryService;

@RestController
public class CountryController {
    @GetMapping("/country")
    String getCountry() {
        // Logic to get country information
    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = (Country) context.getBean("country");
        return country.toString();
    }
    @GetMapping("/country/{code}")
    String CountryByCode(@PathVariable String code) {
    return CountryService.getCountry(code).toString();
}
}