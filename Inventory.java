package com.java.inventory.model;
import lombok.NoArgsConstructor;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.List;


@Entity
@NoArgsConstructor
@Table(name = "inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "symbol")
    private String symbol;

    @Column(name = "price")
    private double price;

    @OneToOne(mappedBy = "inventory", cascade = CascadeType.ALL)
    private InventoryDetail inventoryDetail;

    @OneToMany(mappedBy = "inventory", cascade = CascadeType.ALL)
    private List<InventoryTransaction> transactions;

    public Inventory(Integer id, String symbol, double price) {
        this.id = id;
        this.symbol = symbol;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public InventoryDetail getInventoryDetail() {
        return inventoryDetail;
    }

    public void setInventoryDetail(InventoryDetail inventoryDetail) {
        this.inventoryDetail = inventoryDetail;
    }

    public List<InventoryTransaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<InventoryTransaction> transactions) {
        this.transactions = transactions;
    }

    
}







// package com.java.inven.model;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;

// import lombok.Data;
// import lombok.NoArgsConstructor;

// @Data
// @Entity
// @NoArgsConstructor
// public class Inventory {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     @Column(name="id")
//     private Integer inventoryId;
//     @Column(name="itemName")
//     private String itemName;
//     @Column(name="description")
//     private String itemDescription;
//     @Column(name="brand")
//     private String itemBrand;
//     @Column(name="manufacturedIn")
//     private String manufacturedIn;
//     @Column(name="price")
//     private double itemPrice;
//     @Column(name="expiryDate")
//     private String expiryDate;

//     public Inventory(Integer inventoryId, String itemName, String itemDescription, String itemBrand,
//             String manufacturedIn, double itemPrice, String expiryDate) {
//         this.inventoryId = inventoryId;
//         this.itemName = itemName;
//         this.itemDescription = itemDescription;
//         this.itemBrand = itemBrand;
//         this.manufacturedIn = manufacturedIn;
//         this.itemPrice = itemPrice;
//         this.expiryDate = expiryDate;
//     }
    
//     // Getters and setters omitted for brevity
// }