package Memoire;
import java.util.HashMap;
import java.util.Map;
import Directions.Directeur;
import Directions.Magasin;
import Directions.Stock;
import Directions.Admin;
import Directions.Caissier;
public class Database {
	
	private static Map<Long, Directeur> directeurs = new HashMap<>();
	private static Map<Long, Caissier> caissiers = new HashMap<>();
	private static Map<Long, Admin> admins = new HashMap<>();
	private static Map<Long, Magasin> magasin = new HashMap<>();
	private static Map<Long, Stock> stock = new HashMap<>();


	
	public static Map<Long, Directeur> getDirecteurs(){
		return directeurs;
	}
	
	public static Map<Long, Caissier> getCaissier(){
		caissiers.put(1L,new Caissier(1,"medali","taghi")) ; 
		return caissiers;
	}
	
		public static Map<Long, Admin> getAdmin(){
			admins.put(1L, new Admin(1,"admin","admin"));
			return admins;
		}
		
		public static Map<Long, Magasin> getMagasin(){
			magasin.put(1L, new Magasin(1,new Stock(1,"tomato","1000")));
			return magasin;
		}
	
		public static Map<Long, Stock> getProduit(){
			stock.put(1L,new Stock());
			return stock;
		}
}
