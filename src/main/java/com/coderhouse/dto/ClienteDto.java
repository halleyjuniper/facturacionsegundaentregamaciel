package com.coderhouse.dto;

public class ClienteDto {

    private int idclient;
    private String nombre;
    private String apellido;
    private int edad;

    // constructors

    public ClienteDto(int idclient, String nombre, String apellido, int edad) {
        this.idclient = idclient;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public ClienteDto() {
    }

    // getters+setters

    public int getIdclient() {
        return idclient;
    }

    public void setIdclient(int idclient) {
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
