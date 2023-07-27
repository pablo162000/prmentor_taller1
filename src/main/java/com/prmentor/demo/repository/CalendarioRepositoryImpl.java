package com.prmentor.demo.repository;

import org.springframework.stereotype.Repository;

import com.prmentor.demo.repository.modelo.Calendario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class CalendarioRepositoryImpl implements ICalendarioRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void guardar(Calendario calendario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(calendario);

	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)

	public Calendario buscarPorId(Integer Id) {
		
		return this.entityManager.find(Calendario.class, Id);
		// TODO Auto-generated method stub

		
		
		
	}

}
