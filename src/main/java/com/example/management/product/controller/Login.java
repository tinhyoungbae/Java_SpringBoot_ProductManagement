package com.example.management.product.controller;

import com.example.management.product.model.Account;
import com.example.management.product.service.AccountService;
import com.example.management.product.service.AccoutServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class Login {
    @Autowired
    AccountService accountService;
    @GetMapping("/")
    public String noti(){
        return "hello";
    }

    @PostMapping("/add")
    public Account addAccount(@RequestBody Account account){
        return  accountService.addAccount(account);
    }

    @GetMapping("/view")
    public List<Account> getAllAccount(){
        return accountService.getAllAccount();
    }

}
