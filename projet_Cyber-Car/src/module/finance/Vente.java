package module.finance;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * @author MROIVILI MOUSTOIFA 	
 * 
 * CREATION D'objet de type vente 
 *
 */
public class Vente 
{
	
	
	
	
	private final SimpleIntegerProperty reference;
	
	public int getReference() 
	{
		return reference.get();
	}

	public String getDate() {
		return date.get();
	}

	public Double getMontant() {
		return montant.get();
	}

	public Double getRemise() {
		return remise.get();
	}

	private final SimpleStringProperty date;
	private final SimpleDoubleProperty montant;
	private final SimpleDoubleProperty remise;
	
	public Vente(int reference, String date, Double montant,Double remise) {
		super();
		this.reference = new SimpleIntegerProperty(reference);
		this.date = new SimpleStringProperty(date);
		this.montant = new SimpleDoubleProperty(montant);
		this.remise = new SimpleDoubleProperty(remise);
	}
	
	

}
