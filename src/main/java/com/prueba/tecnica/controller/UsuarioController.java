package com.prueba.tecnica.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.tecnica.model.Usuario;
import com.prueba.tecnica.service.UsuarioService;
import com.prueba.tecnica.util.response.UserResponse;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioServicio;
	
	@PostMapping
	public ResponseEntity<UserResponse> crearUsuario(@RequestBody Usuario nuevouser) {
		return usuarioServicio.addUsuario(nuevouser);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<String> crearUsuario(@PathVariable("id") Integer id) {
		return usuarioServicio.deleteUsuario(id);
	}
}
