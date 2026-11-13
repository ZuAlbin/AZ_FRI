
public class Volitve {

    public static void main(String[] args) {
        // dopolnite po potrebi ...
    }

    public static int steviloGlasov(int[][][] t, int leto, int stranka) {
        
        int dolzina = t[leto][stranka].length;
        
        int rezultat = 0;
        
        for ( int i = 0; i < dolzina; i++) {
        
        rezultat += t[leto][stranka][i];
        
        }
        return rezultat;
    }

    public static int[][] glasovi(int[][][] t) {
 
       int leto = t.length;
       
       int stranka = t[0].length;
       
       int[][] volOut = new int[leto][stranka];
        
        for (int i = 0; i < leto ; i++){
            for (int j = 0; j < stranka ; j++){
          
            volOut[i][j] = steviloGlasov(t, i, j);
        
            }
        }
        
        return volOut;
        
    }

    public static int najVolisce(int[][][] t, int stranka) {
        int stVolisc = t[0][stranka].length;
        int vMaxVolisce = 0;
        int iMaxVolisce = 0;
        
        for (int volisce = 0; volisce < stVolisc; volisce++) {
            int sumVolisce = 0;
            for (int leto = 0; leto < t.length; leto++) {
                sumVolisce += t[leto][stranka][volisce];
            }
            if (sumVolisce > vMaxVolisce) {
                vMaxVolisce = sumVolisce;
                iMaxVolisce = volisce;
            }
        }
        return iMaxVolisce;
        
    }

    public static int vsotaUvrstitev(int[][][] t, int stranka, int volisce) {
        // popravite / dopolnite
        return -1;
    }
}
