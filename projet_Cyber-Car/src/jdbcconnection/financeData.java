package jdbcconnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import module.finance.adminController;
import module.finance.controllerAchat;


/**
 * @author MROIVILI MOUSTOIFA 
 * 
 * Cette class est la classe qui gere les donnée de la partie admin via des procedure stockées
 *
 */
public class financeData
{
	
	
	/**
	 * cette methode permet avec un procedure stockée de prendre tout les voiture Renault dans la base de donnée ;
	 * @return true si les donnée ont bien ete reçu false sinon;
	 * @throws SQLException
	 */
	public static boolean getAllVoitureRenault() throws SQLException
	{
		ArrayList<String> imgCar = new ArrayList<String>();
		ArrayList<String> prixCar = new ArrayList<String>();
		ArrayList<String> VitesseCar = new ArrayList<String>();
		ArrayList<String> nomCar = new ArrayList<String>();
		ArrayList<String> ids = new ArrayList<String>();
		ArrayList<String> all = new ArrayList<String>();
		
		
		   String query = "{ call Renaultcar() }";
	        ResultSet rs;

	        try (Connection conn = ConnectoDataBase.getConnection();
	                CallableStatement stmt = conn.prepareCall(query))
	        {
	            rs = stmt.executeQuery();
	            while(rs.next())
	            {
	            	
	            	imgCar.add(rs.getString("img"));
	            	prixCar.add(rs.getString("prix"));
	            	VitesseCar.add(rs.getString("vitesse"));
	            	nomCar.add(rs.getString("nomVoiture"));
	            	ids.add(rs.getString("idCar_Shop"));
	            
	            	
	            	controllerAchat.setRenaultid(ids);
	            	controllerAchat.setRenaultNom(nomCar);
	            	controllerAchat.setRenaultprice(prixCar);
	            	controllerAchat.setRenaultimg(imgCar);
	            	controllerAchat.setRenaultVitesse(VitesseCar);
	   
	            	
	            
	            	
	        
	            }
	            rs.close();
	            return true;
	            
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	            return false;
	        }
			
			
			
	
	}

	/**
	 * cette methode permet avec un procedure stockée de prendre tout les voiture Tesla dans la base de donnée ;
	 * @return true si les donnée ont bien ete reçu false sinon;
	 * @throws SQLException
	 */
	public static boolean getallvoitureTestla()throws SQLException
	{
		ArrayList<String> imgCar = new ArrayList<String>();
		ArrayList<String> prixCar = new ArrayList<String>();
		ArrayList<String> VitesseCar = new ArrayList<String>();
		ArrayList<String> nomCar = new ArrayList<String>();
		ArrayList<String> ids = new ArrayList<String>();
		ArrayList<String> all = new ArrayList<String>();
		
		
		   String query = "{ call TeslaCar() }";
	        ResultSet rs;

	        try (Connection conn = ConnectoDataBase.getConnection();
	                CallableStatement stmt = conn.prepareCall(query))
	        {
	            rs = stmt.executeQuery();
	            while(rs.next())
	            {
	            	
	            	imgCar.add(rs.getString("img"));
	            	prixCar.add(rs.getString("prix"));
	            	VitesseCar.add(rs.getString("vitesse"));
	            	nomCar.add(rs.getString("nomVoiture"));
	            	ids.add(rs.getString("idCar_Shop"));
	            
	            	
	            	//System.out.print(ids);
	            	
	            	controllerAchat.setTeslaid(ids);
	            	controllerAchat.setTeslaNom(nomCar);
	            	controllerAchat.setTeslaprice(prixCar);
	            	controllerAchat.setTeslaimg(imgCar);
	            	controllerAchat.setTeslaVitesse(VitesseCar);
	   
	            	
	            
	            	
	        
	            }
	            rs.close();
	            return true;
	            
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	            return false;
	        }
			
		
	}

	/**
	 * cette methode permet avec un procedure stockée de prendre tout les voiture Chevrolet dans la base de donnée ;
	 * @return true si les donnée ont bien ete reçu false sinon;
	 * @throws SQLException
	 */
	public static boolean getallvoitureChevrolet()throws SQLException
	{
		ArrayList<String> imgCar = new ArrayList<String>();
		ArrayList<String> prixCar = new ArrayList<String>();
		ArrayList<String> VitesseCar = new ArrayList<String>();
		ArrayList<String> nomCar = new ArrayList<String>();
		ArrayList<String> ids = new ArrayList<String>();
		ArrayList<String> all = new ArrayList<String>();
		
		
		   String query = "{ call chevrolet_car() }";
	        ResultSet rs;

	        try (Connection conn = ConnectoDataBase.getConnection();
	                CallableStatement stmt = conn.prepareCall(query))
	        {
	            rs = stmt.executeQuery();
	            while(rs.next())
	            {
	            	
	            	imgCar.add(rs.getString("img"));
	            	prixCar.add(rs.getString("prix"));
	            	VitesseCar.add(rs.getString("vitesse"));
	            	nomCar.add(rs.getString("nomVoiture"));
	            	ids.add(rs.getString("idCar_Shop"));
	            
	            	
	            	controllerAchat.setChevroletid(ids);
	            	controllerAchat.setChevroletNom(nomCar);
	            	controllerAchat.setChevroletprice(prixCar);
	            	controllerAchat.setChevroletimg(imgCar);
	            	controllerAchat.setChevroletVitesse(VitesseCar);
	   
	            	
	           
	            	
	        
	            }
	            rs.close();
	            return true;
	            
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	            return false;
	        }
			
		
	}

