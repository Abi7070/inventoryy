package com.java.inventory.model;

import lombok.Data;
import lombok.NoArgsConstructor;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@Table(name = "inventory_transaction")
public class InventoryTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "type")
    private String type;

    @ManyToOne
    @JoinColumn(name = "inventory_id")
    private Inventory inventory;

    public InventoryTransaction(String type) {
        this.type = type;
    }
}