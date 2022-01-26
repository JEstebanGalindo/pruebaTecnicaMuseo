package com.pruebatecnica.museo.entity;

import java.io.Serializable;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class MuseoObraPK implements Serializable{

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="id_museo", nullable = false)
	private Museo museo;
	
	@ManyToOne
	@JoinColumn(name="id_obra", nullable = false)
	private Obra obra;	
	
}
