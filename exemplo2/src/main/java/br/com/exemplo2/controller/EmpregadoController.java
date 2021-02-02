package br.com.exemplo2.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.exemplo2.dao.EmpregadoDao;
import br.com.exemplo2.model.Empregado;

@Controller
public class EmpregadoController{

	@Inject
	private EmpregadoDao empregadoDao;
	
	@Inject
    private Result result;
	
	@Path("/")
	public void inicio() {
	}
	
	@Post
	public void add(Empregado empregado) {
		empregadoDao.adicionar(empregado);
		result.redirectTo(this).inicio();
	}	
	
}
