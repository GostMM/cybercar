package jdbcconnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import module.dsi.dsiController;

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
				dsiController.setDate(rs.getString("Date d'embauche"));
					
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
				dsiController.setDate(rs.getString("Date d'embauche"));
					
			}
            
            
            	
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
	}

}