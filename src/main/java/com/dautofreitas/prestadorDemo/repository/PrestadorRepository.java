package com.dautofreitas.prestadorDemo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dautofreitas.prestadorDemo.model.Prestador;

public interface PrestadorRepository extends JpaRepository<Prestador, Integer>{
	@Query("select p from Prestador p INNER JOIN p.especialidades e where e.nome =:especialidade")
	List<Prestador> obterPorEspecialidade(@Param("especialidade")  String especialidade);
}
