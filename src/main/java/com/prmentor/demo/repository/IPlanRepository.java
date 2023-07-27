package com.prmentor.demo.repository;

import com.prmentor.demo.repository.modelo.Plan;

public interface IPlanRepository {
	

	public void guardar(Plan plan);
	public Plan buscarPorId(Integer Id);
	

}
