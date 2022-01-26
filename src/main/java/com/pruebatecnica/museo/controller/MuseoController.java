package com.pruebatecnica.museo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebatecnica.museo.entity.Museo;
import com.pruebatecnica.museo.repository.IMuseoRepo;

@RestController
@RequestMapping("/museo")
public class MuseoController {
	
	@Autowired
	IMuseoRepo repo;
	
	@GetMapping("/buscarMuseoL/{ciudad}")
	public List<Museo> buscarMuseoCiudadL(@PathVariable String ciudad){
		return repo.BuscarMuseosCiudadL(ciudad);
		
	}	

}
