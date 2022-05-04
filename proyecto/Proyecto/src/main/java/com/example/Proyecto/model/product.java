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

    @Column(name = "product_picture", columnDefinition = "TEXT")
    private String product_picture;

    @Column(name = "marca",nullable = false)
    private String marca;

    @ManyToOne(optional = false)
    @JoinColumn(name = "cliente_rut", nullable = false)
    private user rut;


    public product() {
    }

    public product(Long id, String productName, int price, String product_picture, String marca, user rut) {
        this.id = id;
        ProductName = productName;
        Price = price;
        this.product_picture = product_picture;
        this.marca = marca;
        this.rut = rut;
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

    public String getProduct_picture() {
        return product_picture;
    }

    public void setProduct_picture(String product_picture) {
        this.product_picture = product_picture;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public user getRut() {
        return rut;
    }

    public void setRut(user rut) {
        this.rut = rut;
    }
}
