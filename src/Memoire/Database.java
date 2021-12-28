package Memoire;
import java.util.HashMap;
import java.util.Map;
import Directions.Directeur;
import Directions.Admin;
import Directions.Caissier;
public class Database {
	
	private static Map<Long, Directeur> directeurs = new HashMap<>();
	private static Map<Long, Caissier> caissiers = new HashMap<>();
	private static Map<Long, Admin> admins = new HashMap<>();
	
	public static Map<Long, Directeur> getDirecteurs(){
		directeurs.put(1L, new Directeur(1,"mohamed","ali", "2000","medali@gmail.com","1234"));
		directeurs.put(2L, new Directeur(2,"beye","melianine","1000","bey@gmail.com","1234"));
		return directeurs;
	}
	
	public static Map<Long, Caissier> getCaissier(){
		return caissiers;
	}
	
	public static Map<Long, Admin> getAdmin(){
		admins.put(1L, new Admin(1,"medali","1234"));
		return admins;
	}
}
