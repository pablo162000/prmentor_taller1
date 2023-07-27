package com.prmentor.demo.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity(name = "Tutor")
@Table(name = "tutor")
public class Tutor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tutu_id_seq")
	@SequenceGenerator(name = "tuto_id_seq", sequenceName = "tuto_id_seq", allocationSize = 1)
	@Column(name = "tuto_id")
	private Integer id;
	
	@Column(name = "tuto_horario_disponible")
	private String horarioDisponible;
	
	//GET Y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHorarioDisponible() {
		return horarioDisponible;
	}

	public void setHorarioDisponible(String horarioDisponible) {
		this.horarioDisponible = horarioDisponible;
	}

	@Override
	public String toString() {
		return "Tutor [id=" + id + ", horarioDisponible=" + horarioDisponible + "]";
	}
	
	
}
