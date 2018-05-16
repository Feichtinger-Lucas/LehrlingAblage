public class Abfrage {

	
	//Vergleich von 2 Noten (1 System/2 Benutzer)
	public static int pruefen(int j, int antwort) {

		if (j < antwort) {

			return 1;

		} else if (j > antwort) {
			return 2;
		} else {

			return 0;
		}
	}

}
