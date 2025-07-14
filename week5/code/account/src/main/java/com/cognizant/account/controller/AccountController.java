package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.entities.Account;
import com.cognizant.account.services.AccountService;
@RestController
@RequestMapping("/accounts")
public class AccountController {
    private AccountService accountService;
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public String createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
        //return "Account created successfully with ID: " + createdAccount.getNumber();
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Long id) {
        Account account = accountService.getAccountById(id);
        return account;
    }

}
