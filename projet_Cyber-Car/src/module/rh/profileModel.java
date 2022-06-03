package module.rh;

import jdbcconnection.rhData;

public class profileModel 
{
	
	private String 
	nom,
	prenom,
	nJeuneFille,
	civilite,
	fonction,
	mail,
	tel,
	indic,
	dEmbauche,
	dFinContrat,
	postA,
	postN,
	conjugale,
	nbrEnfant,
	adresse,
	medicale,
	assurance,
	salaire;

	
	
	public profileModel(String nom, String prenom, String nJeuneFille, String civilite, String fonction, String mail,String adresse,
			String tel, String indic, String dEmbauche, String dFinContrat, String postA, String postN,
			String conjugale, String nbrEnfant, String medicale, String assurance, String salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.nJeuneFille = nJeuneFille;
		this.civilite = civilite;
		this.fonction = fonction;
		this.mail = mail;
		this.tel = tel;
		this.indic = indic;
		this.dEmbauche = dEmbauche;
		this.dFinContrat = dFinContrat;
		this.postA = postA;
		this.postN = postN;
		this.conjugale = conjugale;
		this.nbrEnfant = nbrEnfant;
		this.medicale = medicale;
		this.assurance = assurance;
		this.salaire = salaire;
		this.adresse = adresse;
	}
	
	
	public String getNom() {
		return nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public String getnJeuneFille() {
		return nJeuneFille;
	}


	public String getCivilite() {
		return civilite;
	}


	public String getFonction() {
		return fonction;
	}


	public String getMail() {
		return mail;
	}


	public String getTel() {
		return tel;
	}


	public String getIndic() {
		return indic;
	}


	public String getdEmbauche() {
		return dEmbauche;
	}


	public String getdFinContrat() {
		return dFinContrat;
	}


	public String getPostA() {
		return postA;
	}


	public String getPostN() {
		return postN;
	}


	public String getConjugale() {
		return conjugale;
	}


	public String getNbrEnfant() {
		return nbrEnfant;
	}


	public String getAdresse() {
		return adresse;
	}


	public String getMedicale() {
		return medicale;
	}


	public String getAssurance() {
		return assurance;
	}


	public String getSalaire() {
		return salaire;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public void setnJeuneFille(String nJeuneFille) {
		this.nJeuneFille = nJeuneFille;
	}


	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}


	public void setFonction(String fonction) {
		this.fonction = fonction;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public void setIndic(String indic) {
		this.indic = indic;
	}


	public void setdEmbauche(String dEmbauche) {
		this.dEmbauche = dEmbauche;
	}


	public void setdFinContrat(String dFinContrat) {
		this.dFinContrat = dFinContrat;
	}


	public void setPostA(String postA) {
		this.postA = postA;
	}


	public void setPostN(String postN) {
		this.postN = postN;
	}


	public void setConjugale(String conjugale) {
		this.conjugale = conjugale;
	}


	public void setNbrEnfant(String nbrEnfant) {
		this.nbrEnfant = nbrEnfant;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public void setMedicale(String medicale) {
		this.medicale = medicale;
	}


	public void setAssurance(String assurance) {
		this.assurance = assurance;
	}


	public void setSalaire(String salaire) {
		this.salaire = salaire;
	}


	public boolean CreeProfile()
	{
		
		
		try 
		{
			rhData.sendDataToDataBase(this.nom,this.prenom,this.nJeuneFille,this.civilite,this.fonction,this.mail,this.adresse,this.tel,this.indic,this.dEmbauche,this.dFinContrat,this.postA,this.postN,this.conjugale,this.nbrEnfant,this.medicale,this.assurance,this.salaire);
			return true;
			
		} catch (Exception e) 
		
		{
			return false;
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
