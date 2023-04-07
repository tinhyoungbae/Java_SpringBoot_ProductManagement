package com.example.management.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.management.product.service.loginService;

@Controller
public class Login {
    @GetMapping("/login")
    public boolean loginController(String username, String password) {
        return loginService.loginServices(username, password);
    }

}
