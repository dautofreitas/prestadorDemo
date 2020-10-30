package com.dautofreitas.prestadorDemo.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dautofreitas.prestadorDemo.dto.GoogleMapsPontoDto;
import com.dautofreitas.prestadorDemo.dto.GoogleMapsRequestDistanciaDto;
import com.dautofreitas.prestadorDemo.dto.GoogleMapsResultDto;
import com.dautofreitas.prestadorDemo.dto.PrestadorDto;
import com.dautofreitas.prestadorDemo.integration.GoogleMapsIntegration;
import com.dautofreitas.prestadorDemo.model.Prestador;
import com.dautofreitas.prestadorDemo.repository.PrestadorRepository;

@Service
public class PrestadorServiceImp implements PrestadorService {

	@Autowired
	private PrestadorRepository prestadorRepository;
	@Autowired
	private GoogleMapsIntegration googleMapsIntegration;
	@Override
	public List<PrestadorDto> obterPestadores(double latitude, double longitude, String especialidade) {		
		
		List<PrestadorDto> prestadoresResult = new ArrayList<>();
	
		List<Prestador> prestadores  = prestadorRepository.obterPorEspecialidade(especialidade);
		
		List<GoogleMapsPontoDto> pontos = prestadores.stream().map(p -> { return new GoogleMapsPontoDto(p.getId(),p.getLatitude(),p.getLongitude());}).collect(Collectors.toList());
		GoogleMapsRequestDistanciaDto googleMapsRequestDistancia = new  GoogleMapsRequestDistanciaDto(latitude,longitude,pontos );
		
		List<GoogleMapsResultDto> googleMapsResult =  googleMapsIntegration.obterDistancias(googleMapsRequestDistancia);
		
		prestadoresResult = obterOperadoresResult(prestadores, googleMapsResult);
		
		prestadoresResult = ordenarPorDistancia(prestadoresResult);
		
		return prestadoresResult;
	}

	private List<PrestadorDto> obterOperadoresResult(List<Prestador> prestadores,
			List<GoogleMapsResultDto> googleMapsResult) {
		
		return googleMapsResult.stream()
				.filter(p -> prestadores.stream().anyMatch( g -> p.getId()== g.getId()))
				.map(g -> { 			
					Prestador prestador =  prestadores.stream().filter(p -> p.getId()==g.getId()).findFirst().get();		
					return new PrestadorDto(prestador.getNome(),prestador.getEndereco(),prestador.getLatitude(), prestador.getLongitude(),g.getDistancia());
			
				}).collect(Collectors.toList());
	}

	private List<PrestadorDto> ordenarPorDistancia(List<PrestadorDto> prestadores) {
		return prestadores.stream().sorted(Comparator.comparing(PrestadorDto::getDistanciaEmKM)).collect(Collectors.toList());
	}

}
