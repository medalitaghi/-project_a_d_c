package Controllers;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import Directions.Directeur;
@Path("Directeur")
public class DirecteurController {
	
	DirecteurController directeurservice = new DirecteurController() ; 
	
	@GET
	@Path("/list")
	public List<Directeur> getDirecteurs(){
		return directeurservice.getDirecteurs();
	}
	
	@GET
	@Path("/{id}")
	public Directeur getDirecteur(@PathParam("id") long id){
		return directeurservice.getDirecteur(id);
	}
	
	@PUT
	@Path("/add")
	public Directeur addDirecteur(Directeur directeur){
		directeurservice.addDirecteur(directeur);
		return directeur;
	}
	
	@POST
	@Path("/update")
	public Directeur updateDirecteur(Directeur directeur){
		return directeurservice.updateDirecteur(directeur);
	}

	@DELETE
	@Path("/delete/{id}")
	public Directeur deleteDirecteur(@PathParam("id") long id){
		return directeurservice.deleteDirecteur(id);
	}
}
