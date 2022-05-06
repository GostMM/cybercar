package Junit;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import jdbcconnection.ConnectoDataBase;

class ConnectTest {
	
	@DisplayName("test de connexion ")
	@Test
	void test() throws SQLException
	{
		
		assertNotNull(ConnectoDataBase.getConnection());
		
	}

}
