package com.prmentor.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prmentor.demo.repository.IRecursoRepository;
import com.prmentor.demo.repository.modelo.Recurso;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Service
public class RecursoServiceImpl implements IRecursoService{

	@Autowired
	private IRecursoRepository iRecursoRepository;
	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)

	public Recurso buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iRecursoRepository.buscarPorId(id);
	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)

	public void insertar(Recurso recurso) {
		// TODO Auto-generated method stub
		this.iRecursoRepository.insertar(recurso);
	}

}
