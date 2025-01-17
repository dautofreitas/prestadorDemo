package com.dautofreitas.prestadorDemo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Especialidade {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	
	private String nome;
}
