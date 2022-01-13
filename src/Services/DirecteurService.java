package Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Memoire.Database;
import Directions.Directeur;

public class DirecteurService {
	
	private Map<Long,Directeur> directeurs = Database.getDirecteurs();
	
	public DirecteurService(){

	}
	
	public List<Directeur> getDirecteurs(){
		return new ArrayList<Directeur>(directeurs.values());
	}
	
	public Directeur getDirecteur(long id){
		return directeurs.get(id);
	}
	
	public Directeur addDirecteur(Directeur directeur){
		directeur.setId(directeurs.size()+1);
		directeurs.put(directeur.getId(),directeur) ; 
		return directeur;
	}
	
	public Directeur updateDirecteur(Directeur directeur){
		if(directeur.getId() <=0){
			return null;
		}
		directeurs.put(directeur.getId(), directeur);
		return directeur;
	}
	
	public Directeur deleteDirecteur(long id){
		return directeurs.remove(id);
	}
	
	public boolean loginDirecteur(String email, String password){
		for (Map.Entry<Long, Directeur> account : directeurs.entrySet()) {
	        if(account.getValue().getEmail().equals(email) && account.getValue().getPass().equals(password)){
	        	return true;
	        }
	    } 
		return false;
	}
}
