package domain;


import java.util.Scanner;
import java.util.Set;

import org.apache.commons.validator.routines.EmailValidator;

import annotations.*;

import java.lang.annotation.*;



@Entity
@Table
public class Klant {
	

	@Column
	@Id
	private long id;
	
	@Column
	private String voornaam;
	private String achternaam;
	private String tussenvoegsel;
	private String email;
	private Set<Bestelling> bestellingSet;
	private Set<Factuur> factuurSet;
	private Set<Account> accountSet;
	
	
	public Klant() {}
	
	
	public long getKlant_id() {
	    	return id;
	}
	
	
	public void setKlant_id(int id) {
		this.id = id;
	}
	
	
	public String getVoornaam() {
		return voornaam;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	
	
	public String getAchternaam() {
		return achternaam;
	}
	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}
	
	
	public String getTussenvoegsel() {
		return tussenvoegsel;
	}
	public void setTussenvoegsel(String tussenvoegsel) {
		this.tussenvoegsel = tussenvoegsel;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	
	public void setEmail(String email) {
		EmailValidator emailValidator = EmailValidator.getInstance();
		Scanner input = new Scanner(System.in);
		
		while (emailValidator.isValid(email)== false){
			System.out.println("Incorrecte email. Voer uw emailadres opnieuw in");
			email = input.next();
		}
			
		this.email = email;
	}
	
	
	public void setBestellingSet(Set<Bestelling> bestellingSet){
		this.bestellingSet = bestellingSet;
	}
	
	public Set<Bestelling> getBestellingSet(){
		return bestellingSet;
	}
	
	public void setAccountSet(Set<Account> accountSet){
		this.accountSet = accountSet;
	}
	
	public Set<Account> getAccountSet(){
		return accountSet;
	}
	
	public void setFactuurSet(Set<Factuur> factuurSet){
		this.factuurSet = factuurSet;
	}
	
	public Set<Factuur> getFactuurSet(){
		return factuurSet;
	}
	
	
	
	@Override 
	public String toString(){
		return  "\n\tKlant_id: " 	+ id +
				"\nVoornaam: "		+ voornaam + 
				"\nTussenvoegsel: "	+ tussenvoegsel + 
				"\nAchternaam: " 	+ achternaam + 
				"\nEmail: " 		+ email + 
				"\n";
	}
	
	public boolean equals(Klant k){
	    if(k == null)    {
	    	return false;
	    }
	    if (!(k instanceof Klant)) {
	    	return false;
	    }
	    
	    
	    Klant other = (Klant) k;
	    if(this.id != other.id)      return false;
	    if(! this.voornaam.equals(other.voornaam)) return false;
	    if(! this.achternaam.equals(other.achternaam))   return false;
	
	    return true;
	  }
	
	public int hashCode(){
	     return (int) id * voornaam.hashCode() * achternaam.hashCode();
	
	}
}


