package com.pruebatecnica.museo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="museo_obra")
@IdClass(MuseoObraPK.class)
public class MuseoObra {
	
	@Id
	private Museo museo;
	
	@Id
	private Obra obra;
	
	//Getters y Setters
	public Museo getMuseo() {
		return museo;
	}

	public void setMuseo(Museo museo) {
		this.museo = museo;
	}

	public Obra getObra() {
		return obra;
	}

	public void setObra(Obra obra) {
		this.obra = obra;
	}
	
}
