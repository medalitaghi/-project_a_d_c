package Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Memoire.Database;
import Directions.Caissier;
import Directions.Magasin;
import Directions.Produit;
//import com.banque.model.Transfer;
public class CaissierService {
	Magasin magasin = new Magasin() ; 
private Map<Long, Caissier> caissiers = Database.getCaissier();
private Map<Long, Magasin> magasins = Database.getMagasin();
private Map<Long, Produit> produits = Database.getProduit();


	
	public CaissierService(){
	}
	
	public List<Caissier> getCaissiers(){
		return new ArrayList<Caissier>(caissiers.values());
	}
	
	public Caissier getCaissier(long id){
		return caissiers.get(id);
	}
	
	public Caissier addCaissier(Caissier caissier){
		caissier.setId(caissiers.size()+1);
		caissiers.put(caissier.getId(), caissier);
		return caissier;
	}
	
	public Caissier updateCaissier(Caissier caissier){
		if(caissier.getId() <=0){
			return null;
		}
		caissiers.put(caissier.getId(), caissier);
		return caissier;
	}
	
	public Caissier deleteCaissier(long id){
		return caissiers.remove(id);
	}

}

