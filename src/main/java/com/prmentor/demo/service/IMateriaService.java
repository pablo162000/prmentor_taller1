package com.prmentor.demo.service;

import com.prmentor.demo.repository.modelo.Materia;

public interface IMateriaService {
	

	public void guardar(Materia materia);
	public Materia buscarPorId(Integer Id);
	

}
