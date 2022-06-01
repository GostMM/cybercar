package jdbcconnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import module.dsi.dsiController;
import module.dsi.userAccount;

public class dsiData {
	
	
	public static void getDernierEmployee() throws SQLException
	{
		String query = "{ call dsi_table() }";
        ResultSet rs;

        try (Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query))
        {
            rs = stmt.executeQuery();
            if (rs.next())
            
            {
				
				
				dsiController.setName(rs.getString("Nom"));
				dsiController.setFonction(rs.getString("Fonction"));
				dsiController.setDate(rs.getString("date_embauche"));
				dsiController.setId(rs.getString("id"));
				
				
					
			}
            
            
            	
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
	
		
	}

	public static void getSecondEmployee() throws SQLException 
	{
		String query = "{ call dsi_table() }";
        ResultSet rs;

        try (Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query))
        {
            rs = stmt.executeQuery();
            if (rs.next())
            
            {
				
				
				dsiController.setName(rs.getString("Nom"));
				dsiController.setFonction(rs.getString("Fonction"));
				dsiController.setDate(rs.getString("date_embauche"));
					
			}
            
            
            	
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
	}
	
	public static void sendDataNewUser(String login, String mdp,int id)
	{
		String query = "{ call CreateLogin(?,?,?) }";
	       

        try {
        	
        		Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query);
                stmt.setString(1, login);
                stmt.setString(2,mdp);
                stmt.setInt(3,id);
                
                stmt.execute();
                stmt.close();
        
        	
        	}
        		
       catch (SQLException ex) {
    	   
    	Alert alert = new Alert(AlertType.INFORMATION);
   		alert.setWidth(600);
   		alert.setHeight(600);
   		alert.setTitle("LA COMMANDE");
   		alert.setHeaderText("etat de la commande");
   		alert.setContentText("une Erreur s'est produite =>>>"+ex.getMessage());
   		alert.showAndWait();
            //System.out.println(ex.getMessage());
        }
		
		
	}
	
	
	public static boolean VerifysUser(String login ,String mdp)
	{
		
		String query = "{ call ExistUtilisateur(?,?) }";
		ResultSet rs;

        try {
        	
        		Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query);
                stmt.setString(1, login);
                stmt.setString(2,mdp);
                rs = stmt.executeQuery();
                
                
                if(rs.next() && rs.getInt("nbrUtilisateur")==1)
                {
                	
                	
                    	
                    	userAccount userAccount = new userAccount(null, null, rs.getString("id"));
    					
    					
                    	System.out.println(rs.getString("id"));
                    	
                    
                    
                	return true;
                   
                }
                else 
                {
                	
                	return false;
                }
            	
                
        
        	
        	}
        
        catch (SQLException ex) {
     	   
        	Alert alert = new Alert(AlertType.INFORMATION);
       		alert.setWidth(600);
       		alert.setHeight(600);
       		alert.setTitle("LA COMMANDE");
       		alert.setHeaderText("etat de la commande");
       		alert.setContentText("une Erreur s'est produite =>>>"+ex.getMessage());
       		alert.showAndWait();
       		
       		return false;
                //System.out.println(ex.getMessage());
            }
    		
        
		
		
		
	}
	
	
	public static ArrayList<String> UserConnexion(String login,int id)
	{

		System.out.println("here");
		ArrayList<String> userProfile  =  new ArrayList<String>(); 
		
		String query = "{ call CompteUtilisateur(?,?) }";
		ResultSet rs;
        try {
        	
        		Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query);
                stmt.setString(1, login);
                stmt.setInt(2, id);
                rs = stmt.executeQuery();
                
                if(rs.next())
                	
                
	                userProfile.add(rs.getString("nom"));
	                userProfile.add(rs.getString("prenom"));
	                userProfile.add(rs.getString("fonction"));
                
                System.out.println(userProfile);
                
                
                
                
                
        	return userProfile;
        	}
        
        catch (SQLException ex) {
     	   
        	Alert alert = new Alert(AlertType.INFORMATION);
       		alert.setWidth(600);
       		alert.setHeight(600);
       		alert.setTitle("LA COMMANDE");
       		alert.setHeaderText("etat de la commande");
       		alert.setContentText("une Erreur s'est produite =>>>"+ex.getMessage());
       		alert.showAndWait();
       		
       		
                //System.out.println(ex.getMessage());
            }
		
		
		
		
		return null;
		
	}

}
