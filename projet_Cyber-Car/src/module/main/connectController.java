package module.main;
import java.io.IOException;
import java.sql.SQLException;

import com.gluonhq.charm.glisten.control.TextField;
import com.jfoenix.controls.JFXButton;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
//import module.dsi.userAccount;


public class connectController extends Application{

	public boolean fermePage = false;
	
	
	
	/**
	 * Cretion de la premiere fenetre de connexion
	 * @param PageAuthentification initialisation de la fenetre Stage
	 */
	@Override
	public void start(Stage PageAuthentification) throws Exception {
		
		
		
		Parent authentification  = FXMLLoader.load(getClass().getResource("/module/finance/projet Fxml/connexion.fxml"));
		Scene fenetre1  = new Scene(authentification);
		PageAuthentification.setScene(fenetre1);
		PageAuthentification.setResizable(false);
		PageAuthentification.centerOnScreen();
		PageAuthentification.setTitle("page de Connexion");
		PageAuthentification.show();
		
		
	
	}
	
	public static void main(String[] args) throws SQLException { // TODO Auto-generated method stub
		  Application.launch(args);
		  
		 
	}
    @FXML
    private JFXButton connect;

    @FXML
    private TextField login;

    @FXML
    private TextField mdp;

    /**
     * Action sur le button se connecter  et attribution interface en fonction des role
     * @param event
     * @throws IOException
     */
    @FXML
    void OnConnect(ActionEvent event) throws IOException
    {
    	
    
    	String log = login.getText();
     
    	String pass = mdp.getText();
    	
    	//userAccount Connect = new userAccount(log,pass,null);
    	
    	
    	if(/*Connect.EtablishConnexion()*/ true)
    	{
			/* String role = Connect.getRole(); */
    		
    		String role = log;
    		
    		
    		 if (role.equals("CFO"))	
    		    {
    		    	 Stage fenetre1 = (Stage) connect.getScene().getWindow();
    			     fenetre1.close();
    			     Stage fenetre2 = new Stage();
    			     Parent page2  = FXMLLoader.load(getClass().getResource("/module/finance/projet Fxml/dash2.fxml"));
    			     Scene dashboard = new Scene(page2);
    			     fenetre2.setScene(dashboard);
    			     fenetre2.setTitle("Dasboard");
    			     fenetre2.show();
    		    }
    			     
    		     
    		     
    		     if (role.equals("RH")) 
    		     {
    		    	 	 Stage fenetre1 = (Stage) connect.getScene().getWindow();
    		    	     fenetre1.close();
    		    	     Stage fenetre2 = new Stage();
    		    	     Parent page2  = FXMLLoader.load(getClass().getResource("/module/rh/projet Fxml/Recrutement3.fxml"));
    		    	     Scene dashboard = new Scene(page2);
    		    	     fenetre2.setScene(dashboard);
    		    	     fenetre2.setTitle("Dasboard");
    		    	     fenetre2.show();
    		     }

    		     if (role.equals("DSI")) 
    		     {
    		    	 	 Stage fenetre1 = (Stage) connect.getScene().getWindow();
    		    	     fenetre1.close();
    		    	     Stage fenetre2 = new Stage();
    		    	     Parent page2  = FXMLLoader.load(getClass().getResource("/module/dsi/projet Fxml/Page_Principal.fxml"));
    		    	     Scene dashboard = new Scene(page2);
    		    	     fenetre2.setScene(dashboard);
    		    	     fenetre2.setTitle("Dasboard");
    		    	     fenetre2.show();
    		     }
    		     
    		     
    		     if (role.equals("VENTE")) 
    		     {
    		    	 	 Stage fenetre1 = (Stage) connect.getScene().getWindow();
    		    	     fenetre1.close();
    		    	     Stage fenetre2 = new Stage();
    		    	     Parent page2  = FXMLLoader.load(getClass().getResource("/module/dsi/projet Fxml/Page_Principal.fxml"));
    		    	     Scene dashboard = new Scene(page2);
    		    	     fenetre2.setScene(dashboard);
    		    	     fenetre2.setTitle("Dasboard");
    		    	     fenetre2.show();
    		     }
    	}
    	
    	
    	
    
   
   
   
    }

    @FXML
    void loginValue(MouseEvent event) {

    }

    @FXML
    void mdpValue(MouseEvent event) {

    }

	}
