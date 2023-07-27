package com.prmentor.demo.repository;

import com.prmentor.demo.repository.modelo.Comentario;

public interface IComentarioRepository {
	
	public Comentario buscarPorId(Integer id);
	
	public void insertar(Comentario comentario);
}
