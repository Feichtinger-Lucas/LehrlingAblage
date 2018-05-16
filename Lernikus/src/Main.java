
public class Main {

	public static void main(String[] args) throws InterruptedException {

		//Testvariablen
		int note = 5;
		int TON_FUNKTION = 0;
		int TON_AREN = 2;

		Schnittstellen.hinter();
		Schnittstellen.wart();
		TON_FUNKTION = Schnittstellen.noten(note); // einzelne Noten ausgeben
		Schnittstellen.test(TON_FUNKTION, TON_AREN); //Noten vergleichen
		System.out.println("_____________________________________________TUTORIAL_____________________________________________");
		Level.Tuto();	// Tutorial
		System.out.println("_____________________________________________LVL1_____________________________________________");
		Level.Algo(3); // Level
		System.out.println("_____________________________________________LVL2_____________________________________________");
		Level.Algo(10); // Level


	}

}