package com.dautofreitas.prestadorDemo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Prestador {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;	
	@OneToMany
	private List<Especialidade> especialidades;	
	private String endereco;
	private double latitude;
	private double longitude;
}
