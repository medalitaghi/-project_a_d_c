package Directions;

public class Produit {
	private long id ;
	private String nomproduit; 
	private String prixproduit;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomproduit() {
		return nomproduit;
	}
	public void setNomproduit(String nomproduit) {
		this.nomproduit = nomproduit;
	}
	public String getPrixproduit() {
		return prixproduit;
	}
	public void setPrixproduit(String prixproduit) {
		this.prixproduit = prixproduit;
	}
	
	public Produit() {
		// TODO Auto-generated constructor stub
	}
	public Produit(long id, String nomproduit, String prixproduit) {
		this.id = id;
		this.nomproduit = nomproduit;
		this.prixproduit = prixproduit;
	} 
}
