package com.prmentor.demo.repository;

import org.springframework.stereotype.Repository;

import com.prmentor.demo.repository.modelo.Recurso;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class RecursoRepositoryImpl implements IRecursoRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Recurso buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Recurso.class, id);
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(Recurso recurso) {
		// TODO Auto-generated method stub
		this.entityManager.persist(recurso);
	}
	
	
}
