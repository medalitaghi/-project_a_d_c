package Directions;

public class Directeur {
	
	private long id;
	private String name;
	private String prenom;
	private String salair ;
	private String email ;
	private String pass ;
	
	
	public Directeur(){
    	
    }

	public Directeur(int id, String name, String prenom, String salair, String email, String pass) {
		this.id = id;
		this.name = name;
		this.prenom = prenom;
		this.salair = salair;
		this.email = email;
		this.pass = pass;
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
	public String getSalair() {
		return salair;
	}
	public void setSalair(String salair) {
		this.salair = salair;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	

}
