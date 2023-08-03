package com.prmentor.demo.service;

import com.prmentor.demo.repository.modelo.Tutor;

public interface ITutorService {
	public Tutor buscarPorId(Integer id);
	
	public void insertar(Tutor tutor);
}
