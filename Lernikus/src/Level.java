public class Level {
	
	//Lavel Aufbau Parameter=wie viele Noten. Schwiereigkeit von Lvl wird noch hinzugefügt

	public static void Algo(int o) {

		int i;
		int k;
		for (i = 1; i <= o; i++) {

			k = (int) ((Math.random()) * 14 + 1);
			System.out.println(k);
			System.out.println(i);

			switch (k) {
			case 1:
				Schnittstellen.noten(k);
				break;

			case 2:
				Schnittstellen.noten(k);
				break;

			case 3:
				Schnittstellen.noten(k);
				break;

			case 4:
				Schnittstellen.noten(k);
				break;

			case 5:
				Schnittstellen.noten(k);
				break;

			case 6:
				Schnittstellen.noten(k);
				break;

			case 7:
				Schnittstellen.noten(k);
				break;

			case 8:
				Schnittstellen.noten(k);
				break;

			case 9:
				Schnittstellen.noten(k);
				break;

			case 10:
				Schnittstellen.noten(k);
				break;

			case 11:
				Schnittstellen.noten(k);
				break;

			case 12:
				Schnittstellen.noten(k);
				break;

			case 13:
				Schnittstellen.noten(k);
				break;

			case 14:
				Schnittstellen.noten(k);
				break;

			case 15:
				Schnittstellen.noten(k);
				break;

			default:
				System.out.println("ERROR_UNGUELTIGE_ZUFALLSZAHL");
				break;

			}
		}

	}
	
	// Ausgabe aller für das Lvl Notwendiger Noten zum lernen.

	public static void Tuto() {

		int i = 1;



		switch (i) {
		case 1:
			Schnittstellen.noten(i);
			i++;

		case 2:
			Schnittstellen.noten(i);
			i++;

		case 3:
			Schnittstellen.noten(i);
			i++;

		case 4:
			Schnittstellen.noten(i);
			i++;

		case 5:
			Schnittstellen.noten(i);
			i++;

		case 6:
			Schnittstellen.noten(i);
			i++;

		case 7:
			Schnittstellen.noten(i);
			i++;

		case 8:
			Schnittstellen.noten(i);
			i++;

		case 9:
			Schnittstellen.noten(i);
			i++;

		case 10:
			Schnittstellen.noten(i);
			i++;

		case 11:
			Schnittstellen.noten(i);
			i++;

		case 12:
			Schnittstellen.noten(i);
			i++;

		case 13:
			Schnittstellen.noten(i);
			i++;

		case 14:
			Schnittstellen.noten(i);
			i++;

		case 15:
			Schnittstellen.noten(i);
			i++;

		default:
			System.out.println("Tutorial abgeschlossen");
			break;

		}
	}

}
