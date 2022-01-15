package Services;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Memoire.Database;

import Directions.Magasin;

public class MagasinService {
	
	private Map<Long, Magasin> magasins = Database.getMagasin();
	
	public List<Magasin> getMagasins(){
		return new ArrayList<Magasin>(magasins.values());
	}
	
	public Magasin getMagasin(long id){
		return magasins.get(id);
	}
	
	public Magasin addMagasin(Magasin Magasin){
		Magasin.setId(magasins.size()+1);
		magasins.put(Magasin.getId(), Magasin);
		return Magasin;
	}
	
	public Magasin updateMagasin(Magasin Magasin){
		if(Magasin.getId() <=0){
			return null;
		}
		magasins.put(Magasin.getId(), Magasin);
		return Magasin;
	}
	
	public Magasin deleteMagasin(long id){
		return magasins.remove(id);
	}


}