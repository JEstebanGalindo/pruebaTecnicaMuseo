package com.pruebatecnica.museo.repositiry;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pruebatecnica.museo.controller.MuseoController;
import com.pruebatecnica.museo.entity.Museo;

@SpringBootTest
public class MuseoControllerTest {
	
	@Autowired
	MuseoController repo;
	
	@Test
	void BuscarMuseosCiudadL() {
		//repo = new MuseoController();
		String ciudad = "sao pablo";
		
		List<Museo> museo = repo.buscarMuseoCiudadL(ciudad);
		
		Assertions.assertEquals(6 , museo.get(0).getId());
		Assertions.assertEquals("L brasileño" , museo.get(0).getNombre());
		Assertions.assertEquals("BRASIL" , museo.get(0).getPais());
		Assertions.assertEquals("sao pablo" , museo.get(0).getCiudad());
		Assertions.assertEquals("calle sao pablo" , museo.get(0).getDireccion());		
	}

}
