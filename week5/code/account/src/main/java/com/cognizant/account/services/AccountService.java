package com.cognizant.account.services;

import com.cognizant.account.entities.Account;

public interface AccountService {
    String createAccount(Account account);
    Account getAccountById(Long id);
}
