package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    private String nombre;
    private String celDuenio;

    public Duenio() {
    }

    public Duenio(int id, String nombre, String celDuenio) {
        this.id = id;
        this.nombre = nombre;
        this.celDuenio = celDuenio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCelDuenio() {
        return celDuenio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }

    @Override
    public String toString() {
        return "Duenio{" + "id=" + id + ", nombre=" + nombre + ", celDuenio=" + celDuenio + '}';
    }

}
