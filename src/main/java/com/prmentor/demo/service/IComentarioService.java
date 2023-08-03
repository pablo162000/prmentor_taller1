package com.prmentor.demo.service;

import com.prmentor.demo.repository.modelo.Comentario;

public interface IComentarioService {
	
	public Comentario buscarPorId(Integer id);
	
	public void insertar(Comentario comentario);
}
