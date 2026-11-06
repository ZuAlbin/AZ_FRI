import java.util.Scanner;

public class vrstaZbor {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int dolzina = input.nextInt();
		
		int[] zbor = new int[dolzina];
		
		for (int i = 0; i < dolzina; i++ ) {
			
			zbor[i] = input.nextInt();
			
		}
		
		int pravilni = 0;
		
		for (int i = 0; i < dolzina; i++ ) {
			
			if ( zbor[i-1] <= zbor[i] && zbor[i] <= zbor[i+1]) {
				
			pravilni++;
			
			}
			
		}
		if (pravilni > 0) {
		System.out.println(pravilni);
		} else {
			System.out.println("NOBEDEN");
		}
/* blokec ki preveri za vsak i;
i-1 <= i <= i+1 
myb začni z i = 1, konec na i = dolzina - 1
za vsak i ki je to res dodaj k uvrščeni

če uvrščeni == 0, potem out nobeden
če uvrščeni > 0, potem out uvrščeni */

	}

}