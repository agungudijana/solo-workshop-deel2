package domain;

import java.util.Set;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bestelArtikelSet == null) ? 0 : bestelArtikelSet.hashCode());
		result = prime * result + ((bestelDatum == null) ? 0 : bestelDatum.hashCode());
		result = prime * result + ((bestelNummer == null) ? 0 : bestelNummer.hashCode());
		result = prime * result + ((factuurSet == null) ? 0 : factuurSet.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Bestelling other = (Bestelling) obj;
		if (bestelArtikelSet == null) {
			if (other.bestelArtikelSet != null)
				return false;
		} else if (!bestelArtikelSet.equals(other.bestelArtikelSet))
			return false;
		if (bestelDatum == null) {
			if (other.bestelDatum != null)
				return false;
		} else if (!bestelDatum.equals(other.bestelDatum))
			return false;
		if (bestelNummer == null) {
			if (other.bestelNummer != null)
				return false;
		} else if (!bestelNummer.equals(other.bestelNummer))
			return false;
		if (factuurSet == null) {
			if (other.factuurSet != null)
				return false;
		} else if (!factuurSet.equals(other.factuurSet))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

}
