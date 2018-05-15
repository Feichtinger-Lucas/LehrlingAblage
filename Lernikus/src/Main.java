
public class Main {

	public static void main(String[] args) {

		//Testvariablen
		int note = 5;
		int TON_FUNKTION = 0;
		int TON_AREN = 2;

		TON_FUNKTION = Schnittstellen.noten(note); // einzelne Noten ausgeben
		Schnittstellen.test(TON_FUNKTION, TON_AREN); //Noten vergleichen
		Level.Algo(3); // Level
		Level.Tuto();	// Tutorial

	}

}