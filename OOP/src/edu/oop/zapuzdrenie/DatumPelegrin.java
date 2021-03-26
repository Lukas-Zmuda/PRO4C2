package edu.oop.zapuzdrenie;

public class DatumPelegrin {

	

	private int den;
	private int mesiac;
	private int rok;
	
	public DatumPelegrin(){
		this.den = 1;
		this.mesiac = 1;
		this.rok = 1900;
	}
	
	public DatumPelegrin(int den, int mesiac, int rok){
		setDate(den, mesiac, rok);
	}
	
	
	public int getDen() {
		return den;
	}
	public int getMesiac() {
		return mesiac;
	}
	public int getRok() {
		return rok;
	}
	
	
	
	public void setDen(int den) {
		this.den = den;
	}
	public void setMesiac(int mesiac) {
		this.mesiac = mesiac;
	}
	public void setRok(int rok) {
		this.rok = rok;
	}
	
	
	
	
	public void setDate(int den, int mesiac, int rok) {
		if( den <= 0) {
			System.out.println("Nespravny den (Den : " + den + ")");
			}
		if( den > 31) {
			System.out.println("Nespravny den (Den : " + den + ")");
			}
		
		if( mesiac <= 0) {
			System.out.println("Nespravny mesiac (mesiac : " + mesiac + ")");
			}
		if( mesiac > 12) {
			System.out.println("Nespravny mesiac (mesiac : " + mesiac + ")");
			}
		
		if( rok < 1900) {
			System.out.println("Nespravny rok (rok : " + rok + ")");
			}
		if( rok > 9999) {
			System.out.println("Nespravny rok (rok : " + rok + ")");
			}
		
		
		else{
			if(den <=10 && mesiac <=10) {	
				System.out.println("0" + this.den + "/" + "0" + this.mesiac + "/" + this.rok );
				}
			
			else if(den <=10) {	
				System.out.println("0" + den + "/" + "0" + "/" + rok );	
			}
			
			else if(mesiac <=10) {	
				System.out.println(den + "/" + "0" + mesiac + "/" + rok );	
			}
			
		}
	}

	@Override
	public String toString() {
		return "DatumPelegrin [den=" + den + ", mesiac=" + mesiac + ", rok=" + rok + "]";
	}
		
	


	/*
	
	public void info() {
		System.out.println(den + "/" + mesiac + "/" + rok );

	}
	
	*/
}
