package com.prmentor.demo.repository;

import com.prmentor.demo.repository.modelo.Materia;

public interface IMateriaRepository {
	

	public void guardar(Materia materia);
	public Materia buscarPorId(Integer Id);
	

}
