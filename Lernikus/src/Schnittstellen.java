import java.io.File;

public class Schnittstellen {

	public static void noten(int i) {


        switch (i) {
            case 1:  			
            System.out.println("A");
			File A = new File("A.WAV");
			Audio.PlaySound(A);
            case 2:  			
            System.out.println("a_");
			File a1 = new File("a_.WAV");
			Audio.PlaySound(a1);
            case 3:  			
            System.out.println("C");
			File C = new File("C.WAV");
			Audio.PlaySound(C);
            case 4:  			
            System.out.println("c'");
			File c1 = new File("c'.WAV");
			Audio.PlaySound(c1);
            case 5:  			
            System.out.println("c_");
			File c2 = new File("c_.WAV");
			Audio.PlaySound(c2);
            case 6:  			
            System.out.println("D");
			File D = new File("D.WAV");
			Audio.PlaySound(D);
            case 7:  			
            System.out.println("d_");
			File d1 = new File("d_.WAV");
			Audio.PlaySound(d1);
            case 8:  			
            System.out.println("E");
			File E = new File("E.WAV");
			Audio.PlaySound(E);
            case 9:  			
            System.out.println("e_");
			File e1 = new File("e_.WAV");
			Audio.PlaySound(e1);
            case 10:  			
            System.out.println("F");
			File F = new File("F.WAV");
			Audio.PlaySound(F);
            case 11:  			
            System.out.println("f_");
			File f1 = new File("f_.WAV");
			Audio.PlaySound(f1);
            case 12:  			
            System.out.println("G");
			File G = new File("G.WAV");
			Audio.PlaySound(G);
            case 13:  			
            System.out.println("g_");
			File g1 = new File("g_.WAV");
			Audio.PlaySound(g1);
            case 14:  			
            System.out.println("H");
			File H = new File("H.WAV");
			Audio.PlaySound(H);
            case 15:  			
            System.out.println("h_");
			File h1 = new File("h_.WAV");
			Audio.PlaySound(h1);

            default: System.out.println("ERROR_UNGUELTIGER_TON");
                     break;
        }

    }



	}


