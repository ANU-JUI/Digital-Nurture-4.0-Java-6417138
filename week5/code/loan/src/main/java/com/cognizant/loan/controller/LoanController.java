package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cognizant.loan.entities.Loan;
import com.cognizant.loan.services.LoanService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/loans")
public class LoanController {

    private LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }
    @GetMapping("/{number}")
    public Loan getLoan(@PathVariable String number) {
        return loanService.getLoanDetails(number);
    }

    @PostMapping("/add")
    public String addLoan(@RequestBody Loan loan) {
        loanService.addLoan(loan);
        return "Loan added successfully";
    }
    
    
}