	/**
	 * cette methode permet avec un procedure stockée de prendre tout les voiture Toyota dans la base de donnée ;
	 * @return true si les donnée ont bien ete reçu false sinon;
	 * @throws SQLException
	 */
	public static boolean getallvoitureToyota()throws SQLException
	{
		ArrayList<String> imgCar = new ArrayList<String>();
		ArrayList<String> prixCar = new ArrayList<String>();
		ArrayList<String> VitesseCar = new ArrayList<String>();
		ArrayList<String> nomCar = new ArrayList<String>();
		ArrayList<String> ids = new ArrayList<String>();
		ArrayList<String> all = new ArrayList<String>();
		
		
		   String query = "{ call Toyota() }";
	        ResultSet rs;

	        try (Connection conn = ConnectoDataBase.getConnection();
	                CallableStatement stmt = conn.prepareCall(query))
	        {
	            rs = stmt.executeQuery();
	            while(rs.next())
	            {
	            	
	            	imgCar.add(rs.getString("img"));
	            	prixCar.add(rs.getString("prix"));
	            	VitesseCar.add(rs.getString("vitesse"));
	            	nomCar.add(rs.getString("nomVoiture"));
	            	ids.add(rs.getString("idCar_Shop"));
	            
	            	
	            	controllerAchat.setToyotaid(ids);
	            	controllerAchat.setToyotaNom(nomCar);
	            	controllerAchat.setToyotaprice(prixCar);
	            	controllerAchat.setToyotaimg(imgCar);
	            	controllerAchat.setToyotaVitesse(VitesseCar);
	   
	            	
	            
	            	
	        
	            }
	            rs.close();
	            return true;
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	            return false;
	        }
			
		
	}
	
	/**
	 * on appelle le chiffre d'affre reliser
	 * @return le chifre d'affaire sinon 0 
	 * @throws SQLException
	 */
	public static int getChiffreDaffaire() throws SQLException
	{
		   String query = "{ call chiffreDaffaire() }";
	        ResultSet rs;

	        try (Connection conn = ConnectoDataBase.getConnection();
	                CallableStatement stmt = conn.prepareCall(query))
	        {
	            rs = stmt.executeQuery();
	            if(rs.next())
	            	
	            	return rs.getInt("ChifreDaffaire");
	            	rs.close();
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	        }
			return 0;
			
	
	}
	
	/**
	 * on appele le total de vente 
	 * @return le nombre total de vente 
	 * @throws SQLException
	 */
	public static int getTotalVente() throws SQLException
	{
		String query = "{ call totalVente() }";
        ResultSet rs;

        try (Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query))
        {
            rs = stmt.executeQuery();
            if(rs.next())
            	return rs.getInt("total");
            	rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
		return 0;
		
	}
	
	/**
	 * @return le nombre de comande passer sinon 0 
	 * @throws SQLException
	 */
	public static  int nombrCommande() throws SQLException
	{
		
		String query = "{ call nbrComande() }";
        ResultSet rs;

        try (Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query))
        {
            rs = stmt.executeQuery();
            if(rs.next())
            	
            	return rs.getInt("nbrComande");
            	rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
		return 0;
		
	}
	
	/**
	 * @return total d'employée sinon 0
	 * @throws SQLException
	 */
	public static int totalEmployee() throws SQLException
	{


		String query = "{ call nbremployee() }";
        ResultSet rs;

        try (Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query))
        {
            rs = stmt.executeQuery();
            if(rs.next())
            	return rs.getInt("nbremployee");
            	rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
		return 0;
		
	}
	
	/**
	 * @return le nombre de voiture en stock sinon 0
	 * @throws SQLException
	 */
	public static int getVoitureEnStock() throws SQLException
	{


		String query = "{ call stockVoiture() }";
        ResultSet rs;

        try (Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query))
        {
            rs = stmt.executeQuery();
            if(rs.next())
            	return rs.getInt("stockVoiture");
            	rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
		return 0;
		
	}
	
	/**
	 * @return derniere date de connexion 
	 * @throws SQLException
	 */
	public void getDateConnectLast() throws SQLException
	{

		
	}

