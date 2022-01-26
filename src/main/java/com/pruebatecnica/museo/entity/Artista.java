package com.pruebatecnica.museo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="artista")
public class Artista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="tipo_ide", length = 5)
	private String tipo_ide;
	
	@Column(name="numero_ide", length = 20)
	private String numero_ide;
	
	@Column(name="nombres", length = 30)
	private String nombres;
	
	@Column(name="apellidos", length = 30)
	private String apellidos;
	
	//Getters y Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo_ide() {
		return tipo_ide;
	}

	public void setTipo_ide(String tipo_ide) {
		this.tipo_ide = tipo_ide;
	}

	public String getNumero_ide() {
		return numero_ide;
	}

	public void setNumero_ide(String numero_ide) {
		this.numero_ide = numero_ide;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
}
