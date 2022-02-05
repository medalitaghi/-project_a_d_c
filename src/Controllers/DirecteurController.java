package Controllers;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import Directions.Caissier;
import Directions.Directeur;
import Services.CaissierService;
import Services.DirecteurService;
@Path("Directeur")
public class DirecteurController {
	
	DirecteurService directeurservice = new DirecteurService() ; 
	CaissierService caissierservice = new CaissierService() ; 

	
	
	@GET
	@Path("Caissier/list")
	public List<Caissier> getCaissiers(){
		return caissierservice.getCaissiers();
	}
	
	@GET
	@Path("Caissier/{id}")
	public Caissier getCaissier(@PathParam("id") long id){
		return caissierservice.getCaissier(id) ; 
	}
	
	@PUT
	@Path("Caissier/add")
	public Caissier addCaissier(Caissier caissier){
		caissierservice.addCaissier(caissier);
		return caissier;
	}
	
	@POST
	@Path("Caissier/update")
	public Caissier updateCaissier(Caissier caissier){
		return caissierservice.updateCaissier(caissier);
	}
	
	@DELETE
	@Path("Caissier/delete/{id}")
	public Caissier deleteCaissier(@PathParam("id") long id){
		return caissierservice.deleteCaissier(id);
	}
	
	
	
}
