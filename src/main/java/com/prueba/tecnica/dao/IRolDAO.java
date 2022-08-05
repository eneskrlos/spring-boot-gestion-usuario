package com.prueba.tecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.tecnica.model.Rol;

public interface IRolDAO extends JpaRepository<Rol, Integer> {

}
