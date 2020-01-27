package edunova.zadatak2;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Start {
	
	private List<Rucak> jela;
	
	public Start() {
		
		jela = new ArrayList<>();
		unos();
		for(Rucak r : jela) {
			if(!r.isJestivo()) {
				continue;
			}
			System.out.println(r.getNaziv());
		}
	}
	


	private void unos() {
		String unos;
		Rucak rucak;
		while(true) {
			rucak = new Rucak();
			rucak.setNaziv(ucitajNaziv());
			rucak.setJestivo(ucitajJestivo());
			
			jela.add(rucak);
			
			unos = JOptionPane.showInputDialog("X za kraj");
			if(unos.trim().toLowerCase().equals("x")) {
				return;
			}
		}
	}

	private boolean ucitajJestivo() {
		//Napraviti da cijena ne smije biti manja od 0
		while(true) {
			try {
				return Boolean.parseBoolean(JOptionPane.showInputDialog("Jestivo (true/false) za " + (jela.size()+1) + ". ručak "));
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, "Jestivo nema dobru vrijednost");
			}
		}
	}

	private String ucitajNaziv() {
		String unos;
		while(true) {
			unos = JOptionPane.showInputDialog("Unesi naziv  za " + (jela.size()+1) + ". ručak ");
			if(unos.trim().length()==0) {
				JOptionPane.showConfirmDialog(null,"Obavezno naziv");
				continue;
			}
			
			return unos;
		}
	}

	public static void main(String[] args) {
		new Start();
	}

}
