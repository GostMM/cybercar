package jdbcconnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

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
	            
	    
	    	
	    	}
	    		
	   catch (SQLException ex) {
		   
		Alert alert = new Alert(AlertType.INFORMATION);
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
	
	
	
	
}
