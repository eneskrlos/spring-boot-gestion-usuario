package com.prueba.tecnica.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.tecnica.model.Rol;

import com.prueba.tecnica.service.RolServicie;
import com.prueba.tecnica.util.request.RequestObject;
import com.prueba.tecnica.util.response.RolResponse;

@RestController
@RequestMapping("roles")
public class RolController {

	@Autowired
	private RolServicie rolservi;
	
	@PostMapping
	public ResponseEntity<RolResponse> addRol(@RequestBody Rol nuevorol){
		return rolservi.addRol(nuevorol);
	}
	
	@PostMapping(path = "/assign")
	public ResponseEntity<String> asignarRol(@RequestBody RequestObject obj ){
		return rolservi.asignarRol(obj.getIduser(), obj.getIdRol());
	}
}
