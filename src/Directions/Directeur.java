package Directions;

public class Directeur {
	
	private int id;
	private String name;
	private String prenom;
	private String salair ;
	
	public Directeur(){
    	
    }
	public Directeur(int id, String name, String prenom, String salair) {
		this.id = id;
		this.name = name;
		this.prenom = prenom;
		this.salair = salair;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getSalair() {
		return salair;
	}
	public void setSalair(String salair) {
		this.salair = salair;
	}
	

}
