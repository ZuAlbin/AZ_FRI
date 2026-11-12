import java.util.Scanner;

public class MMatrike {
	
	public static int ( 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//n1 št vrstic mat1
		//m1 št stolpcev mat1
		int n1 = sc.nextInt();
        int m1 = sc.nextInt();
		
		// št elementov v mat1
		int num1 = m1 * n1;
		
		int[][] mat1 = new int[n1][m1];
		
		for (int i = 0; i < n1; i++){
			for (int j = 0; j < m1; j++) {
				
				mat1[i][j] = sc.nextInt();
				
			}
			
			
		}
	    for (int i = 0; i < n1; i++){
			    for (int j = 0; j < m1; j++) {
		
		        System.out.print(mat1[i][j] + " ");
				
		
				}
				System.out.println();
		}
		
		

	}
	
	
	
}