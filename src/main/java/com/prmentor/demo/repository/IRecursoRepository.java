package com.prmentor.demo.repository;

import com.prmentor.demo.repository.modelo.Recurso;

public interface IRecursoRepository {
	
	public Recurso buscarPorId(Integer id);
	
	public void insertar(Recurso recurso);
}
