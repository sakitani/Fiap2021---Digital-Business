package br.com.fiap.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

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
	
//	public List<Profile> getAll() {
//		return manager.createQuery("SELECT p from Profile p", Profile.class).getResultList();
//	}
	
	public List<Profile> semPassword() {
		return manager.createQuery("select new Profile(p.id, p.name, p.birthDate, p.email) from Profile p", Profile.class)
				.getResultList();
	}
	

	public Profile findById2(Long id) {
		return manager.find(Profile.class, id);
	}
	
	public List<Profile> findById(Long id) {
		return manager.createQuery("select new Profile(p.id, p.name, p.birthDate, p.email) from Profile p where p.id = :idProcura", Profile.class)
				.setParameter("idProcura", id)
				.getResultList();
	}

	
	public void update(Profile profile) {
		manager.getTransaction().begin();
		manager.merge(profile);
		manager.flush();
		manager.getTransaction().commit();
	}
	
	public void delete(Long id) {
        manager.getTransaction().begin();
        Profile profile = manager.find(Profile.class, id);
        manager.remove(profile);
        manager.flush();
        manager.getTransaction().commit();
	}

	public boolean exist(Profile profile) {
		TypedQuery<Profile> query = manager.createQuery("SELECT p from Profile p WHERE email=:email AND password=:password", Profile.class);
		query.setParameter("email", profile.getEmail());
		query.setParameter("password", profile.getPassword());
		Profile result;
		try {
			result = query.getSingleResult();
			if (result != null) return true;
			return false;
		} catch (Exception e) {
			return false;
		}
	}
	
	//Método de busca de setup para um único usuário
	public List<Profile> buscar(String email, Long id) {
		return manager.createQuery("from Profile p where p.email like :pEmail and p.stup.id like :pSetup", Profile.class)
				.setParameter("pEmail", email)
				.setParameter("pStup", id)
				.getResultList();
	}
}
