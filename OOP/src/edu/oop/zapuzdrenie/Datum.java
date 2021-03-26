package edu.oop.zapuzdrenie;

public class Datum {
	
	private int den;
	private int mesiac;
	private int rok;
	
	public Datum(int den, int mesiac, int rok) {
		setDatum(den, mesiac, rok);
	}
	
	public void setDatum(int den, int mesiac, int rok) {
		setDen(den);
		setMesiac(mesiac);
		setRok(rok);
	}
	
	public int getDen() {
		return den;
	}
	public void setDen(int den) {
		if(den > 0 && den < 32) {
			this.den = den;			
		}else {
			System.out.println("Nespravny den! Den nastavim na 1");
			this.den = 1;
		}
	}
	public int getMesiac() {
		return mesiac;
	}
	public void setMesiac(int mesiac) {
		if(mesiac > 0 && mesiac < 13) {
			this.mesiac = mesiac;			
		}else {
			System.out.println("Nespravny mesiac! Mesiac nastavim na 1");
			this.mesiac = 1;
		}
	}
	public int getRok() {
		return rok;
	}
	public void setRok(int rok) {
		if(rok > 1899 && rok < 10000) {
			this.rok = rok;			
		}else {
			System.out.println("Nespravny rok! Rok nastavim na 1900");
			this.rok = 1900;
		}
	}

	@Override
	public String toString() {
		return "" + ((this.den < 10)?"0"+this.den : this.den) + "/" + ((this.mesiac < 10)?"0"+this.mesiac : this.mesiac) +
				"/" + this.rok;
	}
	
	
	

}
