package com.pruebatecnica.museo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebatecnica.museo.entity.Obra;
import com.pruebatecnica.museo.repository.IMuseoObraRepo;

@RestController
@RequestMapping("/museo_obra")
public class MuseoObraController {
	
	@Autowired
	IMuseoObraRepo repo;
	
	@GetMapping("/traerObrasColombia/{idArtista}")
	public List<Obra> getObrasColombia(@PathVariable int idArtista) {
		return repo.traerObrasColombia(idArtista);
	}
	
	@GetMapping("/traerObrasColombia/{idArtista}/{pais}")
	public List<Obra> getObrasColombia2(@PathVariable int idArtista, @PathVariable String pais) {
		return repo.traerObrasColombia2(idArtista, pais);
	}

}
