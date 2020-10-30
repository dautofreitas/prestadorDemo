package com.dautofreitas.prestadorDemo.integration;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.dautofreitas.prestadorDemo.dto.GoogleMapsRequestDistanciaDto;
import com.dautofreitas.prestadorDemo.dto.GoogleMapsResultDto;

@Service
public class GoogleMapsIntegrationImp implements GoogleMapsIntegration {

	@Override
	public List<GoogleMapsResultDto> obterDistancias(GoogleMapsRequestDistanciaDto googleMapsRequestDistancia) {
		
		List<GoogleMapsResultDto> googleMapsResult = new ArrayList<>();
		
		 Random rand = new Random(); 
		
		 for(int i = 1;i<=40;i++) {
			 googleMapsResult.add(new GoogleMapsResultDto(i,rand.nextInt(1000)));			 
		 }
		
		
		return googleMapsResult;
		
	}
	
}
