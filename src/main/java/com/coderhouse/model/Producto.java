package com.coderhouse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTOS")
public class Producto {

    @Id
    @Column(name = "IDPROD")
    private Integer idprod;

    @Column(name = "MODELO")
    private String modelo;

    @Column(name = "PRECIO")
    private int precio;

    @Column(name = "STOCK")
    private int stock;

    public Producto() {
    }

    public Producto(Integer idprod, String modelo, int precio, int stock) {
        this.idprod = idprod;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
    }

    //getters+setters

    public Integer getIdprod() {
        return idprod;
    }

    public void setIdprod(Integer idprod) {
        this.idprod = idprod;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
