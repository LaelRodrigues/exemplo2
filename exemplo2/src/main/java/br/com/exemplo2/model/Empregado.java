package br.com.exemplo2.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Empregado implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private int matricula;
	
	private String nomeEmpregado;
	
	private long salario;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Telefone telefone;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	
	@ManyToMany
	private Set<Projeto> projetos;
	
	@ManyToOne
	private Departamento departamento;
	
	public Empregado() {}

	public Empregado(int id, int matricula, String nomeEmpregado, long salario, Telefone telefone, Endereco endereco,
			Set<Projeto> projetos, Departamento departamento) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.nomeEmpregado = nomeEmpregado;
		this.salario = salario;
		this.telefone = telefone;
		this.endereco = endereco;
		this.projetos = projetos;
		this.departamento = departamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNomeEmpregado() {
		return nomeEmpregado;
	}

	public void setNomeEmpregado(String nomeEmpregado) {
		this.nomeEmpregado = nomeEmpregado;
	}

	public long getSalario() {
		return salario;
	}

	public void setSalario(long salario) {
		this.salario = salario;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Set<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(Set<Projeto> projetos) {
		this.projetos = projetos;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}
