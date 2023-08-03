package com.prmentor.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prmentor.demo.repository.ICursoRepository;
import com.prmentor.demo.repository.modelo.Curso;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Service
public class CursoServiceImpl implements ICursoService{

	@Autowired
	private ICursoRepository iCursoRepository;
	
	@Override
	@Transactional(value = TxType.REQUIRES_NEW)

	public void guardar(Curso curso) {
		// TODO Auto-generated method stub
		this.iCursoRepository.guardar(curso);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)

	public Curso buscarPorId(Integer Id) {
		// TODO Auto-generated method stub
		return this.buscarPorId(Id);
	}

}
