public class Sinus {
	
	private static final int SIRINA = 115;
	private static final int VISINA = 27;
	
	/**
	 * Inicializacija tabele, ki predstavlja risalno plosco
	 *
	 * @visina visina risalne plosce
	 * @sirina visina risalne plosce
	 * @return risalna plosca
	 */
	
	private static char[][] initPlosca(int visina, int sirina) {
		char[][] t = new char[visina][sirina];
		return t;
	}
	
	/**
	 * Na risalno plosco <t> narise sinus, zacensi s kotom <kotZacetka>.
	 *  
	 */
	
	private static void narisiSinus(char[][] t, int kotZacetka) {
		
	}
	
	private static void izpisi(char[][] t) {
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				System.out.printf("%c", t[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		char[][] plosca = initPlosca(VISINA, SIRINA);
		narisiSinus(plosca, -540);
		izpisi(plosca);
	}
}