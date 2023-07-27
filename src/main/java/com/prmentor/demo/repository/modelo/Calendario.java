package com.prmentor.demo.repository.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.cglib.core.Local;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "calendario")
public class Calendario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cale_id_seq")
	@SequenceGenerator(name = "cale_id_seq", sequenceName = "cale_id_seq", allocationSize = 1)
	@Column(name = "cale_id")
	private Integer id;
	@Column(name = "cale_fecha")

	private LocalDate fecha;
	@Column(name = "cale_inicio")

	private LocalDateTime inicio;
	@Column(name = "cale_fin")

	private LocalDateTime fin;
	
	@Column(name = "cale_descripcion")

	private String descripcion;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalDateTime getInicio() {
		return inicio;
	}

	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}

	public LocalDateTime getFin() {
		return fin;
	}

	public void setFin(LocalDateTime fin) {
		this.fin = fin;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Calendario [id=" + id + ", fecha=" + fecha + ", inicio=" + inicio + ", fin=" + fin + ", descripcion="
				+ descripcion + "]";
	}
	
	
	

}
