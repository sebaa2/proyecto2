package com.example.Proyecto.model;

import javax.persistence.*;


@Entity
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "ProductName", nullable = false, unique = true, length = 50)
    private String ProductName;

    @Column(name = "Price", nullable = false, unique = true, length = 50)
    private int Price;


    public product() {
    }

    public product(Long id, String productName, int price) {
        this.id = id;
        this.ProductName = productName;
        this.Price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
