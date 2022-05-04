package com.example.Proyecto.model;


import javax.persistence.*;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Locale;

@Entity
public class compras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "precio", nullable = false, unique = true)
    private int precio;

    @Column(name = "compra_fecha")
    private Timestamp comprafecha;

    @ManyToOne(optional = false)
    @JoinColumn(name = "usuario_id", nullable = false)
    private user usuario;

    @ManyToOne(optional = false)
    @JoinColumn(name = "producto_id", nullable = false)
    private product producto;


    public compras() {
    }

    public compras(Long id, int precio, Timestamp comprafecha, user usuario, product producto) {
        this.id = id;
        this.precio = precio;
        this.comprafecha = comprafecha;
        this.usuario = usuario;
        this.producto = producto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Timestamp getComprafecha() {
        return comprafecha;
    }

    public String getFormatDate() {
        return DateFormat
                .getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT, new Locale("es", "CL"))
                .format(getComprafecha());
    }

    public void setComprafecha(Timestamp comprafecha) {
        this.comprafecha = comprafecha;
    }

    public user getUsuario() {
        return usuario;
    }

    public void setUsuario(user usuario) {
        this.usuario = usuario;
    }

    public product getProducto() {
        return producto;
    }

    public void setProducto(product producto) {
        this.producto = producto;
    }
}
