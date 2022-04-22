import java.net.URL;
import java.util.ResourceBundle;

import com.gluonhq.charm.glisten.control.AutoCompleteTextField;
import com.gluonhq.charm.glisten.control.TextField;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.DatePicker;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import jfxtras.scene.control.LocalDateTimeTextField;

import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;

public class recrutement3 extends Application  implements Initializable  {

    @FXML
    private RadioButton Madame;

    @FXML
    private RadioButton Monsieur;

    @FXML
    private ProgressBar ProgressBar;

    @FXML
    private RadioButton celibataire;

    @FXML
    private AutoCompleteTextField<?> email;

    @FXML
    private DatePicker embaucheDate;

    @FXML
    private MenuButton entrepots;

    @FXML
    private TextField indicatif;

    @FXML
    private Text lastConnexion;

    @FXML
    private AutoCompleteTextField<?> lastname;

    @FXML
    private RadioButton mariee;

    @FXML
    private AutoCompleteTextField<?> name;

    @FXML
    private AutoCompleteTextField<?> newJob;

    @FXML
    private RadioButton noAllergie;

    @FXML
    private RadioButton noAssurance;

    @FXML
    private RadioButton noIntegre;

    @FXML
    private RadioButton noMedical;

    @FXML
    private Text nombreEmployes;

    @FXML
    private Spinner<?> nombreEnfant;

    @FXML
    private AutoCompleteTextField<?> numeroSocial;

    @FXML
    private AutoCompleteTextField<?> oldJob;

    @FXML
    private AutoCompleteTextField<?> otherMedical;

    @FXML
    private AutoCompleteTextField<?> otherSituation;

    @FXML
    private LocalDateTimeTextField rdvEntretien;

    @FXML
    private Spinner<?> salaire;

    @FXML
    private MenuButton service;

    @FXML
    private Button submitDmUserCompte;

    @FXML
    private Button submitIntegre;

    @FXML
    private Button submitRdv;

    @FXML
    private TextField tel;

    @FXML
    private Text userName;

    @FXML
    private RadioButton yesAllergie;

    @FXML
    private RadioButton yesAssurance;

    @FXML
    private RadioButton yesIntegre;

    @FXML
    private RadioButton yesMedical;
    
    @FXML
    void RecupDonneRecrutement(ActionEvent event) {
    	try {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("File_FXML/R-H/Recrutement3.fxml"));
    	Parent root = (Parent) loader.load();
    	recrutement3 controller =loader.getController();
    	Scene scene = new Scene(root);
    	Stage stage = new Stage();
    	stage.setScene(scene);
    	stage.show();
    	
    }catch(Exception e) {
    	System.out.append("erreur d'affichage ");
    	e.printStackTrace();
    	}

    }

	


  @Override public void start(Stage recrutement) throws Exception {
  
  Parent recrutement3 =
  FXMLLoader.load(getClass().getResource("File_FXML/R-H/Recrutement3.fxml")); Scene
  scene1 =new Scene(recrutement3); recrutement.setScene(scene1);
  recrutement.show();
  
  }
  
  public static void main(String args[]) {//static method { launch(args);
  
  }
  
  @Override public void initialize(URL arg0, ResourceBundle arg1) {
  
  }
}
 