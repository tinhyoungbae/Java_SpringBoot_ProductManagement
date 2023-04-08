package com.example.management.product.controller;

import com.example.management.product.model.Account;
import com.example.management.product.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.management.product.service.itemServiceInterface;

import java.util.List;

@RestController
@RequestMapping("/item")
public class itemController {
    @Autowired
    private itemServiceInterface itemServiceInterface;
    @GetMapping("/a")
    public String a(){
        return "a";
    }

    @PostMapping("/additem")
    public Item addItem(@RequestBody Item item){
        return itemServiceInterface.addItem(item);
    }

    @GetMapping("/viewitem")
    public List<Item> getAllItem(){
        return itemServiceInterface.getAllItem();
    }
}
