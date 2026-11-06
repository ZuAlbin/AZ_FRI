import java.util.Scanner;
import java.util.Arrays;

public class Izstevanka {

	/** 
	 * Vrne indeks otroka, ki izpade.
	 *
	 * @param stOtrok "stevilo (preostalih) otrok
	 * @param stBesed "stevilo besed izstevanke
	 * @return indeks izpadlega otroka
	 */
	
	private static int kdoIzpade(int stOtrok, int stBesed) {
		return (stBesed - 1) % stOtrok;
	}

	/** 
	 * Izloci element z indeksom 'ix' iz tabele 't' tako, da elemente tabele
	 * 't' desno od indeksa 'ix' pomakne za eno mesto v levo.
	 *
	 * @param t tabela z imeni otrok
	 * @param ix indeks izpadlega otroka
	 * @param d efektivna dolzina tabele (do kod se nam splaca pomikati)
	 */
	 
	private static void izloci(String[] t, int ix, int d) {
		for (int i = ix; i < d - 1; i++)
			t[i] = t[i + 1];
	}
	
	private static String[] izloci(String[] t, int ix) {
		String[] nova = new String[t.length - 1]; 
		for (int i = 0; i < t.length; i++) {
			nova[i] = t[i]
		}
		return nova;
	}
	
	private static String[] preberiOtroke(int stOtrok, Scanner sc) {
		String[] t = new String[stOtrok];
		for (int i = 0; i < stOtrok; i++)
			t[i] = sc.next();
		return t;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int stOtrok = sc.nextInt();
		int stBesed = sc.nextInt();

		// preberi imena otrok
		String[] otroci = preberiOtroke(stOtrok, sc);
		// System.out.println(Arrays.toString(otroci));
		
		// st krogov izstevanke
		int stKrogov = stOtrok - 1;
		// stevilo otrok, ki so se v igri
		int stOtrokVIgri = stOtrok;
		
		/*
		// simulacija izstevanke
		for (int krog = 0; krog < stKrogov; krog++) {
			// ugotovimo, kdo izpade
			int ixIzpadlega = kdoIzpade(stOtrokVIgri, stBesed);
			System.out.println(otroci[ixIzpadlega]);
			
			// izloci izpadlega
			izloci(otroci, ixIzpadlega, stOtrokVIgri);
			stOtrokVIgri--;
		}
		*/
		
		
		// simulacija izstevanke
		for (int krog = 0; krog < stKrogov; krog++) {
			// ugotovimo, kdo izpade
			int ixIzpadlega = kdoIzpade(otroci.length, stBesed);
			System.out.println(otroci[ixIzpadlega]);
			
			// izloci izpadlega
			otroci = izloci(otroci, ixIzpadlega);
		
	}
}
