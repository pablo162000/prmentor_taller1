package com.prmentor.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prmentor.demo.repository.modelo.Usuario;
import com.prmentor.demo.service.IUsuarioService;

@RestController
@RequestMapping("/authUsuarios")
@CrossOrigin
public class AuthControllerRestFul {
	
	@Autowired
	private IUsuarioService usuarioService;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> insertar(@RequestBody Usuario usuario) {
		System.out.println("Ingreso a comprobar");
		String correo = usuario.getCorreo();
		String contrasenia = usuario.getContraseña();
		System.out.println("correo: "+correo);
		Usuario usuarioAuth = this.usuarioService.buscarPorCorreo(correo);

		if (usuarioAuth == null || !usuarioAuth.getContraseña().equals(contrasenia)) {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}


}
