import java.util.Locale;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		//vyzvem uzivatela na vstup
		System.out.println("Zadaj meno: ");
		//nacitam ho do premennej
		String meno;
		meno = sc.nextLine();
		//vypisem obsah premennej na konzolu
		System.out.println("Ahoj " + meno + ". :)");
		
		System.out.println("Zadaj rok narodenia: ");
		int rok = 0;
		rok = sc.nextInt();
		System.out.println("Mas " + (2020 - rok) + " rokov.");
		
		System.out.println("Zadaj desatinne cislo: ");
		
		double c = sc.nextDouble();
		
		System.out.println(c);
		
		
		
		
		

	}

}
