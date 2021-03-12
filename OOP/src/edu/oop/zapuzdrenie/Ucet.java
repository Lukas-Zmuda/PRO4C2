package edu.oop.zapuzdrenie;

public class Ucet {
	
	//modifikatory pristupu
	//public, private, protected, ziaden
	
	private String nazov;
	private double zostatok;
	
	public Ucet(){
		this.nazov = "tajny";
		this.zostatok = 0;
	}
	
	public Ucet(String nazov, double zostatok){
		this.nazov = nazov;
		this.zostatok = zostatok;
	}
	
	//instancna premenna nazov - getter, setter
	
	public String getNazov() {
		return nazov;
	}
	
	public void setNazov(String nazov) {
		this.nazov = nazov;
	}
	
	public void vklad(double suma) {
		if(suma > 0) {
			zostatok += suma;
			System.out.println("Vklad " + suma + " | zostatok: " + this.zostatok);
		}else {
			System.out.println("Nepovolena operacia! (Vklad " + suma + ")");
		}
	}
	

	public void vyber(double suma) {
		if(suma > 0) {
			if(suma < zostatok) {
				this.zostatok -= suma;
				System.out.println("Vyber " + suma + " | zostatok: " + this.zostatok);
			}else {
				System.out.println("Nedostatocne prostriedky na ucte!");
			}
		}else {
			System.out.println("Nepovolena operacia! (Vyber " + suma + ")");
		}
	}

	public void info() {
		System.out.println("Ucet: " + nazov);
		System.out.println("Zostatok: " + zostatok);
	}
}
