package br.com.fametro.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fametro.model.dao.AdministradorDAO;
import br.com.fametro.model.entity.Administrador;

@Service
public class AdministradorService {
	
	@Autowired
	private AdministradorDAO adminDAO;
	
	public void salvar(Administrador administrador){
		
		//Valida��o de regra de neg�cio
		
		adminDAO.salvar(administrador);
	}
}
