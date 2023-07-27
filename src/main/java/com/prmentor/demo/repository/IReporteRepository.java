package com.prmentor.demo.repository;

import com.prmentor.demo.repository.modelo.Reporte;

public interface IReporteRepository {
	

	public void guardar(Reporte reporte);
	public Reporte buscarPorId(Integer Id);
	
	


}
