
package oraimunka0223;

import java.util.Random;

public class Equalizer {
    private static final Random r = new Random();
    
        public static void main(String[] args) {
                   
        sorok();
        
    }

    private static void sorok() {
        eq();
        eq(8, true);
        eq(12);
        eq(true);
        eq();
    }

    private static void eq(int hossz) {
        System.out.println(block(hossz));
    }
    private static void eq() {
        System.out.println(block(r.nextInt(3, 8)));
    }
    
    private static void eq(int hossz, boolean ertekLatszik) {
        String igaz = block(hossz);
        if (ertekLatszik == true){
            System.out.println(igaz + "%s (%d)".formatted("\u001B[0m", hossz));
        }

    }
    private static void eq(boolean ertekLatszik) {
        eq(r.nextInt(3, 8), ertekLatszik);
    }
    
    
    

    private static String block(int hossz) {
        String szoveg = "";
        for (int i = 0; i < hossz; i++) {
            szoveg += "\u001B[45m" + " ";
            
        }
        return szoveg;
    }
    
    
}

