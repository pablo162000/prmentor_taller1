package com.prmentor.demo.repository;

import org.springframework.stereotype.Repository;

import com.prmentor.demo.repository.modelo.Tutor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class TutorRepositoryImpl implements ITutorRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Tutor buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Tutor.class, id);
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(Tutor tutor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(tutor);
	}
	
}
