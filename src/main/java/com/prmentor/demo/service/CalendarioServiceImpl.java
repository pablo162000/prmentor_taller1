package com.prmentor.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prmentor.demo.repository.ICalendarioRepository;
import com.prmentor.demo.repository.modelo.Calendario;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Service
public class CalendarioServiceImpl implements ICalendarioService{
	
	@Autowired
	private ICalendarioRepository iCalendarioRepository;

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)

	public void guardar(Calendario calendario) {
		// TODO Auto-generated method stub
		this.iCalendarioRepository.guardar(calendario);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)

	public Calendario buscarPorId(Integer Id) {
		// TODO Auto-generated method stub
		return this.iCalendarioRepository.buscarPorId(Id);
	}

}
