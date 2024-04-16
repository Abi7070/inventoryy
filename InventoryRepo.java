package com.java.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.inventory.model.Inventory;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory, Integer> {
}