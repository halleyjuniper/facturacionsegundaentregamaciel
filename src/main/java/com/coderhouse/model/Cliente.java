package com.coderhouse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="CLIENTES")
public class Cliente {
    @Id
    @Column(name="IDCLIENT")
    private Integer idclient;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name="APELLIDO")
    private String apellido;

    @Column(name= "FECHA")
    private Date fecha;

    // constructors

    public Cliente() {
    }

    public Cliente(Integer idclient, String nombre, String apellido, Date fecha) {
        this.idclient = idclient;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
    }

    // getters+setters

    public Integer getIdclient() {
        return idclient;
    }

    public void setIdclient(Integer idclient) {
        this.idclient = idclient;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
