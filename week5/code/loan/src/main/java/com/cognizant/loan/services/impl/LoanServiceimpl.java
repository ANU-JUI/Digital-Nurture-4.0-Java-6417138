package com.cognizant.loan.services.impl;

import org.springframework.stereotype.Service;

import com.cognizant.loan.entities.Loan;
import com.cognizant.loan.repository.LoanRepo;
import com.cognizant.loan.services.LoanService;
@Service
public class LoanServiceimpl implements LoanService {
    private final LoanRepo LoanRepo;

    public LoanServiceimpl(LoanRepo loanRepo) {
        this.LoanRepo = loanRepo;
    }
    @Override
    public Loan getLoanDetails(String number) {

        return LoanRepo.findById(number).orElseThrow(() -> new RuntimeException("Loan not found"));
    }

    @Override
    public String addLoan(Loan loan) {
        LoanRepo.save(loan);
        return "Loan added successfully";
    }
}
