package br.eti.valerio.academico.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Titulo {
	@Id
	private Long id;
	
	private String nome;
}
