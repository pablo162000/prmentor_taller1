package com.prmentor.demo.repository;

import com.prmentor.demo.repository.modelo.Tutor;

public interface ITutorRepository {
	public Tutor buscarPorId(Integer id);
	
	public void insertar(Tutor tutor);
}
