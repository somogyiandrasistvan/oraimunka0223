
package oraimunka0223;

import java.util.Random;

public class Qrkod {
    
    private static final Random r = new Random();
   
    
    public static void main(String[] args) {
        kiir(qr());
        kiir(qr(20));
        kiir(qr(true));
        kiir(qr(20, true));
    }
    
    private static String qr() {
        return qr(10);
    }
    private static String qr(int hossz) {
        return qr(hossz, false);
    }
    private static String qr(boolean negyzet) {
        return qr(10, negyzet);
    }
    private static String qr(int hossz, boolean negyzet) {
        String str = "";
        
        for (int i = 0; i < hossz / 2; i++) {
            
        }

    }
