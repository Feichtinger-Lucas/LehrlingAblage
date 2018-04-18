import java.io.File;

public class Schnittstellen {

	public static int noten(int i) {

		switch (i) {
		case 1:
			System.out.println("A");
			File A = new File("A.WAV");
			Audio.PlaySound(A);
			return 1;
		case 2:
			System.out.println("a_");
			File a1 = new File("a_.WAV");
			Audio.PlaySound(a1);
			return 2;
		case 3:
			System.out.println("C");
			File C = new File("C.WAV");
			Audio.PlaySound(C);
			return 3;
		case 4:
			System.out.println("c'");
			File c1 = new File("c'.WAV");
			Audio.PlaySound(c1);
			return 4;
		case 5:
			System.out.println("c_");
			File c2 = new File("c_.WAV");
			Audio.PlaySound(c2);
			return 5;
		case 6:
			System.out.println("D");
			File D = new File("D.WAV");
			Audio.PlaySound(D);
			return 6;
		case 7:
			System.out.println("d_");
			File d1 = new File("d_.WAV");
			Audio.PlaySound(d1);
			return 7;
		case 8:
			System.out.println("E");
			File E = new File("E.WAV");
			Audio.PlaySound(E);
			return 8;
		case 9:
			System.out.println("e_");
			File e1 = new File("e_.WAV");
			Audio.PlaySound(e1);
			return 9;
		case 10:
			System.out.println("F");
			File F = new File("F.WAV");
			Audio.PlaySound(F);
			return 10;
		case 11:
			System.out.println("f_");
			File f1 = new File("f_.WAV");
			Audio.PlaySound(f1);
			return 11;
		case 12:
			System.out.println("G");
			File G = new File("G.WAV");
			Audio.PlaySound(G);
			return 12;
		case 13:
			System.out.println("g_");
			File g1 = new File("g_.WAV");
			Audio.PlaySound(g1);
			return 13;
		case 14:
			System.out.println("H");
			File H = new File("H.WAV");
			Audio.PlaySound(H);
			return 14;
		case 15:
			System.out.println("h_");
			File h1 = new File("h_.WAV");
			Audio.PlaySound(h1);
			return 15;

		default:
			System.out.println("ERROR_UNGUELTIGER_TON");
			return 0;

		}

	}

	public static int test(int j, int antwort) {

		int t;
		t=Abfrage.pruefen(j, antwort);
		
		if(t==0){
			System.out.println("gleich");
		}else if(t==2){
			System.out.println("zu hoch");
		}else if(t==1){
			System.out.println("zu niedrig");
		}
		
		return 0;
	}

}
