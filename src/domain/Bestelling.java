package domain;

import java.util.Set;

import annotations.*;

public class Bestelling {
	private long id;
	private String bestelNummer;
	private java.util.Date bestelDatum;
	private Set<BestelArtikel> bestelArtikelSet;
	private Set<Factuur> factuurSet;
					
	public long getBestelling_id() {
		return id;
	}
	
	public void setBestelling_id(long id) {
    	this.id = id;	
	}
		
	public String getBestelNummer() {
		return bestelNummer;
	}
  
    public void setBestelNummer(String bestelNummer) {
    	this.bestelNummer = bestelNummer;
    }
            	
    public java.util.Date getBestelDatum() {
		return bestelDatum;
	}
  
    public void setBestelDatum(java.util.Date bestelDatum) {
    	this.bestelDatum = bestelDatum;
    }
        
    public Set<BestelArtikel> getBestelArtikelSet() {
    	return bestelArtikelSet;
    }
    
    public void setBestelArtikelSet(Set<BestelArtikel> bestelArtikelSet) {
    	this.bestelArtikelSet = bestelArtikelSet;
    }  
    
    public Set<Factuur> getFactuurSet() {
    	return factuurSet;
    }
    
    public void setFactuurSet(Set<Factuur> factuurSet) {
    	this.factuurSet = factuurSet;
    }     
    
    
}          



    
