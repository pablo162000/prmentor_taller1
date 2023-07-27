package com.prmentor.demo.repository;

import org.springframework.stereotype.Repository;

import com.prmentor.demo.repository.modelo.Comentario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class ComentarioRepositoryImpl implements IComentarioRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Comentario buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Comentario.class, id);
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void insertar(Comentario comentario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(comentario);
	}
	
}
