package com.example.management.product.service;

import com.example.management.product.model.Item;

import java.util.List;

public interface itemServiceInterface {
    public Item addItem(Item item);
    public List<Item> getAllItem();
}
