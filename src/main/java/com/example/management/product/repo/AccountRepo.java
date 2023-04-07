package com.example.management.product.repo;

import com.example.management.product.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountRepo {
    private List<Account> accountList;
    @Autowired
    Account account = new Account();
    public List<Account> getAllAccount(){
        return accountList;
    }
}
