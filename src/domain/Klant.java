package domain;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.apache.commons.validator.routines.EmailValidator;

import annotations.*;
import business.Adres;
import business.AdresType;



@Entity
@Table
public class Klant {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "klant_id")
	private long id;
	
	@Column
	private String voornaam;
	
	@Column
	private String achternaam;
	
	@Column
	private String tussenvoegsel;
	
	@Column
	private String email;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="id")
	private Set<Bestelling> bestellingSet;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="id")
	private Set<Factuur> factuurSet;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="id")
	private Set<Account> accountSet;
	
	@ManyToMany
	@JoinTable(name = "klant_adres")
	@JoinColumns({
			@JoinColumn(name = "klant_id", referencedColumnName = "klant_id"), 
			@JoinColumn(name = "adrestype_id", referencedColumnName = "adrestype_id"), 
			@JoinColumn(name = "adres_id", referencedColumnName = "adres_id")})
	private Map<Adres, AdresType> adresMap = new HashMap <Adres, AdresType>();
	
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
	
	
	/*
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
	*/
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountSet == null) ? 0 : accountSet.hashCode());
		result = prime * result + ((achternaam == null) ? 0 : achternaam.hashCode());
		result = prime * result + ((bestellingSet == null) ? 0 : bestellingSet.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((factuurSet == null) ? 0 : factuurSet.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((tussenvoegsel == null) ? 0 : tussenvoegsel.hashCode());
		result = prime * result + ((voornaam == null) ? 0 : voornaam.hashCode());
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
		Klant other = (Klant) obj;
		if (accountSet == null) {
			if (other.accountSet != null)
				return false;
		} else if (!accountSet.equals(other.accountSet))
			return false;
		if (achternaam == null) {
			if (other.achternaam != null)
				return false;
		} else if (!achternaam.equals(other.achternaam))
			return false;
		if (bestellingSet == null) {
			if (other.bestellingSet != null)
				return false;
		} else if (!bestellingSet.equals(other.bestellingSet))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (factuurSet == null) {
			if (other.factuurSet != null)
				return false;
		} else if (!factuurSet.equals(other.factuurSet))
			return false;
		if (id != other.id)
			return false;
		if (tussenvoegsel == null) {
			if (other.tussenvoegsel != null)
				return false;
		} else if (!tussenvoegsel.equals(other.tussenvoegsel))
			return false;
		if (voornaam == null) {
			if (other.voornaam != null)
				return false;
		} else if (!voornaam.equals(other.voornaam))
			return false;
		return true;
	}
}


