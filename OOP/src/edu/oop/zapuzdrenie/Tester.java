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
		
		Datum dnes = new Datum(26, 3, 2021);
		dnes.setMesiac(15);
		dnes.setDen(-1);
		dnes.setDatum(5, 5, 2002);
		
		System.out.println(dnes);
		
		DatumPelegrin dn = new DatumPelegrin(50, 50, 100000);
		dn.setDate(100, 100, 1988);
		dn.setDen(100);
		dn.setMesiac(100);
		dn.setRok(10000000);
		System.out.println(dn);
		
		
	}

}
