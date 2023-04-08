package com.example.management.product.model;

import jakarta.persistence.*;

@Entity
@Table (name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String accountUsername;
    @Column(name = "password")
    private String accountPassword;

    public Account(String accountUsername, String accountPassword) {
        this.accountUsername = accountUsername;
        this.accountPassword = accountPassword;
    }

    public Account(){
    }

    public String getAccountUsername() {
        return accountUsername;
    }

    public void setAccountUsername(String accountUsername) {
        this.accountUsername = accountUsername;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }
}
