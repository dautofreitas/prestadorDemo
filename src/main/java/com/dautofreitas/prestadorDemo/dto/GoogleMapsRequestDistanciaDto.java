package com.dautofreitas.prestadorDemo.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GoogleMapsRequestDistanciaDto {
	
	private double latitudeAtual;
	private double longitudeAtual;
	List<GoogleMapsPontoDto> pontos;
	
}
