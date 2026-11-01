import java.util.Scanner;

public class DN01_63260380 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// argumenta
		int a = sc.nextInt();
        int b = sc.nextInt();
		// deklaracija rezultata
		int rez = 0;
		
		while ( a > 0 && b > 0 ) {
			a--;
			b--;
			/* zanimiv vzorec, kjer v mrežo x * y točk lahko stisnemo
			(x-1)*(y-1) kvadratov z stranico 1
			(x-2)*(y-2) kvadratov z stranico 2
			itd
			*/
			rez = rez + ( a * b ) ;
			
		}
		// rezultat :)
		System.out.println(rez);
		// upam da bodo vse naloge tako lahke >:)
	}
}