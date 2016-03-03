package domain;

public class BestelArtikel {
	
	private long id;
	private Artikel artikel;
	private Bestelling bestelling;
	private int aantal;
	
	public long getBestelArtikel_id() {
		return id;
	}
	
	public void setBestelArtikel_id(long id) {
		this.id = id;
	}
	
	public Artikel getArtikel() {
		return artikel;
	}
	
	public void setArtikel(Artikel artikel) {
		this.artikel = artikel;
	}
	
	public Bestelling getBestelling() {
		return bestelling;
	}
	
	public void setBestelling(Bestelling bestelling) {
		this.bestelling = bestelling;
	}
	
	public int getAantal() {
		return aantal;
	}
	
	public void setAantal(int aantal) {
		this.aantal = aantal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + aantal;
		result = prime * result + ((artikel == null) ? 0 : artikel.hashCode());
		result = prime * result + ((bestelling == null) ? 0 : bestelling.hashCode());
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
		BestelArtikel other = (BestelArtikel) obj;
		if (aantal != other.aantal)
			return false;
		if (artikel == null) {
			if (other.artikel != null)
				return false;
		} else if (!artikel.equals(other.artikel))
			return false;
		if (bestelling == null) {
			if (other.bestelling != null)
				return false;
		} else if (!bestelling.equals(other.bestelling))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
}
	
