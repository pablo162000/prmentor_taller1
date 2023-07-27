package com.prmentor.demo.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity(name = "Recurso")
@Table(name = "recurso")
public class Recurso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recu_id_seq")
	@SequenceGenerator(name = "recu_id_seq", sequenceName = "recu_id_seq", allocationSize = 1)
	@Column(name = "recu_id")
	private Integer id;
	
	@Column(name = "recu_tipo")
	private String tipo;
	
	@Column(name = "recu_nombre")
	private String nombre;
	
	@Column(name = "recu_ruta")
	private String ruta;
	
	//SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	@Override
	public String toString() {
		return "Recurso [id=" + id + ", tipo=" + tipo + ", nombre=" + nombre + ", ruta=" + ruta + "]";
	}
	
	
	
}
