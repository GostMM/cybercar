package jdbcconnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Properties;
import java.util.Random;


public class ConnectoDataBase
{

  



	
	public static Connection getConnection() throws SQLException 
	{
		
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost/Cybercar","root","");
		System.out.print("vous etes connectez ");
		return conn;

	}

	
	 
	 
	}

	


	

