package module.dsi;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import java.security.MessageDigest;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.gluonhq.charm.glisten.control.TextField;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import jdbcconnection.dsiData;
import module.finance.Profiles;
import module.finance.Vente;


public class dsiController implements Initializable
{

// Arraylist = Tableau / list de donnée  
	public static ArrayList<String> Name = new ArrayList<String>();
	public static ArrayList<String> Fonction = new ArrayList<String>();
	public static ArrayList<String> date = new ArrayList<String>() ;
	public static ArrayList<String> id = new ArrayList<String>() ;
	public static ArrayList<String> log = new ArrayList<String>() ;
	
	
	
	
	
	public static ArrayList<String> Name1 = new ArrayList<String>();
	public static ArrayList<String> Fonction1 = new ArrayList<String>();
	public static ArrayList<String> date1 = new ArrayList<String>() ;
	public static ArrayList<String> id1 = new ArrayList<String>() ;
	public static ArrayList<String> log1 = new ArrayList<String>() ;
	
	
	
	
	

	
	
	/**
	 * 
	 * 
	 *  element generé automatiquement sur scene builder  
	 */
	
    @FXML
    private TextField Noms;
 
    @FXML
    private TableView<TableUser> dataTable;
    
    @FXML
    private TableView<TableUser> dataTable1;


    @FXML
    private TableColumn<TableUser, String> dateDarrivee;
    
    @FXML
    private TableColumn<TableUser, String> dateDarrivee1;

    @FXML
    private TextField datedembauche;

    @FXML
    private TableColumn<TableUser, String> fonction;
    @FXML
    private TableColumn<TableUser, String> fonction1;

    @FXML
    private TextField fonctions;

    @FXML
    private TextField identifiant;

    @FXML
    private TextField mdp;

    @FXML
    private TableColumn<TableUser, String> nom;
    
    @FXML
    private TableColumn<TableUser, String> nom1;

    @FXML
    private TableColumn<TableUser, String> nouveauAncien;
    
    @FXML
    private TableColumn<TableUser, String> nouveauAncien1;

    @FXML
    private TableColumn<TableUser, String> prenom;
    @FXML
    private TableColumn<TableUser, String> prenom1;

    @FXML
    private Button logOut;
    
    
    
    
    
    /**
	 * 
	 *  element generé automatiquement sur scene builder 
	 *  
	 *   
	 *   
	 */
    
    
    
    
    
    
    
    
    
    
    
    
    

    int compteur = 0;
    
    @FXML
    void onNext(ActionEvent event) 
    
    {
    	compteur++;
    	
    	
    	
    	
    	
    	
    	if(Name.size()-1>=compteur)
	       
    		{
    		
    		
    		
    		Noms.setText(Name.get(compteur));
    		fonctions.setText(Fonction.get(compteur));
	        datedembauche.setText(date.get(compteur));
	        
	        
    		}
    	
    	if(compteur > Name.size()-1)
    	{
    		compteur = -1;
    	}
    	
    	
    	
    	
	       
	    	

    }

    
    @FXML
    void onPrev(ActionEvent event)
    {

    	
    }
    @FXML
    void soumettre(ActionEvent event) throws SQLException 
    
    {
    
       String login = identifiant.getText();
       String password =  mdp.getText();
       System.out.println(login);
       userAccount CreationProfile = new userAccount(login,password,id.get(compteur));
       CreationProfile.CreationIdentifiant();
       
       
       
       Name.clear();
       Fonction.clear();
       date.clear();
       id.clear();
       log.clear();
       
       
       Name1.clear();
       Fonction1.clear();
       date1.clear();
       id1.clear();
       log1.clear();
       
       
       dsiData.getDernierEmployee();
       dsiData.getSecondEmployee();
       affichageTables();
       if (!Name.isEmpty())
       {

           Noms.setText(Name.get(0));
           fonctions.setText(Fonction.get(0));
           datedembauche.setText(date.get(0));
           
    	   
       }
       else
       {
    	   
    	   Noms.setText("vide()");
           fonctions.setText("vide()");
           datedembauche.setText("vide()");
           
    	   
       }
    	   
      
       
       
       

    }
    
    
    // fonction permettant d'afficher les 2 tableaux
    
    
    

	 void affichageTables()
	 {
		 
		 
		 ObservableList<TableUser>data1 = FXCollections.observableArrayList(); // ArrayList qui va contenir des objets 
		 ObservableList<TableUser>data2 = FXCollections.observableArrayList(); 
		 
		 
		 for(int i = 0;i<Fonction.size();i++)
		 {
			 data1.add(new TableUser(Name.get(i),Fonction.get(i),log.get(i),date.get(i)));   // ici on insere les  objet de type TableUser par une boucle qui vas prendre les donnée stckée dans les arrayList Qui son au debut, 
			 
		 }
		 for(int i = 0;i<Fonction1.size();i++)
		 {
			 data2.add(new TableUser(Name1.get(i),Fonction1.get(i),log1.get(i),date1.get(i)));
		 }
		 
		
		 
		 
		 // ici on associe colone et donnée 
		 
		 nom.setCellValueFactory(new PropertyValueFactory<TableUser, String>("nom") );
		 fonction.setCellValueFactory(new PropertyValueFactory<TableUser, String>("fonction"));
		 dateDarrivee.setCellValueFactory(new PropertyValueFactory<TableUser, String>("date_arivee"));
		 nouveauAncien.setCellValueFactory(new PropertyValueFactory<TableUser, String>("status_Log"));
		 
		 
		 nom1.setCellValueFactory(new PropertyValueFactory<TableUser, String>("nom") );
		 fonction1.setCellValueFactory(new PropertyValueFactory<TableUser, String>("fonction"));
		 dateDarrivee1.setCellValueFactory(new PropertyValueFactory<TableUser, String>("date_arivee"));
		 nouveauAncien1.setCellValueFactory(new PropertyValueFactory<TableUser, String>("status_Log"));
		 
		 
		// ici on associe colone et donnée 
		 
		 
		 
		 // ici on insere les donnée recupéré et assignées au colone a leurs table pour l'a
		 
		 dataTable.setItems(data2);
		 dataTable1.setItems(data1);
		 
		 
		 
		 
		 
         
		 
	     
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
            dsiData.getSecondEmployee();
            affichageTables();
            
           
            
            if(!Name.isEmpty())
            {
            	
            
            Noms.setText(Name.get(0));
            fonctions.setText(Fonction.get(0));
            datedembauche.setText(date.get(0));
            
            }
            
           
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		
			
		}	
	}

}
