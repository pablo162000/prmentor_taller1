package com.prmentor.demo.service;

import com.prmentor.demo.repository.modelo.Reporte;

public interface IReporteService {
	

	public void guardar(Reporte reporte);
	public Reporte buscarPorId(Integer Id);
	
	


}
