package Junit;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import jdbcconnection.financeData;

class dataFinanceTest {

	@DisplayName("test de recuperation de donnée !")
	@Test
	void test() throws SQLException{
		
		assertTrue(financeData.getallvoitureChevrolet());
		assertTrue(financeData.getAllVoitureRenault());
		assertTrue(financeData.getallvoitureTestla());
		assertTrue(financeData.getallvoitureToyota());
		assertNotNull(financeData.getChiffreDaffaire());
		assertTrue(financeData.getDataRapport());
		assertTrue(financeData.getDepVente());
		assertTrue(financeData.getEmmployeeData());
		
		
		
		
		
	}

}
