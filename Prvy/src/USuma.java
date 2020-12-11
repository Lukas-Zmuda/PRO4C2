import java.util.Scanner;

public class USuma {

	public static void main(String[] args) {
		// nacita pocet cisel a samotne cisla
		// vypise sumu nacitanych cisel
		
		Scanner sc = new Scanner(System.in);
		
		int cislo, pocet, suma = 0;
		System.out.println("Zadaj pocet cisel: ");
		pocet = sc.nextInt();
		
		for(int i = 0; i < pocet; i++) {
			System.out.println("Zadaj " + (i + 1) + ". cislo: ");
			cislo = sc.nextInt();
			suma += cislo;
		}
		
		System.out.println("-----------");
		System.out.println("Suma: " + suma);
		

	}

}
