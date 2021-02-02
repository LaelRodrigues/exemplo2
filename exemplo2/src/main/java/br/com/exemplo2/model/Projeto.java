package br.com.exemplo2.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Projeto implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private int codigoProjeto;
	
	private String nomeProjeto;
	
	public Projeto() {}

	public Projeto(int id, int codigoProjeto, String nomeProjeto) {
		super();
		this.id = id;
		this.codigoProjeto = codigoProjeto;
		this.nomeProjeto = nomeProjeto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodigoProjeto() {
		return codigoProjeto;
	}

	public void setCodigoProjeto(int codigoProjeto) {
		this.codigoProjeto = codigoProjeto;
	}

	public String getNomeProjeto() {
		return nomeProjeto;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}
}
