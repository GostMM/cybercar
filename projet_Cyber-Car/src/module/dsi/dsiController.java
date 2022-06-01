package module.dsi;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import java.security.MessageDigest;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.gluonhq.charm.glisten.control.TextField;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import jdbcconnection.dsiData;

public class dsiController implements Initializable
{


	private static String Name;
	private static String Fonction;
	private static String date ;
	private static String id;
	
	public String getName() {
		return Name;
	}

	public static void setName(String name) {
		Name = name;
	}

	public String getFonction() {
		return Fonction;
	}

	public static void setFonction(String fonction) {
		Fonction = fonction;
	}

	public String getDate() {
		return date;
	}

	public static void setDate(String Date) {
		date = Date;
	}
	
	public static void setId(String id) {
		dsiController.id = id;
	}

	
	
	
	
    @FXML
    private TextField Noms;
 
    @FXML
    private TableView<?> dataTable;

    @FXML
    private TableColumn<?, ?> dateDarrivee;

    @FXML
    private TextField datedembauche;

    @FXML
    private TableColumn<?, ?> fonction;

    @FXML
    private TextField fonctions;

    @FXML
    private TextField identifiant;

    @FXML
    private TextField mdp;

    @FXML
    private TableColumn<?, ?> nom;

    @FXML
    private TableColumn<?, ?> nouveauAncien;

    @FXML
    private TableColumn<?, ?> prenom;

    @FXML
    private Button logOut;
    

    @FXML
    void soumettre(ActionEvent event) 
    
    {
    
    	String login = identifiant.getText();
    	String password =  mdp.getText();
    	
    	System.out.println(login);
       userAccount CreationProfile = new userAccount(login,password,id);
       CreationProfile.CreationIdentifiant();

    }

	 void affichageCreation()
	 {
         
	     
	 }
	 
	    /**
	     * button se Deconnecter
	     * @param event
	     * @throws IOException
	     */
	    @FXML
	    void onLogout(ActionEvent event) throws IOException {
	    	
	    	Stage thisFenetre = (Stage) logOut.getScene().getWindow();
	    	
	    	Parent authentification = FXMLLoader.load(getClass().getResource("projet Fxml/connexion.fxml"));
	    	Stage Fenetre  = new Stage();
	    	
	    	
	    	new Thread(new Runnable(){
	    		public void run() {
	    			try {
						Thread.sleep(3000);
	    			    Platform.runLater(new Runnable(){
	    				@Override
	    				public void run() {
	    				
	    					thisFenetre.close();
							Scene fenetre0 = new Scene(authentification);
							Fenetre.setScene(fenetre0);
							Fenetre.setTitle("AUTHENTIFICATION");
							Fenetre.setResizable(false);
							Fenetre.centerOnScreen();
							Fenetre.show();
	    			    	
	    				}
	    			});
	    			
	    		} catch (Exception e) {
					e.printStackTrace();
				};
	    		
	    		}}).start();

	    }
	    
	    
	    
	    
	  
	    
	    
	    
	    
	    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		
		
		try {
            
            dsiData.getDernierEmployee();
            Noms.setText(Name);
            fonctions.setText(Fonction);
            datedembauche.setText(date);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			try {
				dsiData.getSecondEmployee();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Noms.setText(Name); 
			fonctions.setText(Fonction);
			datedembauche.setText(date);
			
		}	
	}

}
