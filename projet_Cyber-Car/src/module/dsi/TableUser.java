package module.dsi;

public class TableUser {
	
	
	private String nom,fonction,status_Log,date_arivee;

	public TableUser(String nom, String fonction, String status_Log,String date_arivee) 
	
	{
		super();
		this.nom = nom;
		this.fonction = fonction;
		
		if(status_Log.equals("0"))
				
		{
			this.status_Log = "Indentifiant Indisponible";
				
		}
		else 
		{
			this.status_Log = "Indentifiant Disponible";
		}
		this.date_arivee = date_arivee;
	}
	
	
	public String getFonction() {
		return fonction;
	}
	public String getNom() {
		return nom;
	}
	
	public String getStatus_Log() {
		return status_Log;
	}
	public String getDate_arivee() {
		return date_arivee;
	}
	

}
