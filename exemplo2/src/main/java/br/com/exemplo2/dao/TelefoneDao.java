package br.com.exemplo2.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.exemplo2.model.Telefone;

public class TelefoneDao {
	
	private final EntityManager em;
	
	public TelefoneDao(EntityManager em) {
		this.em = em;
	}
	
	public void adicionar(Telefone telefone) {
		em.persist(telefone);
	}
	
	@SuppressWarnings("unchecked")
	public List<Telefone> listarEmpregados(){
        return em.createQuery("select t from Telefone t").getResultList();

	}
}
