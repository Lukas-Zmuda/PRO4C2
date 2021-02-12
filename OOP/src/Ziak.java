
class Ziak {
	
	//instancne premenne (fields)
	String meno;
	String priezvisko;
	String trieda;
	
	//konstruktory
	Ziak(){
//		meno = "nezname";
//		priezvisko = "nezname";
//		trieda = "nepriradena";
		
		this("nezname", "nezname", "nepriradena");
	}
	
	Ziak(String m, String p){
		meno = m;
		priezvisko = p;
		trieda = "nepriradena";
	}
	
	Ziak(String meno, String priezvisko, String trieda ){
		this.meno = meno;
		this.priezvisko = priezvisko;
		this.trieda = trieda;
	}
	
	
	//metody = schopnosti objektu
	String celeMeno() {
		return meno + " " + priezvisko;
	}
	
	void info() {
		System.out.println("Meno a priezvisko: " + celeMeno());
		System.out.println("Trieda: " + trieda);
	}
	
	void zmenTriedu(String tr) {
		trieda = tr;
	}

}
