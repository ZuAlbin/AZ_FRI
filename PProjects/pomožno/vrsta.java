import java.util.Scanner;

public class vrsta {
	
	public static void main(String[] args) {
		
	float an = 2.0f;

    for (int i = 0; i < 100 ; i++){

        System.out.print(i + " ");
        float an1 = (an + (27/an))/2;
	    System.out.print(an1);
    	an = an1;
		System.out.println();
	    }
	}
}