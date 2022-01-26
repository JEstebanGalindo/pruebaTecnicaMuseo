package com.pruebatecnica.museo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pruebatecnica.museo.entity.Museo;

@Repository
public interface IMuseoRepo extends JpaRepository<Museo, Integer>{


	@Query(value = "SELECT c FROM Museo c where c.ciudad = :ciudad and c.nombre LIKE CONCAT(('L'),'%')")
	public List<Museo> BuscarMuseosCiudadL(@Param("ciudad") String ciudad);

}
