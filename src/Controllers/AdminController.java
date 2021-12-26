package Controllers;

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


import Directions.*;
import Services.AdminService; 
import Services.DirecteurService; 
import Services.CaissierService;; 


@Path("/Admin")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AdminController {
	
	AdminService adminService = new AdminService();
	DirecteurService directeurservice = new DirecteurService();
	CaissierService caissierservice= new CaissierService();
	
	@GET
	@Path("/list")
	public List<Admin> getAdmins(){
		return adminService.getAdmins();
	}
	
	@GET
	@Path("/{id}")
	public Admin getAdmin(@PathParam("id") long id){
		return adminService.getAdmin(id);
	}
	
	@PUT
	@Path("/add")
	public Admin addAdmin(Admin admin){
		adminService.addAdmin(admin);
		return admin;
	}
	
	@POST
	@Path("/update")
	public Admin updateAdmin(Admin admin){
		return adminService.updateAdmin(admin);
	}
	
	@DELETE
	@Path("/delete/{id}")
	public Admin deleteAdmin(@PathParam("id") long id){
		return adminService.deleteAdmin(id);
	}
	


}

