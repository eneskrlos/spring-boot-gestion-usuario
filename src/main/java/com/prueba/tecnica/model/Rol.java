package com.prueba.tecnica.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity 
@Table(name="rol")
public class Rol {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="role_name")
	private String role_name;
	
	@ManyToMany(mappedBy = "user_rol")
	private List<Usuario> user_rol = new ArrayList<>();;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getRole_name() {
		return role_name;
	}
	
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public List<Usuario> getUser_rol() {
		return user_rol;
	}

	public void setUser_rol(List<Usuario> user_rol) {
		this.user_rol = user_rol;
	}
	
	
}
