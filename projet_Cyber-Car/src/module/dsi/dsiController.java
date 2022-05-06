package module.dsi;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.gluonhq.charm.glisten.control.TextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import jdbcconnection.dsiData;

public class dsiController implements Initializable
{


	private static String Name;
	private static String Fonction;
	private static String date ;
	
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



	 void affichageCreation()
	 {
         
	     
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
				dsiData.getDernierEmployee();
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
