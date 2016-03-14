package domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Account implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_id")
	private long id;
		
	@Column(name = "account_name")
	private String naam;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "klant_id")
	private Klant klant;
	
	@Column(name = "creatie_datum")
	private java.util.Date creatieDatum;
	
	public Account() {
	}
	
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((creatieDatum == null) ? 0 : creatieDatum.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((klant == null) ? 0 : klant.hashCode());
		result = prime * result + ((naam == null) ? 0 : naam.hashCode());
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
		Account other = (Account) obj;
		if (creatieDatum == null) {
			if (other.creatieDatum != null)
				return false;
		} else if (!creatieDatum.equals(other.creatieDatum))
			return false;
		if (id != other.id)
			return false;
		if (klant == null) {
			if (other.klant != null)
				return false;
		} else if (!klant.equals(other.klant))
			return false;
		if (naam == null) {
			if (other.naam != null)
				return false;
		} else if (!naam.equals(other.naam))
			return false;
		return true;
	}

}
