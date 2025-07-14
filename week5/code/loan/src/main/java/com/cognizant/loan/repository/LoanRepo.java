package com.cognizant.loan.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.loan.entities.Loan;
public interface LoanRepo extends JpaRepository<Loan, String> {

    
}
