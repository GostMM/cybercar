package module.finance;

import javafx.beans.property.SimpleStringProperty;

/**
 * @author MROIVILI MOUSTOIFA
 * 
 * creation d'objet de type profile pour l'affichage du tableau dep Rh 
 *
 */
public class Profiles
{
	private final SimpleStringProperty nom;
	private final SimpleStringProperty prenom;
	private final SimpleStringProperty NjeuneFille;
	private final SimpleStringProperty civilite;
	private final SimpleStringProperty nbrEnfant;
	private final SimpleStringProperty fonction;
	private final SimpleStringProperty Dembauche;
	private final SimpleStringProperty ConRestant;
	private final SimpleStringProperty Fcontrat;
	private final SimpleStringProperty Adresse;
	private final SimpleStringProperty Ntel;
	private final SimpleStringProperty email;
	
	
	
	
	
	
	
	
	
	public Profiles(String nom, String prenom, String njeuneFille,
			String civilite, String nbrEnfant, String fonction,
			String dembauche, String conRestant, String fcontrat,
			String adresse, String ntel,String email) {
		super();
		this.nom = new SimpleStringProperty(nom);
		this.prenom = new SimpleStringProperty(prenom);
		this.NjeuneFille = new SimpleStringProperty(njeuneFille);
		this.civilite = new SimpleStringProperty(civilite);
		this.nbrEnfant = new SimpleStringProperty(nbrEnfant);
		this.fonction = new SimpleStringProperty(fonction);
		this.Dembauche = new SimpleStringProperty(dembauche);
		this.ConRestant = new SimpleStringProperty(conRestant);
		this.Fcontrat = new SimpleStringProperty(fcontrat);
		this.Adresse = new SimpleStringProperty(adresse);
		this.Ntel = new SimpleStringProperty(ntel);
		this.email = new SimpleStringProperty(email);
	}
	
	
	public String getNom() {
		return nom.get();
		
	}
	
	
	
	
	public String getPrenom() {
		return prenom.get();
	}
	
	public String getNjeuneFille() {
		return NjeuneFille.get();
	}
	
	public String getCivilite() {
		return civilite.get();
	}
	
	public String getNbrEnfant() {
		return nbrEnfant.get();
	}
	
	public String getFonction() {
		return fonction.get();
	}
	
	public String getDembauche() {
		return Dembauche.get();
	}
	public String getConRestant() {
		return ConRestant.get();
	}
	public String getFcontrat() {
		return Fcontrat.get();
	}
	
	public String getAdresse() {
		return Adresse.get();
	}
	public String getNtel() {
		return Ntel.get();
	}
	public String getEmail() {
		return email.get();
	}
	
	
	

	
	
	

}
