package com.prueba.tecnica.dao;



import org.springframework.data.jpa.repository.JpaRepository;


import com.prueba.tecnica.model.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Integer> {

	
}
