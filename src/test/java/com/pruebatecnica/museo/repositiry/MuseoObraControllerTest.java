package com.pruebatecnica.museo.repositiry;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pruebatecnica.museo.controller.MuseoObraController;
import com.pruebatecnica.museo.entity.Obra;

@SpringBootTest
public class MuseoObraControllerTest {
	
	@Autowired
	MuseoObraController repo;
	
	@Test
	void getObrasColombia() {
		
		int idArtista = 3;
		List<Obra> obras = repo.getObrasColombia(idArtista);
		
		Assertions.assertEquals(7, obras.get(1).getId());
		Assertions.assertEquals("obra colombiana", obras.get(1).getNombre());
		Assertions.assertEquals("colombia", obras.get(1).getPais());	
	}
	
	@Test
	void getObrasColombia2() {
		
		int idArtista2 = 3;
		String pais ="CO";
		
		List<Obra> obras = repo.getObrasColombia2(idArtista2, pais);
		
		Assertions.assertEquals(8, obras.get(0).getId());
		Assertions.assertEquals("obra peruana", obras.get(0).getNombre());
		Assertions.assertEquals("colombia", obras.get(0).getPais());	
	}
	
}
