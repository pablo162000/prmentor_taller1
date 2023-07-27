package com.prmentor.demo.repository;

import org.springframework.stereotype.Repository;

import com.prmentor.demo.repository.modelo.Curso;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Transactional
@Repository
public class CursoRepositoryImpl implements ICursoRepository {

	
	
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	@Transactional(value = TxType.REQUIRED)

	public void guardar(Curso curso) {
		// TODO Auto-generated method stub
		this.entityManager.persist(curso);
		
	}

	@Override
	@Transactional(value = TxType.MANDATORY)

	public Curso buscarPorId(Integer Id) {
		return this.entityManager.find(Curso.class, Id);
		// TODO Auto-generated method stub
		
	}

}
