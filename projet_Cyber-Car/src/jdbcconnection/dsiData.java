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
				
				dsiController.id = rs.getInt("id");
				dsiController.setName(rs.getString("Nom"));
				dsiController.setFonction(rs.getString("fonction"));
				dsiController.setDate(rs.getString("DateEmbauche"));
					
			}
            
            
            	
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
	
		
	}
	

	public static void getSecondEmployee(String login,String mdp,int id) throws SQLException 
	{
		String query = "{ call updateLogin(?,?,?) }";
        ResultSet rs;

        try
        { Connection conn = ConnectoDataBase.getConnection();
        	CallableStatement stmt = conn.prepareCall(query);
        	stmt.setString(1,login);
        	stmt.setString(2, mdp);
        	stmt.setInt(3, id);
            stmt.execute();
            
            
            	
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
	}
	
	

}
