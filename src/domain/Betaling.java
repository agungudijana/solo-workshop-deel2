package domain;

import java.util.Date;

public class Betaling {
		
	private long id;
	private Date betaalDatum;
	private Klant klant;
	private Factuur factuur;
	private String betalingsGegevens;
	
	public long getBetaling_id() {
		return id;
	}

	public void setBetaling_id(long id) {
		this.id = id;
	}
	
	public Date getBetaalDatum() {
		return betaalDatum;
	}
	
	public void setBetaalDatum(Date betaalDatum) {
		this.betaalDatum = betaalDatum;
	}
	
	public Klant getKlant() {
		return klant;
	}
	
	public void setKlant(Klant klant) {
		this.klant = klant;
	}
	
	public Factuur getFactuur() {
		return factuur;
	}
	
	public void setFactuur() {
		this.factuur = factuur;
	}
	
	public String getBetalingsGegevens() {
		return betalingsGegevens;
	}
	
	public void setBetalingsGegevens() {
		this.betalingsGegevens = betalingsGegevens;
	}
	
}

	
		
	

