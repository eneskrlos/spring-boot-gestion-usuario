package com.prueba.tecnica;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.prueba.tecnica.dao.IUsuarioDAO;
import com.prueba.tecnica.model.Usuario;



@SpringBootTest
class ControlUserApiApplicationTests {

	
	@Autowired
	private IUsuarioDAO dao;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Test
	void conrearUsuario() {
		Usuario us = new Usuario();
		us.setName("Administrador");
		us.setUsername("admin1");
		us.setPassword(encoder.encode("admin1"));
		Usuario retornado =  dao.save(us);
		
		assertTrue(retornado.getPassword().equals(us.getPassword()));
	}

}
