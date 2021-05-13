package br.com.fiap.beans;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.com.fiap.dao.ProfileDao;
import br.com.fiap.model.Profile;


@Named
@RequestScoped
public class ProfileBean {
	
	private Profile profile = new Profile();
	
	public void save() {
		new ProfileDao().save(this.profile);
		System.out.println("salvando profile..." + this.profile);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Profile cadastrado com sucesso!"));
	}
	
	public List<Profile> getProfiles() {
		return new ProfileDao().getAll();
	}
	
	public void executar() {
		System.out.println("acionando o bean");	
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	
}
