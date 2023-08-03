package com.prmentor.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prmentor.demo.repository.IComentarioRepository;
import com.prmentor.demo.repository.modelo.Comentario;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Service
public class ComentarioServiceImpl implements IComentarioService {

	@Autowired
	private IComentarioRepository iComentarioRepository;
	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)

	public Comentario buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iComentarioRepository.buscarPorId(id);
	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)

	public void insertar(Comentario comentario) {
		// TODO Auto-generated method stub
		this.iComentarioRepository.insertar(comentario);
	}

}
