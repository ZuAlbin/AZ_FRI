import java.util.Scanner;

public class vrstaZbor {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int dolzina = input.nextInt() + 1;
		
		int[] zbor = new int[dolzina];
		
		for (int i = 0; i <= dolzina; i++ ) {
			
			zbor[i] = input.nextInt();
			
		}
		
		for (int i = 0; i < dolzina; i++ ) {
			
			System.out.println(zbor[i]);
			
		}
		
	}
	
}