package com.example.Proyecto.model;

import javax.persistence.*;

@Entity
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "username", nullable = false, unique = true, length = 50)
    private String username;

    @Column(name = "password", nullable = false, unique = true, length = 70)
    private String password;

    @Column(name= "Correo", nullable = false, unique = true, length = 80)
    private String correo;

    @Column(name = "rut", nullable = false, unique = true, length = 50)
    private int rut;



    public user() {

    }

    public user(Long id, String username, String password, String correo, int rut) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.correo = correo;
        this.rut = rut;
    }

    public user(String username, String password, String correo, int rut) {
        this.username = username;
        this.password = password;
        this.correo = correo;
        this.rut = rut;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }
}
