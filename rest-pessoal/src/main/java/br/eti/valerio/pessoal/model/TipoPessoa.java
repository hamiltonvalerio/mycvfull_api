package br.eti.valerio.pessoal.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoPessoa {
	@Id
	private Long id;
	
	private String nome;
}
