package com.dautofreitas.prestadorDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.dautofreitas.prestadorDemo.model.Especialidade;
import com.dautofreitas.prestadorDemo.model.Prestador;
import com.dautofreitas.prestadorDemo.repository.EspecialidadeRepository;
import com.dautofreitas.prestadorDemo.repository.PrestadorRepository;


@SpringBootApplication
public class PrestadorDemoApplication {
	
	private static final String CARDIOLOGIA = "Cardiologia";
	private static final String DERMATOLOGIA = "Dermatologia";
	private static final String OFTALMOLOGIA = "Oftalmologia";
	private static final String PEDIATRIA = "Pediatria";
	
	@Autowired
	PrestadorRepository prestadorRepository;
	@Autowired
	EspecialidadeRepository especialidadeRepository;
	public static void main(String[] args) {
		SpringApplication.run(PrestadorDemoApplication.class, args);
	}
	@Bean
	public void carregaOperadores()
	{
		List<Especialidade> especialidades = new ArrayList<>();
		Especialidade cardiologia = new Especialidade(null,CARDIOLOGIA);
		cardiologia = especialidadeRepository.saveAndFlush(cardiologia);
		Especialidade dermatologia = new Especialidade(null,DERMATOLOGIA);
		dermatologia = especialidadeRepository.saveAndFlush(dermatologia);
		Especialidade oftalmologia = new Especialidade(null,OFTALMOLOGIA);
		oftalmologia = especialidadeRepository.saveAndFlush(oftalmologia);	
		Especialidade pediatria = new Especialidade(null,PEDIATRIA);
		pediatria = especialidadeRepository.saveAndFlush(pediatria);
	
		
		
		List<Prestador> prestadores = new ArrayList();	
	
		
		prestadores.add(new Prestador(null,"Clinica 01",List.of(cardiologia), "endereco01", 10, 20));
		prestadores.add(new Prestador(null,"Clinica 02",List.of(cardiologia), "endereco02", 10, 20));
		prestadores.add(new Prestador(null,"Clinica 03",List.of(cardiologia), "endereco03", 10, 20));
		prestadores.add(new Prestador(null,"Clinica 04",List.of(cardiologia), "endereco04", 10, 20));
		prestadores.add(new Prestador(null,"Clinica 05",List.of(cardiologia), "endereco05", 10, 20));
		
		
		prestadores.add(new Prestador(null,"Clinica 06",List.of(dermatologia), "endereco06", 10, 20));
		prestadores.add(new Prestador(null,"Clinica 07",List.of(dermatologia), "endereco07", 10, 20));
		prestadores.add(new Prestador(null,"Clinica 08",List.of(dermatologia), "endereco08", 10, 20));
		prestadores.add(new Prestador(null,"Clinica 09",List.of(dermatologia), "endereco09", 10, 20));
		prestadores.add(new Prestador(null,"Clinica 10",List.of(dermatologia), "endereco10", 10, 20));
		
		prestadores.add(new Prestador(null,"Clinica 11",List.of(dermatologia), "endereco11", 10, 20));
		prestadores.add(new Prestador(null,"Clinica 12",List.of(dermatologia), "endereco12", 10, 20));
		prestadores.add(new Prestador(null,"Clinica 13",List.of(dermatologia), "endereco13", 10, 20));
		prestadores.add(new Prestador(null,"Clinica 14",List.of(dermatologia), "endereco14", 10, 20));
		prestadores.add(new Prestador(null,"Clinica 15",List.of(dermatologia), "endereco15", 10, 20));
		
		prestadores.add(new Prestador(null,"Clinica 16",List.of(pediatria), "endereco16", 10, 20));
		prestadores.add(new Prestador(null,"Clinica 17",List.of(pediatria), "endereco17", 10, 20));
		prestadores.add(new Prestador(null,"Clinica 18",List.of(pediatria), "endereco18", 10, 20));
		prestadores.add(new Prestador(null,"Clinica 19",List.of(pediatria), "endereco19", 10, 20));
		prestadores.add(new Prestador(null,"Clinica 20",List.of(pediatria), "endereco20", 10, 20));
		
						
	    prestadorRepository.saveAll(prestadores);
	    
	    
	    		
				
		
	}

}
