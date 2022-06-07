package module.rh;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

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
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import jdbcconnection.ConnectoDataBase;
import jdbcconnection.rhData;

public class Recrutement implements Initializable  {

	
	public static ArrayList<Integer> id = new ArrayList<Integer>();
	public static ArrayList<String> noms = new ArrayList<String>();
	public static ArrayList<String> prenoms = new ArrayList<String>();
	public static ArrayList<String> civilites = new ArrayList<String>();
	public static ArrayList<String> fonctions = new ArrayList<String>();
	public static ArrayList<String> emails = new ArrayList<String>();
	public static ArrayList<String> tels = new ArrayList<String>();
	public static ArrayList<String> adrsPostale = new ArrayList<String>();
	public static ArrayList<String> dEmbauches = new ArrayList<String>();
	public static ArrayList<String> dFinContrat = new ArrayList<String>();
	public static ArrayList<String> uSalaire = new ArrayList<String>();
	

	
	
	

	
	
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
    private TextField aPostale;
    
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
    private TableColumn<profileModel, String> adrsPostaleCol;
    
    @FXML
    private TableColumn<profileModel, Integer> idCol;

    @FXML
    private Text userName;

    @FXML
    private Text userName1;
    
    @FXML
    private Pane update;

    @FXML
    private TextField userID;
    

    @FXML
    private TableColumn<profileModel, String> sCol;
    
   
    
   
    
    
    
    String civil ;
    String conjugal;
    String medic;
    String assure;
    
    
    ResultSet rs = null;
	PreparedStatement pst = null;
	
	int compteur  = 0;
    
    
     @FXML
	    void onSuite(ActionEvent event) 
	    {
			
			nomProfile.setText(noms.get(compteur));
			compteur++;
			
			String nomsGet = nomProfile.getText();
			 
			System.out.println(id.get(compteur));
			
			
			System.out.println(nomsGet+ "   à  l'id = "+id.get(compteur) );
			


	    }
	
    
    

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
    	
    	conjugal = "Célibataire";

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
    void updateTableData(ActionEvent event) {
    	
    	refresehTableDataProfiles();
  

    }
    
   

   
    			int i;
    @FXML
    void onSoumet(ActionEvent event) 
    {
    	
    	if (Regex.regexSalaire(salaire.getText())) {
    		
    		System.out.println("Salaire bien pris en compte.");
    	} else {
    		System.out.println("Salaire mal ecrit.");
    	}
    		
    		
    	
    	profileModel user = new profileModel(
    			nom.getText(),
    			prenom.getText(),
    			njFille.getText(),
    			civil,
    			postN.getText(),
    			mail.getText(),
    			tel.getText(),
    			indic.getText(),
    			dEmbauche.getValue().toString(),
    			dEmbauche.getValue().toString(),
    			postA.getText(),
    			postN.getText(),
    			conjugal,
    			nbrEnfant.getText(),
    			aPostale.getText(),
    			
    			medic, 
    			assure,
    			salaire.getText(),
    			i);
    	
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
    		data.add(new profileModel(
    				noms.get(i),
    				prenoms.get(i),
    				null,
    				civilites.get(i),
    				fonctions.get(i),
    				adrsPostale.get(i),
    				emails.get(i),
    				tels.get(i),
    				null,
    				dEmbauches.get(i),
    				dFinContrat.get(i),
    				null,null,null,null,null,null,
    				uSalaire.get(i),
    				id.get(i)));
    	}
    	
