package br.com.controoler;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
@Local(Mensagens.class)
public class MensagensImp implements Mensagens{

	@Inject
	private MensagemDao dao;
	
	@Override
	public String mensagem() {
		// TODO Auto-generated method stub
		return dao.mensagem();
	}

}
