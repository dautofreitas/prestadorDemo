package com.dautofreitas.prestadorDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dautofreitas.prestadorDemo.dto.PrestadorDto;
import com.dautofreitas.prestadorDemo.service.PrestadorService;

@RestController
public class PrestadorController {
	@Autowired
	PrestadorService prestadorService;

@GetMapping("obterPrestadoresSaude")
 public List<PrestadorDto> obterPrestadoresSaude(@RequestParam double latitude,@RequestParam double longitude,@RequestParam String especialidade)
 {
	
	return prestadorService.obterPestadores(latitude, longitude, especialidade);
	
 }
}
