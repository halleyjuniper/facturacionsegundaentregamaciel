package com.coderhouse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "RECIBO")
public class Recibo {

    @Id
    @Column(name = "IDRECIBO")
    private Integer idrecibo;

    @Column(name = "IDCLIENT")
    private int idclient;

    @Column(name = "CANTIDAD")
    private int cantidad;

    @Column(name = "FECHA")
    private Date fecha;

    @Column(name = "TOTAL")
    private int total;

    //constructors

    public Recibo() {
    }

    public Recibo(Integer idrecibo, int idclient, int cantidad, Date fecha, int total) {
        this.idrecibo = idrecibo;
        this.idclient = idclient;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.total = total;
    }

    //getters+setters

    public Integer getIdrecibo() {
        return idrecibo;
    }

    public void setIdrecibo(Integer idrecibo) {
        this.idrecibo = idrecibo;
    }

    public int getIdclient() {
        return idclient;
    }

    public void setIdclient(int idclient) {
        this.idclient = idclient;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
