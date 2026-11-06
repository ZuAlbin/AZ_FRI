import java.util.Scanner;


public class TestSudoku {
	
    /**
	 * Prebere Sudoku tabelo iz standardnega vhoda (tipkovnice).
	 * Najprej prebere velikost tabele (N), nato pa N x N celotnih števil.
	 *
	 * @return Dvodimenzionalna tabela celih števil, ki predstavlja prebrani Sudoku.
	 */	
	
	private static int[][] preberiTabelo() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] sudoku = new int[size][size];
		for (int i = 0; i < sudoku.length; i++) {
			for (int j = 0; j < sudoku[i].length; j++) {
				sudoku[i][j] = sc.nextInt();
			}
		}
		return sudoku;
	}
	
	/**
	 * Izpiše tabelo Sudoku na zaslon z vizualnimi ločilnimi črtami.
	 * Tabela je oblikovana z navpičnimi (|) in vodoravnimi črtami, 
	 * ki ločujejo bloke 3x3 za boljšo preglednost.
	 *
	 * @param t Dvodimenzionalna tabela celih števil, ki jo želimo izpisati.
	 */	
	
	private static void izpisi(int[][] t) {
		String tile = "-".repeat(7);
		System.out.printf("+%1$s+%1$s+%1$s+%n", tile);
		for (int i = 0; i < t.length; i++) {
			if (i % 3 == 0 && i > 0)
				System.out.printf("+%1$s+%1$s+%1$s+%n", tile);
				
			for (int j = 0; j < t[i].length; j++) {
				if (j % 3 == 0 && j > 0)
					System.out.printf(" ");
				if (j % 3 == 0)
					System.out.printf("|"); 

					System.out.print(" ");
				System.out.printf("%d", t[i][j]);
			}
			System.out.println(" |");
		}
		System.out.printf("+%1$s+%1$s+%1$s+%n", tile);
	}
	
	/**
	 * Preveri, ali podana enodimenzionalna tabela vsebuje vsa števila od 1  
	 * do dolžine tabele. Vsako število se mora pojaviti natanko enkrat, brez 
	 * podvajanja ali vrednosti izven meja.
	 *
	 * @param t Enodimenzionalna tabela (vrstica ali stolpec) za preverjanje.
	 * @return {@code true}, če tabela vsebuje vsa zahtevana števila brez ponavljanja; 
	 *         {@code false} sicer.
	 */	
	
	private static boolean containsAll(int[] t) {
		return false;
	}
	
	/**
	 * Preveri, ali posamezen 3x3 podkvadrat (blok) v Sudokuju vsebuje vsa 
	 * števila od 1 do N. Števila se znotraj bloka ne smejo ponavljati.
	 *
	 * @param sudoku Celotna dvodimenzionalna Sudoku tabela.
	 * @param ixVrstica Začetni indeks vrstice (zgornji levi kot) za 3x3 blok.
	 * @param ixStolpec Začetni indeks stolpca (zgornji levi kot) za 3x3 blok.
	 * @return {@code true}, če 3x3 blok vsebuje unikatna veljavna števila; 
	 *         {@code false} sicer.
	 */	
	
	private static boolean blockContainsAll(int[][] sudoku, int ixVrstica, int ixStolpec) {
		return false;
	}	
	
	/**
	 * Preveri celotno tabelo Sudoku po treh pravilih igre:
	 * 
	 *   -- Vsaka vrstica mora vsebovati vsa števila brez ponavljanja.
	 *   -- Vsak stolpec mora vsebovati vsa števila brez ponavljanja.
	 *   -- Vsak 3x3 podkvadrat mora vsebovati vsa števila brez ponavljanja.
	 *
	 * @param sudoku Dvodimenzionalna tabela celih števil, ki jo preverjamo.
	 * @return {@code true}, če Sudoku ustreza vsem pravilom in je veljaven; 
	 *         {@code false} sicer.
	 */	
	
	private static boolean isSudokuValid(int[][] sudoku) {
		// 1 - preveri vrstice
		
		// 2 - preveri stolpce
		
		// 3 - preveri kvadrate velikosti 3 x 3
		
		return false;
	}
	
	public static void main(String[] args) {
		int[][] sudoku = preberiTabelo();
		izpisi(sudoku);
		
		boolean isValid = isSudokuValid(sudoku);
		System.out.println(isValid);
	}
}

