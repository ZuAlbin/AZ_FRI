import java.util.Scanner;
import java.util.Arrays;

public class ZgoscenkeDve {

	/** ce nam Arrays.toString smrdi... */

	private static String vNiz(int[] t) {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < t.length; i++) {
			if (i > 0)
				sb.append(", ");
			sb.append(t[i]);
		}
		sb.append("]");
		return sb.toString();
	}

	/** Vrne indeks najmanjsega elementa v tabeli. */
	
	private static int indeksMinimuma(int[] t) {
		int ixMin = 0;
		for (int i = 1; i < t.length; i++) {
			if (t[i] < t[ixMin])
				ixMin = i;
		}
		return ixMin;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int stZgoscenk = sc.nextInt();
		int kapacitetaZgoscenke = sc.nextInt();
		
		int[] zasedenosti = new int[stZgoscenk];
		
		while (sc.hasNextInt()) {
			int fileSize = sc.nextInt();
			
			// poisci indeks najmanj zasedene zgoscenke
			int ixZgoscenke = indeksMinimuma(zasedenosti);
			
			// ali lahko datotekeo spravimo na eno izmed zgoscenk?
			if (fileSize + zasedenosti[ixZgoscenke] > kapacitetaZgoscenke) {
				break;
			}
			zasedenosti[ixZgoscenke] += fileSize;
			
			System.out.printf("%d EP -> zgoscenka %d %s%n", 
							fileSize, ixZgoscenke + 1, Arrays.toString(zasedenosti));
		}
		
		
	}
}

