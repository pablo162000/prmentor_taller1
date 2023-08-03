package com.prmentor.demo.service;

import com.prmentor.demo.repository.modelo.Calendario;

public interface ICalendarioService {
	public void guardar(Calendario calendario);
	public Calendario buscarPorId(Integer Id);

}
