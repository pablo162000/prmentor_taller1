package com.prmentor.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prmentor.demo.repository.IUsuarioRepository;
import com.prmentor.demo.repository.modelo.Usuario;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioRepository iUsuarioRepository;
	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)

	public Usuario buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iUsuarioRepository.buscarPorId(id);
	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)

	public void insertar(Usuario usuario) {
		// TODO Auto-generated method stub
		 this.iUsuarioRepository.insertar(usuario);
	}

	@Override
	public Usuario buscarPorCorreo(String correo) {
		// TODO Auto-generated method stub
		return this.iUsuarioRepository.buscarPorCorreo(correo);
	}

}
