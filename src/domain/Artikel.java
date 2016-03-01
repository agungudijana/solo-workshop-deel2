package domain;

import annotations.*;

@Entity
@Table
public class Artikel {


	@Id
	@Column
	private long id;
	
	@Column
	private String naam;
	
	@Column
	private double prijs; 
	
	private String omschrijving;
	
	
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
	
	
	public String toString(){
		return 	"\nArtikel Id: " + id + 		
		"\tArtikel naam: " + naam + "\tOmschrijving: " + omschrijving +
		"\tArtikel prijs: " + prijs;
	}
	
	public int hashCode(){
		return (int) id;
	}
}



