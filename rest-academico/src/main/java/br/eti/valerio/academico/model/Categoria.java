package br.eti.valerio.academico.model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Categoria {
	@Id
	private Long id;
	
	private String nome;
}
