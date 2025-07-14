package com.cognizant.loan.services;

import com.cognizant.loan.entities.Loan;

public interface LoanService {
    Loan getLoanDetails(String number);
    String addLoan(Loan loan);
}
