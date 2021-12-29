package Directions;

public class Caissier {
	
	private long id;
	private String nom;
	private String prenom;
	private Magasin magasin ;
	
	public Caissier(){
		
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Caissier(int id, String nom, String prenom,Magasin magasin) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.magasin= magasin ;
	}

	public Magasin getMagasin() {
		return magasin;
	}

	public void setMgasin(Magasin magasin) {
		this.magasin = magasin;
	}
	
}
