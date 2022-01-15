package Directions;

public class Magasin {
	
	private long id ;
	private Stock stock ;
		
	public Magasin() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public Magasin(long id, Stock stock) {
		this.id = id;
		this.stock = stock;
	}
	
	
}
