package domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Adres implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "adres_id")
	private long id;
	
	@Column
	private String straatnaam;
	
	@Column
	private String postcode;

	@Column
	private String toevoeging;
	
	@Column
	private int huisnummer;
	
	@Column
	private String woonplaats;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "adrestype_id")
	private AdresType adrestype;

	public Adres(){}
	
	public long getAdres_id() {
		return id;
	}
	public void setAdres_id(long id) {
		this.id = id;
	}

	public String getStraatnaam() {
		return straatnaam;
	}
	public void setStraatnaam(String straatnaam) {
		this.straatnaam = straatnaam;
	}
	
	
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	
	public String getToevoeging() {
		return toevoeging;
	}
	public void setToevoeging(String toevoeging) {
		this.toevoeging = toevoeging;
	}
	
	
	public int getHuisnummer() {
		return huisnummer;
	}
	public void setHuisnummer(int huisnummer) {
		this.huisnummer = huisnummer;
	}
	
	
	public String getWoonplaats() {
		return woonplaats;
	}
	public void setWoonplaats(String woonplaats) {
		this.woonplaats = woonplaats;
	}
	
	
	public AdresType getAdresType() {
		return adrestype;
	}
	

	@Override
	public String toString() {
		return  "\nAdresnummer: "   + getAdres_id() +
				"\nStraatnaam: " 	+ getStraatnaam() + 
				"\nPostcode: " 		+ getPostcode() + 
				"\nToevoeging: " 	+ getToevoeging() + 
				"\nHuisnummer: " 	+ getHuisnummer() + 
				"\nWoonplaats: " 	+ getWoonplaats() + 
				"\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adrestype == null) ? 0 : adrestype.hashCode());
		result = prime * result + huisnummer;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((postcode == null) ? 0 : postcode.hashCode());
		result = prime * result + ((straatnaam == null) ? 0 : straatnaam.hashCode());
		result = prime * result + ((toevoeging == null) ? 0 : toevoeging.hashCode());
		result = prime * result + ((woonplaats == null) ? 0 : woonplaats.hashCode());
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
		Adres other = (Adres) obj;
		if (adrestype != other.adrestype)
			return false;
		if (huisnummer != other.huisnummer)
			return false;
		if (id != other.id)
			return false;
		if (postcode == null) {
			if (other.postcode != null)
				return false;
		} else if (!postcode.equals(other.postcode))
			return false;
		if (straatnaam == null) {
			if (other.straatnaam != null)
				return false;
		} else if (!straatnaam.equals(other.straatnaam))
			return false;
		if (toevoeging == null) {
			if (other.toevoeging != null)
				return false;
		} else if (!toevoeging.equals(other.toevoeging))
			return false;
		if (woonplaats == null) {
			if (other.woonplaats != null)
				return false;
		} else if (!woonplaats.equals(other.woonplaats))
			return false;
		return true;
	}
	
	

}
