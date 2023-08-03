package com.prmentor.demo.service;

import com.prmentor.demo.repository.modelo.Plan;

public interface IPlanService {
	

	public void guardar(Plan plan);
	public Plan buscarPorId(Integer Id);
	

}
