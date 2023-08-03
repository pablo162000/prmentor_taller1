package com.prmentor.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prmentor.demo.repository.IReporteRepository;
import com.prmentor.demo.repository.modelo.Reporte;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Service
public class ReporteServiceImpl implements IReporteService{

	@Autowired
	private IReporteRepository iReporteRepository;
	@Override
	@Transactional(value = TxType.REQUIRES_NEW)

	public void guardar(Reporte reporte) {
		// TODO Auto-generated method stub
	this.iReporteRepository.guardar(reporte);
	}

	@Override
	public Reporte buscarPorId(Integer Id) {
		// TODO Auto-generated method stub
		return this.iReporteRepository.buscarPorId(Id);
	}

}