	public ResultSet getEmplacementCommande(int nSuivi) throws SQLException
	{


		String query = "{ call stockVoiture() }";
        ResultSet rs;

        try (Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query))
        {
            rs = stmt.executeQuery();
            if(rs.next())
            	return rs;
            	rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
		return null;
		
	}
	
	/**
	 * methode pour mettre à jour le stock
	 * @param id identifiant de la voiture 
	 * @param quantite la quantite acheter 
	 * @param entrepot dans quel entrepot ça part 
	 */
	public static void setUpdateStock(int id,int quantite,int entrepot)
	{
		String query = "{ call UpdateStock(?,?,?) }";
	       

        try {
        	
        		Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query);
                stmt.setInt(1, id);
                stmt.setInt(2,quantite);
                stmt.setInt(3, entrepot);
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

	/**
	 * @return
	 */
	public static int generateNsuivi()
	{
		String query = "{ call LastID() }";
        ResultSet rs;

        try (
        		Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query))
        {
            rs = stmt.executeQuery();
            if(rs.next())
            	return rs.getInt("Nsuivi")+1;
            	rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
		return 0;
	}
	
	

	/**
	 * 
	 * cette methode envoie la commande passer dans la table de commande
	 * 
	 * @param idVoiture identifiant de la commander 	
	 * @param nameCar nom de la voiture 
	 * @param Quantite la quantite 
	 * @param entrepot l'entrepôt ou ça part ! 
	 */
	public static void setCommande(int idVoiture,String nameCar,int Quantite,int entrepot)
	{
		
		
		
		String query = "{ call Commander(?,?,?,?) }";
       

        try {
        	
        		Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query);
                stmt.setInt(1, idVoiture);
                stmt.setString(2,nameCar);
                stmt.setInt(3, Quantite);
                stmt.setInt(4, entrepot);
                stmt.execute();
                stmt.close();
                
				/*
				 * Alert alert = new Alert(AlertType.INFORMATION); alert.setWidth(600);
				 * alert.setHeight(600); alert.setTitle("LA COMMANDE");
				 * alert.setHeaderText("etat de la commande");
				 * alert.setContentText("Votre à vien été envoyer voici le Numero de suivi : "
				 * +generateNsuivi()); alert.showAndWait();
				 */
        		
                
                		
        	
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
	
	/**
	 * @return true si valeur disponible sinon false 
	 */
	public static boolean getDataRapport()
	{
		ArrayList<String> date = new ArrayList<String>();
		ArrayList<Integer> nbrVente = new ArrayList<Integer>();
		ArrayList<Number> chiffre = new ArrayList<Number>();
		
		
		
		   String query = "{ call graphique() }";
	        ResultSet rs;

	        try (Connection conn = ConnectoDataBase.getConnection();
	                CallableStatement stmt = conn.prepareCall(query))
	        {
	            rs = stmt.executeQuery();
	            while(rs.next())
	            {
	            	
	            	date.add(rs.getString("dateDachat"));
	            	nbrVente.add(rs.getInt("nbrVente"));
	            	chiffre.add(rs.getDouble("chiffre"));
	            	
	            
	            	
	            	adminController.DateR = date;
	            	adminController.nbrVenteR = nbrVente;
	            	adminController.chiffreR = chiffre;

	        
	            }
	            rs.close();
	           return true; 
	           
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	            return false;
	        }
		
	}

	/**
	 * @return true si valeur disponible sinon false 
	 */
	public static boolean getDepVente()
	{
		
		ArrayList<Integer> transaction = new ArrayList<Integer>();
		ArrayList<String> date = new ArrayList<String>();
		ArrayList<Double> montant = new ArrayList<Double>();
		ArrayList<Double> remise = new ArrayList<Double>();
		
		
		
		   String query = "{ call depVente() }";
	        ResultSet rs;

	        try (Connection conn = ConnectoDataBase.getConnection();
	                CallableStatement stmt = conn.prepareCall(query))
	        {
	            rs = stmt.executeQuery();
	            while(rs.next())
	            {
	            	
	            	transaction.add(rs.getInt("idclients"));
	            	date.add(rs.getString("dateDachat"));
	            	montant.add(rs.getDouble("montant"));
	            	remise.add(rs.getDouble("ramise"));
	            
	            	
	            	
	            	
	            	adminController.Transaction = transaction;
	            	adminController.Date = date;
	            	adminController.Montant = montant;
	            	adminController.Remise = remise;

	        
	            }
	            rs.close();
	            return true;
	            
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	            return false;
	        }
		

		
	}

	/**
	 * cette methode permet d'accorder une remise au client 
	 * @param Transaction Numero de la transaction 
	 * @param Remise Remise attribuer 
	 */
	public static void UpdateRemiseClient(int Transaction,Double Remise)
	{
		
		String query = "{ call RemiseUpdate(?,?) }";
	       

        try {
        	
        		Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query);
                stmt.setInt(1, Transaction);
                stmt.setDouble(2,Remise);
             
                stmt.execute();
                stmt.close();
                
                
    	}
		
        catch (SQLException ex) {
     	   
     	Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setWidth(600);
    		alert.setHeight(600);
    		alert.setTitle("Remise ");
    		alert.setHeaderText("Le probleme");
    		alert.setContentText("une Erreur s'est produite =>>>"+ex.getMessage());
    		alert.showAndWait();
             //System.out.println(ex.getMessage());
         }
		
	}
	
	/**
	 * cette methode permet de creer un rapport periodique au niveau de la vente 
	 * @param du date de depart 
	 * @param au date de fin 
	 */
	public static void getRapportByDate(String du,String au)
	
	{

		ArrayList<Integer> transaction = new ArrayList<Integer>();
		ArrayList<String> date = new ArrayList<String>();
		ArrayList<Double> montant = new ArrayList<Double>();
		ArrayList<Double> remise = new ArrayList<Double>();
		
		String query = "{ call RapportPeriodique(?,?) }";
		ResultSet rs;
	       

        try {
        	
        		Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query);
                stmt.setString(1, du);
                stmt.setString(2,au);
                rs = stmt.executeQuery();
                
                while(rs.next())
                {
                	transaction.add(rs.getInt("idclients"));
	            	date.add(rs.getString("dateDachat"));
	            	montant.add(rs.getDouble("montant"));
	            	remise.add(rs.getDouble("ramise"));
	            	
	            
	            
	        
	            	
	            	
	            	adminController.Transaction = transaction;
	            	adminController.Date = date;
	            	adminController.Montant = montant;
	            	adminController.Remise = remise;
                	
                }
                rs.close();
                
        
        	
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
		
	/**
	 * @return true les donnée disponible dans le departement Ressources Humaines  sinon false si y'en a pas ! 
	 */
	public static boolean getEmmployeeData()
	{
		
		String query = "{ call GetEmployee() }";
        ResultSet rs;

        try (Connection conn = ConnectoDataBase.getConnection();
             CallableStatement stmt = conn.prepareCall(query))
        {
            rs = stmt.executeQuery();
            while(rs.next())
            {
            	adminController.Nom.add(rs.getString("nom"));
            	adminController.Prenom.add(rs.getString("prenom"));
            	adminController.nJeuneFille.add(rs.getString("nomDeJeuneFille"));
            	adminController.Civilite.add(rs.getString("civilite"));
            	adminController.NbrEnfant.add(rs.getString("nbr enfant"));
            	adminController.Fonction.add(rs.getString("fonction"));
            	adminController.Dembauche.add(rs.getString("date_embauche"));
            	adminController.CongRestant.add(rs.getString("nbr_de_conge_restant"));
            	adminController.Fcontrat.add(rs.getString("date_fin_de_contrat"));
            	adminController.Adresse.add(rs.getString("adresse"));
            	adminController.Ntel.add(rs.getString("tel"));
            	adminController.Email.add(rs.getString("email"));
            	
            	
        
            }
            rs.close();
            return true;
        } catch (SQLException ex) {
        	
            System.out.println(ex.getMessage());
            return false;
        }
		
	
		
	}
	
	
	public static boolean getAllLocalistation()
	{
		
		String query = "{ call localisation() }";
        ResultSet rs;

        try (Connection conn = ConnectoDataBase.getConnection();
             CallableStatement stmt = conn.prepareCall(query))
        {
            rs = stmt.executeQuery();
            while(rs.next())
            {
            	adminController.Refs.add(rs.getString("RefrenceComande"));	
            	adminController.Localisations.add("Commande en cours de Traitement");
            
            	//System.out.println(rs.getString("RefrenceComande"));
            }
            
            rs.close();
            return true;
        } catch (SQLException ex) {
        	
            System.out.println(ex.getMessage());
            return false;
        }
		
		
	}
	
	public static boolean getLocalistation(int i)
	{
		
		String query = "{ call Nsuivi(?) }";
        ResultSet rs;

        try (Connection conn = ConnectoDataBase.getConnection();
             CallableStatement stmt = conn.prepareCall(query))
        {
        	stmt.setInt(1,i);
            rs = stmt.executeQuery();
            while(rs.next())
            {
            		
            	adminController.Localisation  = "Pas encore de donnée disponible pour la voiture "+rs.getString("nomVoiture");
            
            	//System.out.println(rs.getString("RefrenceComande"));
            }
            
            rs.close();
            return true;
        } catch (SQLException ex) {
        	
            System.out.println(ex.getMessage());
            return false;
        }
		
		
	}

}
	
	
	
	