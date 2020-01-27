package edunova.zadatak1;

import java.awt.JobAttributes;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class Start {
	
	private List<Vozilo> vozila;
	
	public Start() {
		
		vozila = new ArrayList<>();
		unos();
		BigDecimal suma = suma();
		System.out.println("Suma: " + suma);
		System.out.println("Prosjek: " + suma.divide(new BigDecimal(vozila.size())));
		for(Vozilo v : vozila) {
			System.out.println(v.getProizvodac());
		}
		System.out.println(Arrays.toString(vozila.toArray()));
	}
	
	private BigDecimal suma() {
		
		BigDecimal ukupno = BigDecimal.ZERO;
		for(Vozilo v : vozila) {
			ukupno=ukupno.add(v.getCijena());
		}
		return ukupno;
		
	}

	private void unos() {
		String unos;
		Vozilo vozilo;
		while(true) {
			vozilo = new Vozilo();
			vozilo.setProizvodac(ucitajProizvodaca());
			vozilo.setCijena(ucitajCijenu());
			
			vozila.add(vozilo);
			
			unos = JOptionPane.showInputDialog("X za kraj");
			if(unos.trim().toLowerCase().equals("x")) {
				return;
			}
		}
	}

	private BigDecimal ucitajCijenu() {
		//Napraviti da cijena ne smije biti manja od 0
		BigDecimal cijena;
		while(true) {
			try {
				cijena = new BigDecimal(JOptionPane.showInputDialog("Unesi cijenu za " + (vozila.size()+1) + ". vozilo "));
				if(cijena.compareTo(BigDecimal.ZERO)<0) {
					JOptionPane.showConfirmDialog(null, "Cijena ne smije biti manja od nula");
					continue;
				}
				
				return cijena;
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, "Cijena nije broj");
			}
		}
	}

	private String ucitajProizvodaca() {
		String unos;
		while(true) {
			unos = JOptionPane.showInputDialog("Unesi proizvođača  za " + (vozila.size()+1) + ". vozilo ");
			if(unos.trim().length()==0) {
				JOptionPane.showConfirmDialog(null,"Obavezno proizvođač");
				continue;
			}
			try {
				Integer.parseInt(unos);
				JOptionPane.showConfirmDialog(null,"Proizvođač ne smije biti broj");
				continue;
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			if(unos.trim().length()>100) {
				JOptionPane.showConfirmDialog(null,"Proizvođač mora imati manje od 100 znakova");
				continue;
			}
			
			return unos;
		}
	}

	public static void main(String[] args) {
		new Start();
	}

}
