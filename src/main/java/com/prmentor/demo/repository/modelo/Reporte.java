package com.prmentor.demo.repository.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "reporte")
public class Reporte {
	
	@Id
	@Column(name ="repo_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "repo_id_seq")
	@SequenceGenerator(name = "repo_id_seq", sequenceName = "repo_id_seq", allocationSize = 1)
	private Integer id;
	@Column(name ="repo_fecha")
	private LocalDate fecha;
	@Column(name ="repo_horario_cumplido")
	private LocalDateTime horarioCumplido;
	@Column(name ="repo_asistencia_tutor")
	private Integer asistenciaTutor;
	
	
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
	public LocalDateTime getHorarioCumplido() {
		return horarioCumplido;
	}
	public void setHorarioCumplido(LocalDateTime horarioCumplido) {
		this.horarioCumplido = horarioCumplido;
	}
	public Integer getAsistenciaTutor() {
		return asistenciaTutor;
	}
	public void setAsistenciaTutor(Integer asistenciaTutor) {
		this.asistenciaTutor = asistenciaTutor;
	}
	@Override
	public String toString() {
		return "Reporte [id=" + id + ", fecha=" + fecha + ", horarioCumplido=" + horarioCumplido + ", asistenciaTutor="
				+ asistenciaTutor + "]";
	}
	
	

}
