package Services;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Memoire.Database;
import Directions.Admin;
//import com.banque.model.Transfer;
public class AdminService {
	
private Map<Long, Admin> admins = Database.getAdmin();
	
	public AdminService(){

	}
	
	public List<Admin> getAdmins(){
		return new ArrayList<Admin>(admins.values());
	}
	
	public Admin getAdmin(long id){
		return admins.get(id);
	}
	
	public Admin addAdmin(Admin admin){
		admin.setId(admins.size()+1);
		admins.put(admin.getId(), admin);
		return admin;
	}
	
	public Admin updateAdmin(Admin admin){
		if(admin.getId() <=0){
			return null;
		}
		admins.put(admin.getId(), admin);
		return admin;
	}
	
	public Admin deleteAdmin(long id){
		
		return admins.remove(id);
	}
	
	public boolean loginAdmin(String username, String password){
		for (Map.Entry<Long, Admin> admin : admins.entrySet()) {
	        if(admin.getValue().getUsername().equals(username) && admin.getValue().getPassword().equals(password)){
	        	return true;
	        }
	    }
		return false;
	}

}
