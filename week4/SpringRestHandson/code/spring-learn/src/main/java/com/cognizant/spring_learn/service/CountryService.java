package com.cognizant.spring_learn.service;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
//import org.springframework.web.bind.annotation.GetMapping;

import com.cognizant.spring_learn.Country;

public class CountryService {
    //@GetMapping("/country/{code}")
   public static Country getCountry(String code)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        @SuppressWarnings("unchecked")
        List<Country> countryList = (List<Country>) context.getBean("countryList");
        return countryList.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
}
