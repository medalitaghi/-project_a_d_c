package Directions;

public class Caissier {
	
	private long id;
	private String name;
	private String prenom;
	
	public Caissier(){
		
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Caissier(int id, String name, String prenom) {
		this.id = id;
		this.name = name;
		this.prenom = prenom;
	}
	
}
