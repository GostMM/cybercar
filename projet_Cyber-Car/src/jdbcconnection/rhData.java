package jdbcconnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import module.finance.adminController;
import module.rh.Recrutement;

public class rhData 

{

	
	public static boolean sendDataToDataBase(String nom, String prenom, String nJeuneFille, String civilite, String fonction, String mail,String adresse,
			String tel, String indic, String dEmbauche, String dFinContrat, String postA, String postN,
			String conjugale, String nbrEnfant, String medicale, String assurance, String salaire)
	{
		String query = "{ call nouveauCollab(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) }";
	    

	    try {
	    	
	    		Connection conn = ConnectoDataBase.getConnection();
	            CallableStatement stmt = conn.prepareCall(query);
	            stmt.setString(1,nom);
	            stmt.setString(2,prenom);
	            stmt.setString(3,civilite);    
	            stmt.setString(4,fonction);
	            stmt.setString(5,dEmbauche);
	            stmt.setString(6,dFinContrat);
	            stmt.setString(7,adresse);
	            stmt.setString(8,indic+" "+tel);
	            stmt.setString(9,mail);  
	            stmt.setString(10,nJeuneFille);
	            stmt.setString(11,postA);
	            stmt.setString(12,postN);
	            stmt.setString(13,conjugale);
	            stmt.setString(14,medicale);
	            stmt.setString(15,assurance);
	            stmt.setString(16,salaire);
	            stmt.setString(17,nbrEnfant);
	            stmt.execute();
	            
	            
	            
	            Alert alert = new Alert(AlertType.CONFIRMATION);
				alert.setWidth(600);
				alert.setHeight(600);
				alert.setTitle("Information");
				alert.setHeaderText(" COLLAB enregistré");
				alert.setContentText("SUCCES ");
				alert.showAndWait();
	    
	    	
	    	}
	    		
	   catch (SQLException ex) {
		   
		Alert alert = new Alert(AlertType.WARNING);
			alert.setWidth(600);
			alert.setHeight(600);
			alert.setTitle("Information");
			alert.setHeaderText("non enregistré");
			alert.setContentText("une Erreur s'est produite =>>>"+ex.getMessage());
			alert.showAndWait();
	        //System.out.println(ex.getMessage());
	    }
		return false;
		
	}
	
	
	
	
	public static void getallUsers()
	{
		

		
		
		
		   String query = "{ call AllProfileUser() }";
	        ResultSet rs;

	        try (Connection conn = ConnectoDataBase.getConnection();
	             CallableStatement stmt = conn.prepareCall(query))
	        {
	            rs = stmt.executeQuery();
	            while(rs.next())
	            {
	            	
	            	Recrutement.noms.add(rs.getString("nom"));
	            	Recrutement.prenoms.add(rs.getString("prenom"));
	            	Recrutement.civilites.add(rs.getString("civilite"));
	            	Recrutement.fonctions.add(rs.getString("fonction"));
	            	Recrutement.adrsPostale.add(rs.getString("adresse"));
	            	Recrutement.emails.add(rs.getString("email"));
	            	Recrutement.tels.add(rs.getString("tel"));
	            	Recrutement.dEmbauches.add(rs.getString("date_embauche"));
	            	Recrutement.dFinContrat.add(rs.getString("date_fin_de_contrat"));
	            	Recrutement.id.add(rs.getInt("id"));
	            	Recrutement.uSalaire.add(rs.getString("salaire"));
	            	
	            	
	            
	            	
	   

	        
	            }
	            
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	        }
		

		
	}
	
	
	
	
}
