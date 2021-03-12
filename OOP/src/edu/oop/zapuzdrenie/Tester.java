package edu.oop.zapuzdrenie;

public class Tester {

	public static void main(String[] args) {
		
		Ucet u = new Ucet("Moj ucet", 1000);
		
		u.info();
		u.vklad(120);
		u.info();
		
		u.vyber(50);
		u.info();

		//u.zostatok = -5000;
		u.info();
		
		
	}

}
