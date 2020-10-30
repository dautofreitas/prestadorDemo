package com.dautofreitas.prestadorDemo.integration;

import java.util.List;

import com.dautofreitas.prestadorDemo.dto.GoogleMapsRequestDistanciaDto;
import com.dautofreitas.prestadorDemo.dto.GoogleMapsResultDto;

public interface GoogleMapsIntegration {
	List<GoogleMapsResultDto> obterDistancias(GoogleMapsRequestDistanciaDto googleMapsRequestDistancia);
}
