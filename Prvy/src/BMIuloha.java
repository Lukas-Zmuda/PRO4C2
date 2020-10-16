import java.util.Locale;
import java.util.Scanner;

public class BMIuloha {

	public static void main(String[] args) {
		int vyska = 0;
		int vaha = 0;
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.println("Zadaj svoju vysku[cm]: ");
		vyska = sc.nextInt();
		System.out.println("Zadaj svoju hmotnost[kg]: ");
		vaha = sc.nextInt();
		
		
		double v = vyska / 100.0;
		double bmi = (double) vaha / (v * v);
		
		System.out.println("bmi = " + bmi);

	}

}
