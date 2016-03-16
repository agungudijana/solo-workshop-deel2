package domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import domain.BetaalWijzeEnum;

public class Betaling implements Serializable {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "betaling_id")
	private long id;
	
	@Column
	private Date betaalDatum;
	
	@ManyToOne
	@JoinColumn(name = "betaalwijze_id")
	private BetaalWijzeEnum betaalwijze;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "klant_id")
	private Klant klant;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "factuur_id")
	private Factuur factuur;
	
	@Column
	private String betalingsGegevens;
	
	public Betaling() {
	}
	
	public long getBetaling_id() {
		return id;
	}

	public void setBetaling_id(long id) {
		this.id = id;
	}
	
	public Date getBetaalDatum() {
		return betaalDatum;
	}
	
	public void setBetaalDatum(Date betaalDatum) {
		this.betaalDatum = betaalDatum;
	}
	
	public Klant getKlant() {
		return klant;
	}
	
	public void setKlant(Klant klant) {
		this.klant = klant;
	}
	
	public Factuur getFactuur() {
		return factuur;
	}
	
	public void setFactuur() {
		this.factuur = factuur;
	}
	
	public BetaalWijzeEnum getBetaalwijze(){
		return betaalwijze;
	}
	
	public void setBetaalwijze(BetaalWijzeEnum betaalwijze){
		this.betaalwijze = betaalwijze;
	}
	
	public String getBetalingsGegevens() {
		return betalingsGegevens;
	}
	
	public void setBetalingsGegevens() {
		this.betalingsGegevens = betalingsGegevens;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((betaalDatum == null) ? 0 : betaalDatum.hashCode());
		result = prime * result + ((betalingsGegevens == null) ? 0 : betalingsGegevens.hashCode());
		result = prime * result + ((factuur == null) ? 0 : factuur.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((klant == null) ? 0 : klant.hashCode());
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
		Betaling other = (Betaling) obj;
		if (betaalDatum == null) {
			if (other.betaalDatum != null)
				return false;
		} else if (!betaalDatum.equals(other.betaalDatum))
			return false;
		if (betalingsGegevens == null) {
			if (other.betalingsGegevens != null)
				return false;
		} else if (!betalingsGegevens.equals(other.betalingsGegevens))
			return false;
		if (factuur == null) {
			if (other.factuur != null)
				return false;
		} else if (!factuur.equals(other.factuur))
			return false;
		if (id != other.id)
			return false;
		if (klant == null) {
			if (other.klant != null)
				return false;
		} else if (!klant.equals(other.klant))
			return false;
		return true;
	}
	
}

	
		
	

