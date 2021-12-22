package Adminstrateur;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;



@Path("/Admin")
public class Admin {
	
	
	private static Map<String, String>  memoire = new HashMap<>();
	@GET
	public Map<String, String> getValue() {
	return memoire;
	}
	
	@PUT
	public void insert(@QueryParam("passeworde") String passeworde, @QueryParam("user") 
	String user) {
	memoire.put(passeworde, user);
	}
	static Services service = new Services();
	
	@PUT
	@Path("add/DirecteurGenerale")
	public String addDirecteur(DG c){
		return service.addDirecteur(c);
	}
	
	@GET
	@Path("all/DirecteurGenerale")
	public List<DG> allDirection(){
		return service.allDirection();
	}
	
	@POST
	@Path("DirecteurGenerale/{identifiant}")
	public DG getDirecteur(@QueryParam("identifiant") String id){
		return service.getDirecteur(id);
	}
	
	@DELETE
	@Path("DirecteurGenerale/delete/{id}")
	public String deleteDirecteur(@QueryParam("id") String id){
		return service.deleteDirecteur(id);
	}
}
	


