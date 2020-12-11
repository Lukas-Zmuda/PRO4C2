
public class Cykly {

	public static void main(String[] args) {
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) + ". Ahoj");
		}
		
		System.out.println("Ako sa mas?");
		
		for(int i = 0; i < 11; i += 2) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		for(int i = 11; i > 0; i -= 2) {
			System.out.print(i + ", ");
		}
		
		System.out.println();
		//1, 2, 4, 8, 16, 32, ..., 128
		for(int i = 1; i < 129; i *= 2) {
			System.out.print(i + ", ");
		}
		
		System.out.println("\n--------while--------");
		int j = 1;
		while(j < 129) {
			System.out.print(j + ", ");
			j *= 2;
		}
		
		System.out.println("\n--------do while--------");
		//10, 9, 8, ..., 0
		int k = 10;
		do {
			System.out.print(k + ", ");
			k--;
		}while(k >= 0);
		

	}

}
