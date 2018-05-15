public class Abfrage {

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
