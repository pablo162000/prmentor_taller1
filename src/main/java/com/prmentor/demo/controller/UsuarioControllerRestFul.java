package com.prmentor.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.prmentor.demo.repository.modelo.Usuario;
import com.prmentor.demo.service.IUsuarioService;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin
public class UsuarioControllerRestFul {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public Usuario buscarPorId(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		return this.usuarioService.buscarPorId(id);
	} 
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)

	public void insertar(@RequestBody Usuario usuario) {
		// TODO Auto-generated method stub
		this.usuarioService.insertar(usuario);
	} 
	
	
}
