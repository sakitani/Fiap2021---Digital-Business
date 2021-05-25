package br.com.fiap.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.fiap.dao.ProfileDao;
import br.com.fiap.model.Profile;


@Path("/profiles")
@Produces(MediaType.APPLICATION_JSON)
public class ProfileEndpoint {
	
	private ProfileDao dao = new ProfileDao();
	
	
	@GET
	public Response index() {
		try {
			List<Profile> list = dao.semPassword();
			return Response.status(Response.Status.OK).entity(list).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GET
	@Path("{id}")
	public Response show(@PathParam("id") Long id) {
		List<Profile> list = dao.findById(id);
		if(id == null) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
		return Response.status(Response.Status.OK).entity(list).build();	
	}
	
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(Profile profile) {
		if(profile == null){
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		try {
			dao.save(profile);
			return Response
					.status(Response.Status.CREATED)
					.entity(profile)
					.build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	

	@PUT
	@Path("{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response update(@PathParam("id") Long id, Profile profile) {
		if(id == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		if(profile == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		if(dao.findById(id) == null) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
		profile.setId(id);
		try {
			dao.update(profile);
			return Response.status(Response.Status.OK).entity(profile).build();			
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@DELETE
	@Path("{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response destroy(@PathParam("id") Long id) {
		if(id == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		if(dao.findById2(id) == null) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}

		try {
			dao.delete(id);
			return Response.status(Response.Status.OK).entity(id).build();			
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	
	
}//class