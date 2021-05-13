package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;


import br.com.fiap.model.Profile;

import br.com.fiap.util.EntityManagerFacade;

public class ProfileDao {

	private EntityManager manager = EntityManagerFacade.get();

	public void save(Profile profile) {
		manager.getTransaction().begin();
		manager.persist(profile);
		manager.getTransaction().commit();

		manager.close();
	}

	public List<Profile> getAll() {
		return manager.createQuery("SELECT s from Profile s", Profile.class).getResultList();
	}
	

	public Profile findById(Long id) {
		return manager.find(Profile.class, id);
	}
	
	public void update(Profile profile) {
		manager.getTransaction().begin();
		manager.merge(profile);
		manager.flush();
		manager.getTransaction().commit();
	}

}
