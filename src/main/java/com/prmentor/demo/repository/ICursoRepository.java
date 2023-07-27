package com.prmentor.demo.repository;

import com.prmentor.demo.repository.modelo.Curso;

public interface ICursoRepository {
	
	public void guardar(Curso curso);
	public Curso buscarPorId(Integer Id);
	

}
