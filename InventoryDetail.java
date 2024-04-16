package com.java.inventory.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@Table(name = "inventory_detail")
public class InventoryDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "detail")
    private String detail;

    @OneToOne
    @JoinColumn(name = "inventory_id")
    private Inventory inventory;

    public InventoryDetail(String detail) {
        this.detail = detail;
    }
}