package com.prmentor.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prmentor.demo.repository.IMateriaRepository;
import com.prmentor.demo.repository.modelo.Materia;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Service
public class MateriaServiceImpl implements IMateriaService {
	
	@Autowired
	private IMateriaRepository iMateriaRepository;

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)

	public void guardar(Materia materia) {
		// TODO Auto-generated method stub
		this.iMateriaRepository.guardar(materia);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)

	public Materia buscarPorId(Integer Id) {
		// TODO Auto-generated method stub
		return this.iMateriaRepository.buscarPorId(Id);
	}

}
