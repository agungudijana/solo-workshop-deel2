package domain;


public class Adres {
	private long id;
	private String straatnaam;
	private String postcode;
	private String toevoeging;
	private int huisnummer;
	private String woonplaats;
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
	
	

}
