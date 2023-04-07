package com.example.management.product.service;

import org.springframework.stereotype.Service;

@Service
public class loginService {
    public static boolean loginServices(String username, String password){
        if(username.contains("") && password.contains("")){
            return true;
        } else{
            return false;
        }
    }
}
