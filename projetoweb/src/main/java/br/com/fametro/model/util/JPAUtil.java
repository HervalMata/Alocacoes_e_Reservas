package br.com.fametro.model.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory entityManagerFactory; // F�brica
	private static EntityManager em; // Gerenciador de entidades
	
	static {
		// Instanciando a f�brica
		entityManagerFactory = Persistence.createEntityManagerFactory("persistenceUnit");
		// Instanciando o gerenciador
		em = entityManagerFactory.createEntityManager();
	}
	
	/**
	 * M�todo que retorna um objeto EntityManager
	 * @return
	 */
	public static EntityManager abreConexao(){
		return em;
	}
}
