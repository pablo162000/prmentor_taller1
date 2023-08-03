package com.prmentor.demo.repository;

import org.springframework.stereotype.Repository;

import com.prmentor.demo.repository.modelo.Plan;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Transactional
@Repository
public class PlanRepositoryImpl implements IPlanRepository {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(value = TxType.MANDATORY)
	public void guardar(Plan plan) {
		// TODO Auto-generated method stub
		this.entityManager.persist(plan);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Plan buscarPorId(Integer Id) {
		return this.entityManager.find(Plan.class, Id);
		// TODO Auto-generated method stub
		
	}

}
