package com.example.management.product.model;

import jakarta.persistence.Entity;

@Entity
public class Item {
    private int itemID;
    private String itemName;
    private float itemPrice;
    private String itemDetail;

    public Item(){

    }

    public Item(int itemID, String itemName, float itemPrice, String itemDetail) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDetail = itemDetail;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDetail() {
        return itemDetail;
    }

    public void setItemDetail(String itemDetail) {
        this.itemDetail = itemDetail;
    }
}