    	idCol.setCellValueFactory(new PropertyValueFactory<profileModel,Integer>("id"));
    	nomCol.setCellValueFactory(new PropertyValueFactory<profileModel,String>("nom"));
    	prenCol.setCellValueFactory(new PropertyValueFactory<profileModel,String>("prenom"));
    	civCol.setCellValueFactory(new PropertyValueFactory<profileModel,String>("civilite"));
    	fonCol.setCellValueFactory(new PropertyValueFactory<profileModel,String>("fonction"));
    	mailCol.setCellValueFactory(new PropertyValueFactory<profileModel,String>("mail"));
    	telCol.setCellValueFactory(new PropertyValueFactory<profileModel,String>("tel"));
    	adrsPostaleCol.setCellValueFactory(new PropertyValueFactory<profileModel,String>("adresse"));
    	Dembauche.setCellValueFactory(new PropertyValueFactory<profileModel,String>("dEmbauche"));
    	DfContrat.setCellValueFactory(new PropertyValueFactory<profileModel,String>("dFinContrat"));
    	sCol.setCellValueFactory(new PropertyValueFactory<profileModel,String>("salaire"));
    	
    	System.out.println(id);
    	
    	tableData.setItems(data);
    	
    	
    }
    
    @SuppressWarnings("unused")
	public void delete() throws SQLException {
    	Connection conn = ConnectoDataBase.getConnection();	
    	String sql = "DELETE FROM `collaborateur` WHERE id = ?";
    	try {
    		pst = conn.prepareStatement(sql);
    		pst.setString(1,userID.getText());
    		JOptionPane.showMessageDialog(null,"Supprimé");
    		pst.execute();
    		
    		refresehTableDataProfiles();
    	}catch (SQLException e) {
    		JOptionPane.showMessageDialog(null,e);
    		
    		
    	}
    }
    
    //////////// Methode select User /////////////
    
    int index = -1;
    @FXML
    void  getSelecteed (MouseEvent event) { 
    	
    	index = tableData.getSelectionModel().getSelectedIndex();
    	if (index <= -1) {
    		
    		
    		return;
    	}
    	userID.setText(idCol.getCellData(index).toString());
    	nomProfile.setText(nomCol.getCellData(index).toString());
    	prenomProfile.setText(prenCol.getCellData(index).toString());
    	FonctionProfile.setText(fonCol.getCellData(index).toString());
    	salaireProfile.setText(sCol.getCellData(index).toString());
//    	salaireProfile.setText(civCol.getCellData(index).toString());
    	if(civCol.getCellData(index).toString().equals("Mr"))
    	{
    		profilCMr.setSelected(true);
    		
    	}else if(civCol.getCellData(index).toString().equals("Mme")) 
    	{
    		
    		profilCMme.setSelected(true);
    	}

    	
    }
    
    
	void refresehTableDataProfiles()
    {
		
		id.clear();
		noms.clear();
		prenoms.clear();
		civilites.clear();
		fonctions.clear();
		emails.clear();
		tels.clear();
		adrsPostale.clear();
		dEmbauches.clear();
		dFinContrat.clear();
		uSalaire.clear();
		
    	rhData.getallUsers();
		lauchDataProfiles();
    	
    	
    	
    	
    }
	
////////////Methode Edit Data User /////////////
	
	@SuppressWarnings("unused")
	public void edit() {
		
		try {
			
			
			
			Connection conn = ConnectoDataBase.getConnection();
			
			String value1 =  nomProfile.getText();
			String value2 =  prenomProfile.getText();
			String value3 =  FonctionProfile.getText();
			Double value4 =  Double.valueOf(salaireProfile.getText());
			String value5 =  null;
			
			if(profilCMr.isSelected()) {
				value5 = "Mr";
			}else if(profilCMme.isSelected()) {
				value5 = "Mme";
			}
			
			String sql = " UPDATE collaborateur SET nom = ' " + value1 +" ' ,prenom =' "+ value2 +" ', civilite = '"+value5+"' ,fonction ='"+value3+"', salaire= '"+value4+"' WHERE id = '" +userID.getText()+ "' ";
			
					pst = conn.prepareStatement(sql);
					pst.execute();
					
					JOptionPane.showMessageDialog(null,"Mise à jour éffctué");
					
					refresehTableDataProfiles();
			
		}catch (Exception e) {
			
					JOptionPane.showMessageDialog(null, e);
			
		}
		
	}
	
	
 

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		rhData.getallUsers();
		
		lauchDataProfiles();
    	
		
	}




	

    

}
