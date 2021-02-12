
public class Tester {

	public static void main(String[] args) {
		
		//deklaracia objektu
		Ziak z;
		
		//inicializacia objektu v pamati
		z = new Ziak();
		
		Ziak z2 = new Ziak();
		
		z.info();
		
		z.meno = "Jan";
		z.priezvisko = "Hrasko";
		z.trieda = "1.A";
	
		//System.out.println("Meno: " + z.meno + "\nPriezvisko: " + z.priezvisko);

		//System.out.println(z.celeMeno());
		
		z.info();
		
		//z.trieda = "2.A";
		z.zmenTriedu("2.A");
		z.info();
		
		z2.info();
		System.out.println("--------------");
		
		Ziak z3 = new Ziak("Fero", "Mravec");
		
		z3.info();
		
		Ziak z4 = new Ziak("Peter", "Pan", "3.C");
		z4.info();
		
		
		
	}

}
