package com.cognizant.account.repositories;
import com.cognizant.account.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Repository;
@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {
    // Custom query methods (if needed) can be defined here
}
