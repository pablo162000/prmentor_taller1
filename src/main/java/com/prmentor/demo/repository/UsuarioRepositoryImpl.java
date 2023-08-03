package com.prmentor.demo.repository;

import org.springframework.stereotype.Repository;

import com.prmentor.demo.repository.modelo.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class UsuarioRepositoryImpl implements IUsuarioRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Usuario buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Usuario.class, id);
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(Usuario usuario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(usuario);
	}

}
