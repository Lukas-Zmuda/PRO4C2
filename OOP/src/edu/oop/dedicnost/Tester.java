package edu.oop.dedicnost;

public class Tester {

	public static void main(String[] args) {


		Utvar u = new Utvar(1, 2);
		//u.kresli();
		
		Kruh k = new Kruh(2, 3, 25);
		//k.kresli();
		
		Obdlznik o = new Obdlznik(1, 1, 10, 20);
		//o.kresli();
		
		Utvar uk = new Kruh(3, 3, 15);
		
		Utvar[] utvary = new Utvar[3];
		utvary[0] = new Kruh(1, 1, 23);
		utvary[1] = o;
		utvary[2] = uk;
		
//		for(int i = 0; i < utvary.length; i++) {
//			if(utvary[i] instanceof Kruh) {
//				System.out.println("K:");
//			}else if(utvary[i] instanceof Obdlznik) {
//				System.out.println("O:");
//			}else {
//				System.out.println("Neznamy objekt");
//			}
//			
//			utvary[i].kresli();
//		}
		
		for(Utvar uu: utvary) {
			if(uu instanceof Kruh) {
				System.out.println("K:");
			}else if(uu instanceof Obdlznik) {
				System.out.println("O:");
			}else {
				System.out.println("Neznamy objekt");
			}
			
			uu.kresli();
		}

	}

}
