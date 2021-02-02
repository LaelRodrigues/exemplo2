package br.com.exemplo2.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.exemplo2.model.Empregado;

@Stateless
public class EmpregadoDao {
    
    @PersistenceContext
	private EntityManager em;
	
	public void adicionar(Empregado empregado) {
		em.persist(empregado);
	}
	
	@SuppressWarnings("unchecked")
	public List<Empregado> listarEmpregados(){
        return em.createQuery("select e from Empregado e").getResultList();

	}
}
