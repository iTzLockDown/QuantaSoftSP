package com.QuantaSoftSP.app.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "xvi_finusuarios")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotEmpty(message = "No puede ser vacio.")
	@Size(min = 4, max = 30, message = "Tiene que ser mayor de 4 caracteres")
	@Column(nullable = false, length = 30)
	private String nombre;

	@NotEmpty(message = "No puede ser vacio.")
	@Size(min = 3, max = 30, message = "Tiene que ser mayor de 3 caracteres")
	@Column(nullable = false, length = 30)
	private String apellidop;

	@NotEmpty(message = "No puede ser vacio.")
	@Size(min = 3, max = 30, message = "Tiene que ser mayor de 3 caracteres")
	@Column(nullable = false, length = 30)
	private String apellidom;

	@NotEmpty(message = "No puede ser vacio.")
	@Size(max = 1)
	@Column(nullable = false, length = 1)
	private String sexo;

	@NotEmpty(message = "No puede ser vacio.")
	@Size(min = 8, max = 8, message = "Tiene que ser igual a 8 caracteres.")
	@Column(nullable = false, length = 8,unique = true)
	private String dni;

	@NotEmpty(message = "No puede ser vacio.")
	@Size(max = 50)
	@Column(nullable = false, length = 50)
	private String direccion;


	@Column(length = 12, unique = true)
	private String telefono;

	@NotEmpty(message = "No puede ser vacio.")
	@Email
	@Size(min = 12, max = 50, message = "Tiene que ser mayor de 12 caracteres")
	@Column(nullable = false, length = 50,unique = true)
	private String email;

	@NotEmpty
	@Size(min = 8, max = 25, message = "Tiene que ser mayor de 8 caracteres")
	@Column(nullable = false, length = 25)
	private String password;

	@NotEmpty
	@Size(max = 1)
	@Column(nullable = false, length = 1)
	private String estActivo;

	@NotNull(message = "No puede estar vacio")
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fechaNac;

	@NotNull(message = "No puede estar vacio")
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fechaReg;

	@NotNull(message = "El perfil no puede ser vacia.")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "perfil_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private PerfilesUsuario perfilUsuario;

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

	public String getApellidop() {
		return apellidop;
	}

	public void setApellidop(String apellidop) {
		this.apellidop = apellidop;
	}

	public String getApellidom() {
		return apellidom;
	}

	public void setApellidom(String apellidom) {
		this.apellidom = apellidom;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEstActivo() {
		return estActivo;
	}

	public void setEstActivo(String estActivo) {
		this.estActivo = estActivo;
	}

	public Date getFechaReg() {
		return fechaReg;
	}

	public void setFechaReg(Date fechaReg) {
		this.fechaReg = fechaReg;
	}

	public PerfilesUsuario getPerfilUsuario() {
		return perfilUsuario;
	}

	public void setPerfilUsuario(PerfilesUsuario perfilUsuario) {
		this.perfilUsuario = perfilUsuario;
	}
}