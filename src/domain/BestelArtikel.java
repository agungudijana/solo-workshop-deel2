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
	
}
	
