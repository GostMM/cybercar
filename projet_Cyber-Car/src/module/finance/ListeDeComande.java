package module.finance;

import javafx.beans.property.SimpleStringProperty;

public class ListeDeComande {
	private final SimpleStringProperty Reference, Localisation;
	public ListeDeComande(String reference, String localisation) {
		
		Reference = new SimpleStringProperty(reference);
		Localisation = new SimpleStringProperty(localisation);
	}

	
	public String getLocalisation() {
		
		return Localisation.get();
	}
	public String getReference() {
		
		return Reference.get();
	}
	

}
