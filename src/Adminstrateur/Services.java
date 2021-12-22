package Adminstrateur;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Services {

	
public static Map<String, DG> Directeur = Memoire.getDG();
	
	public String addDirecteur(DG c){
		Directeur.put(c.getIdentifiant(), c);
		return c.getNom()+" is added with success";
	}
	
	public List<DG> allDirection() {
		return new ArrayList<DG>(Directeur.values());
	}

	public DG getDirecteur(String id){
		DG c = Directeur.get(id);
		return c; 
	}

	public String deleteDirecteur(String id){
		DG c = Directeur.remove(id);
		return c.getIdentifiant()+" a ete supprimer";
	}
}
