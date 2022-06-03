package module.rh;

import com.gluonhq.charm.glisten.control.AutoCompleteTextField;
import com.gluonhq.charm.glisten.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;
import jfxtras.scene.control.LocalDateTimeTextField;

public class Recrutement {
	
	String civiliteText;
    String situationConjugaleText;
    String allergieText;
    String assuranceText;
    String integrationText;

    
    @FXML
    private ToggleGroup Civilite;
    
    

    @FXML
    private RadioButton Madame;   //------------

    @FXML
    private RadioButton Monsieur; // Declaration

    @FXML
    private ProgressBar ProgressBar;

    @FXML
    private ToggleGroup allergie;

    @FXML
    private ToggleGroup assuranceMaladie;

    @FXML
    private RadioButton celibataire; //------------
    

    @FXML
    private AutoCompleteTextField<?> email;

    @FXML
    private DatePicker embaucheDate;

    @FXML
    private MenuButton entrepots;

    @FXML
    private TextField indicatif;

    @FXML
    private ToggleGroup integration;

    @FXML
    private Text lastConnexion;

    @FXML
    private AutoCompleteTextField<?> lastname;

    @FXML
    private RadioButton mariee; //----------------

    @FXML
    private AutoCompleteTextField<?> name;

    @FXML
    private AutoCompleteTextField<?> newJob;

    @FXML
    private RadioButton noAllergie;//----------------

    @FXML
    private RadioButton noAssurance;

    @FXML
    private RadioButton noIntegre; //----------------

    @FXML
    private RadioButton noMedical; //----------------

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
    private ToggleGroup situationConjugale;
    
    @FXML
    private RadioButton autreSituationConjugale;

    @FXML
    private Button submitDmUserCompte;

    @FXML
    private Button submitIntegre;

    @FXML
    private Button submitRdv;

    @FXML
    private ToggleGroup suiviMedical;

    @FXML
    private TextField tel;

    @FXML
    private Text userName;

    @FXML
    private RadioButton yesAllergie; //----------------

    @FXML
    private RadioButton yesAssurance; //----------------

    @FXML
    private RadioButton yesIntegre;//----------------

    @FXML
    private RadioButton yesMedical; //----------------

    @FXML
    void BtnCelib(ActionEvent event) {
    	
    	if (celibataire.isSelected()) {
    		otherSituation.setDisable(true);
    		situationConjugaleText = "Celibataire";	
    		
    	}

    }

    @FXML
    void BtnMarie(ActionEvent event) {
    	if (mariee.isSelected()) {
    		otherSituation.setDisable(true);
    		situationConjugaleText = "Marié(e)";	
    		
    	}
    }
    
    
    @FXML
    void BtnAutreSituationConjugale(ActionEvent event) {
    	
    	if (autreSituationConjugale.isSelected()) {
    		situationConjugaleText = otherSituation.getText();	
    		
    	}

    }
//<!--------------------------------------------------------------------------->
    @FXML
    void BtnMr(ActionEvent event) {
    	
    	if (Monsieur.isSelected()) {
    		civiliteText = "Monsieur";	
    		
    	}

    }

    @FXML
    void BtnMrs(ActionEvent event) {
    	if (Madame.isSelected()) {
    		civiliteText = "Madame";	
    		
    	}

    }

    
  //------------Medical
    
    @FXML
    void BtnYesMediccal(ActionEvent event) {
    	if (yesMedical.isSelected()) {
    		civiliteText = "Suivie Médical";	
    		
    	}
    	

    }

    @FXML
    void BtnNoMedical(ActionEvent event) {

    	if (noMedical.isSelected()) {
    		civiliteText = " Sans Suivie Médical";	
    		
    	}
    }
    
  //------------

    @FXML
    void BtnYesAllergie(ActionEvent event) {
    	if (yesAllergie.isSelected()) {
    		allergieText = " Allergique :";	
    		
    	}
    	

    }
    
    @FXML
    void BtnNoAllergie(ActionEvent event) {
    	
    	if (noAllergie.isSelected()) {
    		allergieText = " Non Allergique";	
    		
    	}

    }

    @FXML
    void BtnYesAssurance(ActionEvent event) {
    	
    	if (yesAssurance.isSelected()) {
    		assuranceText = " Assuré(e)";	
    		
    	}

    }
    
    @FXML
    void BtnNoAssurance(ActionEvent event) {
    	
    	if (yesAllergie.isSelected()) {
    		assuranceText = "Non Assuré(e)";	
    		
    	}
    }

    @FXML
    void BtnYesIntegration(ActionEvent event) {
    	
    	if (yesIntegre.isSelected()) {
    		integrationText = "Ingration accépté";	
    		
    	}

    }
    
    @FXML
    void BtnNoIntegration(ActionEvent event) {
    	if (noIntegre.isSelected()) {
    		integrationText = "Ingration refusé";	
    		
    	}


    }

    

}
