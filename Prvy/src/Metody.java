
public class Metody {

	public static void main(String[] args) {

		//volanie metody
		pozdravSa();
		int a = 12;
		
		
		pozdrav("Lukas");
		
		kresli("-", 10);
		
		System.out.println(druhaMocnina(a));
		
		double naDruhu = druhaMocnina(5);
		
		System.out.println(naDruhu);
		
		System.out.println(ntaMocnina(8, 1));
		System.out.println(druhaMocnina(12.45));
		
		int[] mojePole = vytvorPole(7, -1);
		vypisPole(mojePole);
		
		System.out.println(spocitaj(1, 26, 45, 789, 777, 98));
	}
	
	//metoda bez navratoveho typu
	static void pozdravSa() {
		System.out.println("+-----------------------+");
		pozdrav(" program");
		//System.out.println("|      Ahoj program     |");
		System.out.println("+-----------------------+");
	}
	
	static void pozdrav(String meno) {
		System.out.println("Ahoj " + meno);
	}
	
	static void kresli(String znak, int pocet) {
		for(int i = 0; i < pocet; i++) {
			System.out.print(znak);
		}
		System.out.println();
	}
	
	static void vypisPole(int[] pole) {
		for(int prvok: pole) {
			System.out.print(prvok + ", ");
		}
		System.out.println();
	}
	//metody s navratovym typom
	static double druhaMocnina(int cislo) {		
		double vysledok = 0;
		vysledok = cislo * cislo;
		System.out.println("parameter - int");
		return vysledok;
	}
	
	static double druhaMocnina(double cislo) {
		double vysledok = 0;
		vysledok = cislo * cislo;
		System.out.println("parameter - double");
		return vysledok;
	}
	
	static double ntaMocnina(int zaklad, int exponent) {
		double vysledok = 1;
		
		for(int i = 0; i < exponent; i++) {
			vysledok *= zaklad;
		}
		return vysledok;
	}
	
	static int[] vytvorPole(int pocetPrvkov, int hodnota) {
		int[] pole = new int[pocetPrvkov];
		for(int i = 0; i < pole.length; i++) {
			pole[i] = hodnota;
		}
		return pole;
	}
	
	static double spocitaj(int a, int b) {
		return a + b;
	}
	static double spocitaj(int a, int b, int c) {
		return a + b + c;
	}
	
	static double spocitaj(int... parametre) {
		double suma = 0;
		for(int i = 0; i < parametre.length; i++) {
			suma += parametre[i];
		}
		return suma;
	}

}
