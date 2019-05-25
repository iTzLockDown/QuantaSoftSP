package com.QuantaSoftSP.app.Entity;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "xvi_finsponsor")
public class Sponsor implements Serializable {

    private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
   @Column(nullable = false)
    private String nombre;
   @Column(nullable = false, unique = true)
    private String marca;
    @Column(unique =true)
    private String pagWeb;
    private String vidSponsor;
    private String imgSponsor;
    @Column(nullable = false, length = 1)
    private String estActivo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPagWeb() {
        return pagWeb;
    }

    public void setPagWeb(String pagWeb) {
        this.pagWeb = pagWeb;
    }

    public String getVidSponsor() {
        return vidSponsor;
    }

    public void setVidSponsor(String vidSponsor) {
        this.vidSponsor = vidSponsor;
    }

    public String getImgSponsor() {
        return imgSponsor;
    }

    public void setImgSponsor(String imgSponsor) {
        this.imgSponsor = imgSponsor;
    }

    public String getEstActivo() {
        return estActivo;
    }

    public void setEstActivo(String estActivo) {
        this.estActivo = estActivo;
    }
}
