package com.example.management.product.repo;

import com.example.management.product.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface itemRepo extends JpaRepository<Item, Integer> {
}
