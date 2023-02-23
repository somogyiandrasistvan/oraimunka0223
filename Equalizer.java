
package oraimunka;

import java.util.Random;

public class Equalizer {
    
        public static void main(String[] args) {
            sorok();
        }
        public static void sorok(){
                       for (int i = 0; i < 5; i++){
                eq();
            }
        }
        private static void eq() {
            String szoveg = "";
            int also = 3;
            int felso = 7;
            Random r = new Random();
            int hossz = r.nextInt(felso-also+1)+also;
            for (int i = 0; i < hossz; i++){
                szoveg += "\u001B[45m" + " ";
            }
            System.out.println(szoveg);
            
        }
            
        }

