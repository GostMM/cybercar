package module.rh;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

public class Recrutement {

    @FXML
    private TableColumn<?, ?> Dembauche;

    @FXML
    private TableColumn<?, ?> DfContrat;

    @FXML
    private TextField FonctionProfile;

    @FXML
    private RadioButton Madame;

    @FXML
    private RadioButton Monsieur;

    @FXML
    private ToggleGroup assurance;

    @FXML
    private TableColumn<?, ?> civCol;

    @FXML
    private ToggleGroup civilite;

    @FXML
    private ToggleGroup conjugale;

    @FXML
    private Text dConnect;

    @FXML
    private DatePicker dEmbauche;

    @FXML
    private TableColumn<?, ?> fonCol;

    @FXML
    private TextField indic;

    @FXML
    private TextField mail;

    @FXML
    private TableColumn<?, ?> mailCol;

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
    private TableColumn<?, ?> nomCol;

    @FXML
    private TextField nomProfile;

    @FXML
    private TextField postA;

    @FXML
    private TextField postN;

    @FXML
    private TableColumn<?, ?> prenCol;

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
    private TableView<?> tableData;

    @FXML
    private TextField tel;

    @FXML
    private TableColumn<?, ?> telCol;

    @FXML
    private Text userName;

    @FXML
    private Text userName1;

    @FXML
    void BntMrSelected(ActionEvent event) {

    }

    @FXML
    void BtnMmeSelected(ActionEvent event) {

    }

    @FXML
    void MarieSelect(ActionEvent event) {

    }

    @FXML
    void celibSelect(ActionEvent event) {

    }

    @FXML
    void noAssurance(ActionEvent event) {

    }

    @FXML
    void noMedical(ActionEvent event) {

    }

    @FXML
    void onProfile(ActionEvent event) {

    }

    @FXML
    void onRecrute(ActionEvent event) {

    }

    @FXML
    void onSoumet(ActionEvent event) {

    }

    @FXML
    void yesAssurance(ActionEvent event) {

    }

    @FXML
    void yesMedical(ActionEvent event) {

    }

}
