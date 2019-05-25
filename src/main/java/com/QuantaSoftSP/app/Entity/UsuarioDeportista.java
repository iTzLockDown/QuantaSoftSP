package com.QuantaSoftSP.app.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="xvi_finusuario_deportistas")
public class UsuarioDeportista implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false, length = 30)
	private String pais;
	@Column(nullable = false, length = 30)
	private String deporte;
	@Column(nullable = false)
	private double altura;
	@Column(nullable = false)
	private double peso;
	@Column(length = 255)
	private String observacion;
	@Column(nullable = false, length = 10, unique = true)
	private long idUser;
	@Column(nullable = false, length = 1)
	private String estActivo;
	@Column(nullable = false)
	private Date fechaNac;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getDeporte() {
		return deporte;
	}
	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public long getIdUser() {
		return idUser;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	public String getEstActivo() {
		return estActivo;
	}
	public void setEstActivo(String estActivo) {
		this.estActivo = estActivo;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
}
