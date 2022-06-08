package module.dsi;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;

import jdbcconnection.dsiData;

public class userAccount 
{
	
	private String login;
	private String motDePasse;
	private String Role;
	private String Nom;
	private String Prenom;
	private String id ;
	
	
	
	
	
	public userAccount(String login, String motDePasse,String id) 
	{
		super();
		this.login = login;
		this.motDePasse = motDePasse;
		this.Role = null;
		this.Nom = null;
		this.Prenom = null;
		this.id = id;
		
	} 
	
	
	
	  public String hashPassword(String chaine) 
			{
				try {
					byte[] donneeOctet = chaine.getBytes();
					MessageDigest monHash = MessageDigest.getInstance("SHA");
					monHash.update(donneeOctet);
					byte[] condenser = monHash.digest();
					chaine = new BigInteger(condenser).toString(16);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return chaine;
			}

	
	
	
	
	  public boolean CreationIdentifiant()
	  {
		  try 
		
		{
			  
			  String passwordHash  = hashPassword(this.motDePasse);
			  dsiData.sendDataNewUser(login, passwordHash,Integer.valueOf(id));
			  System.out.println(passwordHash);
			  System.out.println(id);
			  return true;   
			
		} catch (Exception e) {
		
			System.out.println("error on creation");
			
			return false; 
		}
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  public boolean EtablishConnexion()
	  {
		
		  
		  try 
	  {
			  
			  
			 String passwordHash  = hashPassword(this.motDePasse);
			 System.out.println(this.login);
			 System.out.println(this.motDePasse);
			 
			 
			 
			 
			 boolean verification =  dsiData.VerifysUser(this.login,passwordHash);
			 
			 System.out.println(verification);
			 
			 
			 if(verification == true) 
			 {
				 System.out.println("herrr");
				 
				 System.out.println(id);
				 
				 
				 
				 
				 ArrayList<String> Profile;
				try {
					Profile = dsiData.UserConnexion(this.login,Integer.parseInt(id));
					 System.out.println(Profile);
					 this.Nom = Profile.get(0) ;
					 this.Prenom = Profile.get(1);
					 this.Role = Profile.get(2);
					 
					
					 
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
				 return true ; 
			 }
			 
			 else
			 {
				 
				 return false ; 
			 }
  
			
		} catch (Exception e) 
		  
		  {
			return false;
		
		  }
		  
		
		  

		 
		
		  
		  
		  
	  }



	public String getPrenom() 
	{
		return Prenom;
	}
	
	public String getRole() {
		return Role;
	}
	
	public String getNom() 
	{
		return Nom;
	}

	public void setId(String id) {
		this.id = id;
	}

}
