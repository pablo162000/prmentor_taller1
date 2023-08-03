package com.prmentor.demo.service;

import com.prmentor.demo.repository.modelo.Recurso;

public interface IRecursoService {
	
	public Recurso buscarPorId(Integer id);
	
	public void insertar(Recurso recurso);
}
