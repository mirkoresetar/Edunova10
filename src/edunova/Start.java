package edunova;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;

public class Start {
	
	public Start() {
		//problem je što ne znamo koliko treba elemenata niza
		
		//Program unosi osobe sve dok se ne unese znak X
		
		//losNacin();
		dobarNacin();
	}
	
	private void dobarNacin() {
		List<Osoba> podaci = new ArrayList<>();
		
		
		String unos;
		Osoba o;
		while(true) {
			o = new Osoba(1,JOptionPane.showInputDialog("ime"));
			podaci.add(o);
			unos = JOptionPane.showInputDialog("X za kraj");
			if(unos.toLowerCase().trim().equals("x")) {
				break;
			}
		}
		//podaci.add("Katarina");
		for(Osoba osoba : podaci) {
			//o = (Osoba)obj;
			System.out.println(osoba.getIme());
		}
		
		podaci.get(0).getIme();
		
	}

	private void losNacin() {
		ArrayList podaci = new ArrayList();
		
		String unos;
		Osoba o;
		while(true) {
			o = new Osoba(1,JOptionPane.showInputDialog("ime"));
			podaci.add(o);
			unos = JOptionPane.showInputDialog("X za kraj");
			if(unos.toLowerCase().trim().equals("x")) {
				break;
			}
		}
		podaci.add("Katarina");
		for(Object obj : podaci) {
			o = (Osoba)obj;
			System.out.println(o.getIme());
		}
		//podaci.get(0).getIme();
		
	}

	public static void main(String[] args) {
		new Start();
	}

}
