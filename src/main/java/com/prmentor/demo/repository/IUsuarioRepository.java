package com.prmentor.demo.repository;

import com.prmentor.demo.repository.modelo.Usuario;

public interface IUsuarioRepository {
	
	public Usuario buscarPorId(Integer id);
	
	public void insertar(Usuario usuario);
	
	public Usuario buscarPorCorreo(String correo);
}
