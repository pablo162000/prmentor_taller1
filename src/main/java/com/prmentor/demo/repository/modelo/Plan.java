package com.prmentor.demo.repository.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "plan")
public class Plan {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "plan_id_seq")
	@SequenceGenerator(name = "plan_id_seq", sequenceName = "plan_id_seq", allocationSize = 1)
	@Column(name = "plan_id")

	private Integer id;
	@Column(name = "plan_inicio")

	private LocalDateTime inicio;
	@Column(name = "plan_fin")

	private LocalDateTime fin;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Plan [id=" + id + ", inicio=" + inicio + ", fin=" + fin + "]";
	}
	
	
	
	

}
