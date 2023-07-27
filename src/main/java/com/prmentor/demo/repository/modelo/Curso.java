package com.prmentor.demo.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "curs_id_seq")
	@SequenceGenerator(name = "curs_id_seq", sequenceName = "curs_id_seq", allocationSize = 1)
	@Column(name = "curs_id")
	private Integer id;
	@Column(name = "curs_horario")

	private String horario;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	@Override
	public String toString() {
		return "Curso [id=" + id + ", horario=" + horario + "]";
	}
	
	
	
	

}
