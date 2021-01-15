
public class PoleDemo {

	public static void main(String[] args) {
		
		//deklaracia pola
		int[] cisla;
		
		//inicializacia pola
		cisla = new int[6];
		
		cisla[0] = 13;
		cisla[1] = cisla[0] + 3;
		cisla[2] = cisla[0] + cisla[1];
		cisla[3] = cisla[2] % 3;
		
		System.out.println("Stvrty prvok pola cisla ma hodnotu: " + cisla[3]);
		
		for(int i = 0; i < 6; i++) {
			System.out.print(cisla[i] + ", ");
		}
		
		double[] hodnoty = new double[10];
		
		String[] mena = {"Ivan", "Peter", "Marek", "Katarina", "Jana", "Fero", "Boris", "Veronika", "Tomas"};
		int[] vyska = {181, 170, 175, 168, 169, 177, 164, 170, 186};
		
		System.out.println("\nPosledne meno v zozname je: " + mena[mena.length - 1]);
		
		
		System.out.println("Pocet mien v zozname: " + mena.length);
		
		for(int i = 0; i < mena.length; i++) {
			System.out.println((i + 1) + ". " + mena[i]);
		}
		
		System.out.println("---------------");
		for(int i = 1; i < mena.length; i += 2) {
			System.out.print(mena[i] + ", ");
		}
		System.out.println("\n----------");
		for(int i = 0; i < mena.length; i++) {
			System.out.println((i + 1) + ". " + mena[i] + ": " + vyska[i] + " cm");
		}
		
		double suma = 0;
		for(int i = 0; i < vyska.length; i++) {
			suma += vyska[i];
		}
		System.out.println("Priemerna vyska: " + (suma / mena.length));
		
		int min = vyska[0];
		int indexMin = 0;
		for(int i = 1; i < vyska.length; i++) {
			if(vyska[i] < min) {
				min = vyska[i];
				indexMin = i;
			}
		}
		System.out.println("Najmensia vyska je: " + min + " cm a ma ju " + mena[indexMin]);
		
		

	}

}
