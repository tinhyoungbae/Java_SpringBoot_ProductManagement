package com.example.management.product.service;

import com.example.management.product.model.Account;
import com.example.management.product.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccoutServiceImp implements AccountService{
    @Autowired
    private AccountRepo accountRepo;
    @Override
    public Account addAccount(Account account) {
        if(account != null){
            return accountRepo.save(account);
        }
        return null;
    }

    @Override
    public List<Account> getAllAccount() {
        return accountRepo.findAll();
    }
}
