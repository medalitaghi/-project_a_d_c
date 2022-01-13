package Memoire;
import java.util.HashMap;
import java.util.Map;
import Directions.Directeur;
import Directions.Magasin;
import Directions.Produit;
import Directions.Admin;
import Directions.Caissier;
public class Database {
	
	private static Map<Long, Directeur> directeurs = new HashMap<>();
	private static Map<Long, Caissier> caissiers = new HashMap<>();
	private static Map<Long, Admin> admins = new HashMap<>();
	private static Map<Long, Magasin> magasin = new HashMap<>();
	private static Map<Long, Produit> produit = new HashMap<>();


	
	public static Map<Long, Directeur> getDirecteurs(){
		directeurs.put(1L, new Directeur(1,"mohamed","ali", "2000","medali@gmail.com","1234"));
		directeurs.put(2L, new Directeur(2,"beye","melianine","1000","bey@gmail.com","1234"));
		return directeurs;
	}
	
	public static Map<Long, Caissier> getCaissier(){
		caissiers.put(1L,new Caissier(1,"medali","taghi",new Magasin(1,new Produit(1,"sucre","100")))) ; 
		return caissiers;
	}
	
	
		public static Map<Long, Admin> getAdmin(){
			admins.put(1L, new Admin(1,"medali","1234"));
			return admins;
		}
		
		public static Map<Long, Magasin> getMagasin(){
			magasin.put(1L, new Magasin(1,new Produit(1,"sucre","100")));
			return magasin;
		}
		
		public static Map<Long, Produit> getProduit(){
			produit.put(1L,new Produit(1,"sucre","100"));
			return produit;
		}
}
