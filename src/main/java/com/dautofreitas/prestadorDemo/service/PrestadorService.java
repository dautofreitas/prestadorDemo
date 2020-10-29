package com.dautofreitas.prestadorDemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dautofreitas.prestadorDemo.dto.PrestadorDto;

@Service
public interface PrestadorService {
	List<PrestadorDto> obterPestadores(double latitude,double longitude, String especialidade);
}
