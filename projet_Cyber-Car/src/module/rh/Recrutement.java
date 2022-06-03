package module.rh;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.gluonhq.charm.glisten.control.TextField;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import jdbcconnection.rhData;

public class Recrutement implements Initializable  {

	
	public static ArrayList<String> noms = new ArrayList<String>();
	public static ArrayList<String> prenoms = new ArrayList<String>();
	public static ArrayList<String> civilites = new ArrayList<String>();
	public static ArrayList<String> fonctions = new ArrayList<String>();
	public static ArrayList<String> emails = new ArrayList<String>();
	public static ArrayList<String> tels = new ArrayList<String>();
	public static ArrayList<String> dEmbauches = new ArrayList<String>();
	public static ArrayList<String> dFinContrat = new ArrayList<String>();
	
	
	
	
	
	
	
	
    @FXML
    private TableColumn<profileModel,String> Dembauche;

    @FXML
    private TableColumn<profileModel,String> DfContrat;

    @FXML
    private TextField FonctionProfile;

    @FXML
    private RadioButton Madame;

    @FXML
    private RadioButton Monsieur;

    @FXML
    private ToggleGroup assurance;

    @FXML
    private TableColumn<profileModel,String>civCol;

    @FXML
    private ToggleGroup civilite;

    @FXML
    private ToggleGroup conjugale;

    @FXML
    private Text dConnect;

    @FXML
    private DatePicker dEmbauche;

    @FXML
    private TableColumn<profileModel,String> fonCol;

    @FXML
    private TextField indic;

    @FXML
    private TextField mail;

    @FXML
    private TableColumn<profileModel,String> mailCol;

    @FXML
    private ToggleGroup medicale;

    @FXML
    private TextField motifMedic;

    @FXML
    private TextField nSecurité;

    @FXML
    private TextField nbrEnfant;

    @FXML
    private TextField njFille;

    @FXML
    private TextField nom;

    @FXML
    private TableColumn<profileModel,String> nomCol;

    @FXML
    private TextField nomProfile;

    @FXML
    private TextField postA;

    @FXML
    private TextField postN;

    @FXML
    private TableColumn<profileModel,String>prenCol;

    @FXML
    private TextField prenom;

    @FXML
    private TextField prenomProfile;

    @FXML
    private RadioButton profilCMme;

    @FXML
    private RadioButton profilCMr;

    @FXML
    private ToggleGroup profile;

    @FXML
    private TextField salaire;

    @FXML
    private TextField salaireProfile;

    @FXML
    private Button soumetre;

    @FXML
    private Tab tabBoard;

    @FXML
    private Tab tabProfile;

    @FXML
    private TableView<profileModel> tableData;

    @FXML
    private TextField tel;

    @FXML
    private TableColumn<profileModel,String> telCol;

    @FXML
    private Text userName;

    @FXML
    private Text userName1;
    
    
    
    String civil ;
    String conjugal;
    String medic;
    String assure;
    
    
    
    
    
    
    
    

    @FXML
    void BntMrSelected(ActionEvent event) 
    {
    	
    	civil = "Mr";

    }

    @FXML
    void BtnMmeSelected(ActionEvent event) {
    	
    	civil = "Mme";

    }

    @FXML
    void MarieSelect(ActionEvent event) 
    {

    	conjugal = "Marié(e)";
    }

    @FXML
    void celibSelect(ActionEvent event) {
    	
    	conjugal = "celib";

    }

    @FXML
    void noAssurance(ActionEvent event) {
    	
    	assure = "non";

    }
    
    @FXML
    void yesAssurance(ActionEvent event) 
    {
    	assure = "oui";

    }
    
    

    @FXML
    void noMedical(ActionEvent event) 
    {
    	
    	medic = "non";

    }
    
    @FXML
    void yesMedical(ActionEvent event) 
    {

    	medic = "oui";
    }
    
    
    

   

    @FXML
    void onSoumet(ActionEvent event) 
    {
    	profileModel user = new profileModel(
    			nom.getText(),
    			prenom.getText(),
    			njFille.getText(),
    			civil,postN.getText(),
    			mail.getText(),
    			"nul part",
    			tel.getText(),
    			indic.getText(),
    			dEmbauche.getValue().toString(),
    			dEmbauche.getValue().toString(),postA.getText(),
    			postN.getText(),
    			conjugal,nbrEnfant.getText(),
    			medic, assure,
    			salaire.getText());
    	
    	user.CreeProfile();
    	

    }
    
    
    
    @FXML
    void onProfile(ActionEvent event) 
    {

    }

    @FXML
    void onRecrute(ActionEvent event) 
    {

    }
    
    
    void lauchDataProfiles()
    {
    	ObservableList<profileModel>data = FXCollections.observableArrayList();
    	
    	for(int i=0;i<noms.size();i++)
    	{
    		data.add(new profileModel(noms.get(i), prenoms.get(i),null, civilites.get(i),fonctions.get(i),emails.get(i),null,tels.get(i),null,dEmbauches.get(i),dFinContrat.get(i),null,null,null,null,null,null,null));
    	}
    	
    	nomCol.setCellValueFactory(new PropertyValueFactory<profileModel,String>("nom"));
    	prenCol.setCellValueFactory(new PropertyValueFactory<profileModel,String>("prenom"));
    	civCol.setCellValueFactory(new PropertyValueFactory<profileModel,String>("civilite"));
    	fonCol.setCellValueFactory(new PropertyValueFactory<profileModel,String>("fonction"));
    	mailCol.setCellValueFactory(new PropertyValueFactory<profileModel,String>("mail"));
    	telCol.setCellValueFactory(new PropertyValueFactory<profileModel,String>("tel"));
    	Dembauche.setCellValueFactory(new PropertyValueFactory<profileModel,String>("dEmbauche"));
    	DfContrat.setCellValueFactory(new PropertyValueFactory<profileModel,String>("dFinContrat"));
    	
    	System.out.println(noms);
    	
    	tableData.setItems(data);
    	
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		rhData.getallUsers();
		
		lauchDataProfiles();
		
	}

   

    

}
