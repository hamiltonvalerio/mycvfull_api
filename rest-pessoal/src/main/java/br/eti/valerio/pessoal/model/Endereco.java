package br.eti.valerio.pessoal.model;

import javax.persistence.Id;

public class Endereco {
	@Id
	private Long id;
	
	private String descricao;
	
	private String cidade;
	
	private String estado;
	
	private TipoEndereco tipoEndereco;
	
	private String emailPessoal;
	
	private String emailComercial;
}
