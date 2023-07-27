package com.prmentor.demo.repository;

import org.springframework.stereotype.Repository;

import com.prmentor.demo.repository.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Transactional
@Repository
public class MateriaRepositoryImpl implements IMateriaRepository {

	
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	@Transactional(value = TxType.REQUIRED)

	public void guardar(Materia materia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(materia);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)

	public Materia buscarPorId(Integer Id) {
		return this.entityManager.find(Materia.class, Id);
		// TODO Auto-generated method stub
		
	}

}
