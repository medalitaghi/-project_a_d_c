package Directions;

public class Magasin {
	
	private long id ;
	private Produit produit ;
	
	
	
	public Magasin() {
		// TODO Auto-generated constructor stub
	}
	public Magasin(long id, Produit produit) {
		this.id = id;
		this.produit = produit ; 
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
}
