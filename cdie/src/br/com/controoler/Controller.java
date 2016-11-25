package br.com.controoler;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class Controller {

	private String mensagem;

	@Inject
	private Mensagens m;
	
	public Controller() {
		// TODO Auto-generated constructor stub
		this.mensagem = "ola";
	}
	
	public String getMensagem() {
		return m.mensagem();
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	
	
}
