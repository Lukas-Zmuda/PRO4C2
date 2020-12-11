import java.util.Scanner;

public class USuma2 {

	public static void main(String[] args) {
		// nacita cisla, 0 znamena koniec nacitavania
		// vypise sumu nacitanych cisel
		
		Scanner sc = new Scanner(System.in);
		
		int cislo = -1, suma = 0;
			
		while(cislo != 0) {
			System.out.println("Zadaj cislo: ");
			cislo = sc.nextInt();
			suma += cislo;			
		}
		
		System.out.println("-----------");
		System.out.println("Suma: " + suma);
		

	}

}
