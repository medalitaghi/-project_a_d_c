package Controllers;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import Directions.Magasin;
import Services.MagasinService;


@Path("Caissier")
public class CaissierController {
	
	MagasinService magasinservice =new MagasinService(); 
	@GET
	@Path("Magasin/list")
	public List<Magasin> getCaissiers(){
		return magasinservice.getMagasins();
	}
	
	@GET
	@Path("Magasin/{id}")
	public Magasin getCaissier(@PathParam("id") long id){
		return magasinservice.getMagasin(id) ; 
	}


}
