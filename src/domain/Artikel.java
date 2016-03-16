package domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Artikel implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "artikel_id")
	private long id;
	
	@Column(name = "artikel_naam")
	private String naam;
	
	@Column(name = "artikel_prijs")
	private double prijs; 
	
	@Column
	private String omschrijving;
	
	
	public Artikel() {
	}
	
	public long getArtikel_id() {
		return id;
	}
	 
	public void setArtikel_id(long id) {
		this.id = id;
	}
	
	public String getArtikel_naam() {
		return naam;
	}
	
	public void setArtikel_naam(String naam) {
		this.naam = naam;
	}

	public double getPrijs() {
		return prijs;
	}
	
	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}
	
	public String getOmschrijving() {
		return omschrijving;
	}
	
	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}
	
	
	@Override
	public String toString(){
		return 	"\nArtikel Id: " + id + 		
		"\tArtikel naam: " + naam + "\tOmschrijving: " + omschrijving +
		"\tArtikel prijs: " + prijs;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((naam == null) ? 0 : naam.hashCode());
		result = prime * result + ((omschrijving == null) ? 0 : omschrijving.hashCode());
		long temp;
		temp = Double.doubleToLongBits(prijs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikel other = (Artikel) obj;
		if (id != other.id)
			return false;
		if (naam == null) {
			if (other.naam != null)
				return false;
		} else if (!naam.equals(other.naam))
			return false;
		if (omschrijving == null) {
			if (other.omschrijving != null)
				return false;
		} else if (!omschrijving.equals(other.omschrijving))
			return false;
		if (Double.doubleToLongBits(prijs) != Double.doubleToLongBits(other.prijs))
			return false;
		return true;
	}
}



