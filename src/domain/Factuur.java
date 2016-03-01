package domain;

import java.util.Date;
import java.util.Set;

public class Factuur {
	
	
	private long id;
	private String factuurNummer;
	private Date bestelDatum;
	private Set<Betaling> betalingSet;
	private Bestelling bestelling;
	
	public long getFactuur_id() {
		return id;
	}
	
	public void setFactuur_id(long id) {
		this.id = id;
	}
	
	public String getFactuurNummer() {
		return factuurNummer;
	}
	
	public void setFactuurNummer(String factuurNummer) {
		this.factuurNummer = factuurNummer;
	}
	
	public Date getBestelDatum() {
		return bestelDatum;
	}

	public void setBestelDatum(Date bestelDatum) {
		this.bestelDatum = bestelDatum;
	}
	
	public Set<Betaling> getBetalingSet() {
		return betalingSet;
	}
	
	public void setBetalingSet(Set<Betaling> betalingSet) {
		this.betalingSet = betalingSet;
	}
	
	public Bestelling getBestelling() {
		return bestelling;
	}
	
	public void setBestelling(Bestelling bestelling) {
		this.bestelling = bestelling;
	}
	
}
