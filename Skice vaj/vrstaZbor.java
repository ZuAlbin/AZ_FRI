import java.util.Scanner;

public class vrstaZbor {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int dolzina = input.nextInt();
		
		int[] zbor = new int[dolzina];
		
		for (int i = 0; i < dolzina; i++ ) {
			
			zbor[i] = input.nextInt();
			
		}
		
		for (int i = 0; i < dolzina; i++ ) {
			
			System.out.println(zbor[i]);
			
		}
		
/* blokec ki preveri za vsak i;
i-1 <= i <= i+1 
myb začni z i = 1, konec na i = dolzina - 1
za vsak i ki je to res dodaj k uvrščeni

če uvrščeni == 0, potem out nobeden
če uvrščeni > 0, potem out uvrščeni */

	}

}