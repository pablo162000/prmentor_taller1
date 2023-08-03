package com.prmentor.demo.service;

import org.springframework.stereotype.Service;

import com.prmentor.demo.repository.ITutorRepository;
import com.prmentor.demo.repository.modelo.Tutor;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Service
public class TutorServiceImpl implements ITutorService{

	private ITutorRepository iTutorRepository;
	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)

	public Tutor buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iTutorRepository.buscarPorId(id);
	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)

	public void insertar(Tutor tutor) {
		// TODO Auto-generated method stub
		this.iTutorRepository.insertar(tutor);
	}

}
