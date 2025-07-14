package com.cognizant.account.services.impl;

import org.springframework.stereotype.Service;

import com.cognizant.account.entities.Account;
import com.cognizant.account.repositories.AccountRepo;
@Service
public class AccountServiceimpl implements com.cognizant.account.services.AccountService {
   
   private final AccountRepo accountRepository;

    public AccountServiceimpl(AccountRepo accountRepository) {
        this.accountRepository = accountRepository;
    }
    @Override
    public String createAccount(Account account) {
        accountRepository.save(account);
        return "Account created successfully with ID: " + account.getNumber();
    }

    @Override
    public Account getAccountById(Long id) {
        return accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account not found with ID: " + id));
    }
}
