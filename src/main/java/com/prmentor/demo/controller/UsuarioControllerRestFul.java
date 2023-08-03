package com.prmentor.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<?> insertar(@RequestBody Usuario usuario) {
		// TODO Auto-generated method stub
		Usuario user = null;
		try {
			user = this.usuarioService.buscarPorCorreo(usuario.getCorreo());
		} catch (Exception e) {
			this.usuarioService.insertar(usuario);
			return new ResponseEntity<>(HttpStatus.OK);
		}

		HttpHeaders cabeceras = new HttpHeaders();
		cabeceras.add("detallemensaje", "Correo Ocupado");
		return new ResponseEntity<>(null, cabeceras, HttpStatus.CONFLICT);

	}

}
