package com.prmentor.demo.service;

import com.prmentor.demo.repository.modelo.Usuario;

public interface IUsuarioService {
	
	public Usuario buscarPorId(Integer id);
	
	public void insertar(Usuario usuario);
	
	public Usuario buscarPorCorreo(String correo);
}
