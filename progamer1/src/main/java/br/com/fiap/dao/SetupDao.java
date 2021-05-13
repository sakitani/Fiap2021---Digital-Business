package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.TypedQuery;


import br.com.fiap.model.Setup;
import br.com.fiap.util.EntityManagerFacade;

public class SetupDao {
	
	private EntityManager manager = EntityManagerFacade.get();

	public void save(Setup setup) {
		manager.getTransaction().begin();
		manager.persist(setup);
		manager.getTransaction().commit();
		
		manager.close();
	}

	public List<Setup> getAll() {
//		return manager.createQuery("SELECT s from Setup s", Setup.class).getResultList();
		String jpql = "SELECT s from Setup s";
		TypedQuery<Setup> createQuery = manager.createQuery(jpql, Setup.class);
		return createQuery.getResultList();
	}

	public Setup findById(Long id) {
		// TODO Auto-generated method stub
		return manager.find(Setup.class, id);
	}

	public void update(Setup setup) {
		manager.getTransaction().begin();
		manager.merge(setup);
		manager.flush();
		manager.getTransaction().commit();
	}

	public void delete(Setup setup) {
		manager.getTransaction().begin();
		manager.merge(setup);
		//manager.detach(setup);
		manager.remove(setup);
		//manager.persist(setup);
		manager.getTransaction().commit();
		
	}

	
}
