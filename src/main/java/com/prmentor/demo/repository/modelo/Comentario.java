package com.prmentor.demo.repository.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity(name = "Comentario")
@Table(name = "comentario")
public class Comentario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "come_id_seq")
	@SequenceGenerator(name = "come_id_seq", sequenceName = "come_id_seq", allocationSize = 1)
	@Column(name = "come_id")
	private Integer id;
	
	@Column(name = "come_comentario")
	private String comentario;
	
	@Column(name = "come_valoracion")
	private Integer valoracion;
	
	@Column(name = "come_fecha")
	private LocalDateTime fecha;
	
	//SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Integer getValoracion() {
		return valoracion;
	}

	public void setValoracion(Integer valoracion) {
		this.valoracion = valoracion;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Comentario [id=" + id + ", comentario=" + comentario + ", valoracion=" + valoracion + ", fecha=" + fecha
				+ "]";
	}
	
	
	
}
