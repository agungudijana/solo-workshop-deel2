package domain;

public class Account {
	
	
	
	private long id;
	private String naam;
	private Klant klant;
	private java.util.Date creatieDatum;
	
	public long getAccount_id () {
		return id;
	}
	
	public void setAccount_id(long id) {
		this.id = id;
	}
	
	public String getNaam() {
		return naam;
	}
	
	public void setNaam() {
		this.naam = naam;
	}
	
	public Klant getKlant() {
		return klant;
	}
	
	public void setKlant(Klant klant) {
		this.klant = klant;
	}
	
	public java.util.Date getCreatieDatum() {
		return creatieDatum;
	}
	
	public void setCreatieDatum (java.util.Date creatieDatum) {
		this.creatieDatum = creatieDatum;
	}

}
