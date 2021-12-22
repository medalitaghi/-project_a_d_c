package Adminstrateur;



import java.util.HashMap;
import java.util.Map;


public class Memoire {
	
	

	private static Map<String, DG> DG = new HashMap<>();
	public static Map<String, DG> getDG(){
		return DG;
	}
	
	private static Map<String, String> users = new HashMap<>();
	
	public static Map<String,String> getMyMap(){
		users.put("user", "1");
		return users;
	}
	
	
	private static Map<String, String> connectionState = new HashMap<>();
	
	public static void connecter(String user){
		connectionState.put(user, "1");
	}
	

	public static boolean isConnected( String user ){
		if(connectionState.get(user) == null) return false;
		if(connectionState.get(user).equals("1"))
			return true;
		else
			return false;
	}
	
	

}
