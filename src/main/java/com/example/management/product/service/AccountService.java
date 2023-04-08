package com.example.management.product.service;

import com.example.management.product.model.Account;

import java.util.List;

public interface AccountService {
    public Account addAccount(Account account);
    public List<Account> getAllAccount();
}
