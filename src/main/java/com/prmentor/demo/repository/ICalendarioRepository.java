package com.prmentor.demo.repository;

import com.prmentor.demo.repository.modelo.Calendario;

public interface ICalendarioRepository {
	public void guardar(Calendario calendario);
	public Calendario buscarPorId(Integer Id);

}
