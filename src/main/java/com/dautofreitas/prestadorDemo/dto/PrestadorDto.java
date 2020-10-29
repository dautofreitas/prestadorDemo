package com.dautofreitas.prestadorDemo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class PrestadorDto {
	private String nome;
	private String endereco;
	private double latitude;
	private double longitude;
	private double distanciaEmKM;
}
