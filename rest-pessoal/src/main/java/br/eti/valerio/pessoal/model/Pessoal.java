package br.eti.valerio.pessoal.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pessoal {
	@Id
	private Long id;
	
	private String nome;
	
	private String sobrenome;
	
	private Timestamp dataNascimento;
	
	private String rg;
	
	private String cpf;
	
	private List<Endereco> endereco;
	
	private Tipo tipo;
	
	private String resumo;
	
	
}
