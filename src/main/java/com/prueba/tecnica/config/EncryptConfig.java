package com.prueba.tecnica.config;


import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.prueba.tecnica.utilencrypt.EncryptService;


public class EncryptConfig {

	
	@Bean
	BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bcryptpass = new BCryptPasswordEncoder();
		return bcryptpass;
	}
	
	@Bean
	EncryptService encode() {
		EncryptService es = new EncryptService();
		return es;
	}
}
