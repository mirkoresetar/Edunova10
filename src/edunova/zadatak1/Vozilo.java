package edunova.zadatak1;

import java.math.BigDecimal;

public class Vozilo {
	
	private String proizvodac;
	private BigDecimal cijena;
	
	
	
	public String getProizvodac() {
		return proizvodac;
	}
	public void setProizvodac(String proizvodac) {
		this.proizvodac = proizvodac;
	}
	public BigDecimal getCijena() {
		return cijena;
	}
	public void setCijena(BigDecimal cijena) {
		this.cijena = cijena;
	}
	@Override
	public String toString() {
		return "Vozilo [proizvodac=" + proizvodac + ", cijena=" + cijena + "]";
	}
	
	

}
