package com.prmentor.demo.service;

import com.prmentor.demo.repository.modelo.Curso;

public interface ICursoService {
	
	public void guardar(Curso curso);
	public Curso buscarPorId(Integer Id);
	

}
