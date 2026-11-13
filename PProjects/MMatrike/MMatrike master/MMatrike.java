import java.util.Scanner;

public class MMatrike {
	
	public static int[][] MMaker(int stVrst, int stStol, int[] log){
		
		int[][] matrika = new int[stVrst][stStol];
		
		int p = 0;
		
	    for (int i = 0; i < stVrst; i++){
			for (int j = 0; j < stStol; j++) {
				
				matrika[i][j] = log[p];
				p++;
			}
		}
	return matrika;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nP = sc.nextInt();
        int mP = sc.nextInt();
		
		int numP = nP * mP;
		
		int[] elementiP = new int[numP];
		
		for ( int i = 0; i < numP ; i++) {
			
			elementiP[i] = sc.nextInt();
			
		}
		
		int[][] matP = MMaker(nP, mP, elementiP);
		
		matP = MMaker(nP, mP, elementiP);
		
		int nD = sc.nextInt();
        int mD = sc.nextInt();
		
		int numD = nD * mD;
		
		int[] elementiD = new int[numD];
		
		for ( int i = 0; i < numD ; i++) {
			
			elementiD[i] = sc.nextInt();
			
		}
		
		int[][] matD = MMaker(nD, mD, elementiD);
		
		int[][] matOut = new int[nP][mD];
		
		for (int i = 0; i < mD; i++) {
			for (int j = 0; j < nP; j++) {
				for (int k = 0; k < nD; k++) {
					matOut[i][j] += matP[i][k] * matD[k][j];
				}
			}
		}
		
		for (int i = 0; i < nP; i++){
			    for (int j = 0; j < mD; j++) {
		
		        System.out.print(matOut[i][j] + " ");
				
		
				}
				System.out.println();
		}
		
	}
	
}