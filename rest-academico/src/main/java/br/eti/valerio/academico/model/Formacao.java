package br.eti.valerio.academico.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Formacao {
	
	@Id
	private Long id;
	
	private Timestamp anoInicio;

	private Timestamp anoFim;
	
	private Titulo titulo;
	
	private String istituicao;
	
	private List<Categoria> categorias;
	
	private String orientador;
	
	private TipoFormacao tipoFormacao;
	
}
