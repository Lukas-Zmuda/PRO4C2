
public class Nahoda {

	public static void main(String[] args) {
		
		double d = Math.random();
		
		d = d * 10;
		
		int nahoda = (int)d % 3;
		System.out.print("Pocitac vygeneroval ");
		switch(nahoda) {
		case 0:
			System.out.println("kamen");
			break;
		case 1:
			System.out.println("papier");
			break;
		case 2:
			System.out.println("noznice");
			break;
		}
		//System.out.println();

	}

}
