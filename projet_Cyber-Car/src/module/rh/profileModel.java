package module.rh;

import jdbcconnection.rhData;

public class profileModel 
{
	
	



	private Integer id;
	
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
	
	public profileModel(String nom,
			String prenom, String nJeuneFille, String civilite, String fonction, String mail,
			String tel, String indic, String dEmbauche, String dFinContrat, String postA, String postN,
			String conjugale, String nbrEnfant, String adresse, String medicale, String assurance, String salaire,
			Integer id) {
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
		this.adresse = adresse;
		this.medicale = medicale;
		this.assurance = assurance;
		this.salaire = salaire;
		this.id = id;
	}

	
	public String getNom() {
		return nom;
	}





	public void setNom(String nom) {
		this.nom = nom;
	}





	public String getPrenom() {
		return prenom;
	}





	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}





	public String getnJeuneFille() {
		return nJeuneFille;
	}





	public void setnJeuneFille(String nJeuneFille) {
		this.nJeuneFille = nJeuneFille;
	}





	public String getCivilite() {
		return civilite;
	}





	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}





	public String getFonction() {
		return fonction;
	}





	public void setFonction(String fonction) {
		this.fonction = fonction;
	}





	public String getMail() {
		return mail;
	}





	public void setMail(String mail) {
		this.mail = mail;
	}





	public String getTel() {
		return tel;
	}





	public void setTel(String tel) {
		this.tel = tel;
	}





	public String getIndic() {
		return indic;
	}





	public void setIndic(String indic) {
		this.indic = indic;
	}





	public String getdEmbauche() {
		return dEmbauche;
	}





	public void setdEmbauche(String dEmbauche) {
		this.dEmbauche = dEmbauche;
	}





	public String getdFinContrat() {
		return dFinContrat;
	}





	public void setdFinContrat(String dFinContrat) {
		this.dFinContrat = dFinContrat;
	}





	public String getPostA() {
		return postA;
	}





	public void setPostA(String postA) {
		this.postA = postA;
	}





	public String getPostN() {
		return postN;
	}





	public void setPostN(String postN) {
		this.postN = postN;
	}





	public String getConjugale() {
		return conjugale;
	}





	public void setConjugale(String conjugale) {
		this.conjugale = conjugale;
	}





	public String getNbrEnfant() {
		return nbrEnfant;
	}





	public void setNbrEnfant(String nbrEnfant) {
		this.nbrEnfant = nbrEnfant;
	}





	public String getAdresse() {
		return adresse;
	}





	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}





	public String getMedicale() {
		return medicale;
	}





	public void setMedicale(String medicale) {
		this.medicale = medicale;
	}





	public String getAssurance() {
		return assurance;
	}





	public void setAssurance(String assurance) {
		this.assurance = assurance;
	}





	public String getSalaire() {
		return salaire;
	}





	public void setSalaire(String salaire) {
		this.salaire = salaire;
	}





	public Integer getId() {
		return id;
	}





	public void setId(Integer id) {
		this.id = id;
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
	
	
	
	
	
	
	


