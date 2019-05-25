package com.QuantaSoftSP.app.Entity;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "xvi_finperfilesusuarios")
public class PerfilesUsuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, length = 255)
    private String descripcion;
    @Column(nullable = false, length = 1)
    private String estActivo;




    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getEstActivo() {
        return estActivo;
    }
    public void setEstActivo(String estActivo) {
        this.estActivo = estActivo;
    }
}