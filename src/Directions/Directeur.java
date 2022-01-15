package Directions;

public class Directeur {
	
	private long id;
	private String name;
	private String salair ;
	private String username ;
	private String password ;
	private Magasin magasin ; 
	public Directeur(){
    	
    }

	public Directeur(int id, String name, String salair, String username, String password,Magasin magasin) {
		this.id = id;
		this.name = name;
		this.salair = salair;
		this.username = username;
		this.password = password ; 
		this.magasin = magasin ;
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

	public String getSalair() {
		return salair;
	}
	public void setSalair(String salair) {
		this.salair = salair;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public Magasin getMagasin() {
		return magasin;
	}

	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}

	
	

}
