package com.dautofreitas.prestadorDemo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Prestador {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;	
	private String nome;
	@ManyToMany
	private List<Especialidade> especialidades;	
	private String endereco;
	private double latitude;
	private double longitude;
}
