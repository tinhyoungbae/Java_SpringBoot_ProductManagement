package com.example.management.product.service;

import com.example.management.product.model.Item;
import com.example.management.product.repo.itemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class itemService implements itemServiceInterface{
    @Autowired
    private itemRepo itemRepo;

    @Override
    public Item addItem(Item item) {
        if(item != null){
            return itemRepo.save(item);
        }
        return null;
    }

    @Override
    public List<Item> getAllItem() {
        return itemRepo.findAll();
    }
}
