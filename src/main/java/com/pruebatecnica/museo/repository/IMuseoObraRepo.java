package com.pruebatecnica.museo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pruebatecnica.museo.entity.MuseoObra;
import com.pruebatecnica.museo.entity.Obra;

@Repository
public interface IMuseoObraRepo extends JpaRepository<MuseoObra, Integer>{
	
	@Query(value = "SELECT  c.obra FROM MuseoObra c where c.obra.artista.id = :idArtista and c.museo.pais = 'COLOMBIA'")
	public List<Obra> traerObrasColombia(@Param("idArtista") Integer idArtista);
	
	@Query(value = "SELECT  c.obra FROM MuseoObra c where c.obra.artista.id = :idArtista and c.museo.pais LIKE CONCAT('%',UPPER(:pais),'%')")
	public List<Obra> traerObrasColombia2(@Param("idArtista") Integer idArtista, @Param("pais") String pais);

}
