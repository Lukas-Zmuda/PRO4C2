package edu.oop.dedicnost;

public class Obdlznik extends Utvar{

	private double dlzka, sirka;

	public Obdlznik(double x, double y, double dlzka, double sirka) {
		super(x, y);
		this.dlzka = dlzka;
		this.sirka = sirka;
	}

	public double getDlzka() {
		return dlzka;
	}

	public void setDlzka(double dlzka) {
		this.dlzka = dlzka;
	}

	public double getSirka() {
		return sirka;
	}

	public void setSirka(double sirka) {
		this.sirka = sirka;
	}

	@Override
	public void kresli() {
		System.out.println("Obdlznik na [" + this.getX() + ", " + this.getY() + "] d = " + this.dlzka + ", s = " + this.sirka);
	}
	
	

	
	
}
