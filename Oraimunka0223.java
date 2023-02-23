

package oraimunka0223;

public class Oraimunka0222 {

    public static void main(String[] args) {
        
        
        int a = 1, b = 2, c = 3, d = 4;
        int ossz = elso10SzamOsszege();
        kiir("Az első 10 szám osszege: " + ossz);
        int ossz2 = osszead(a, b);
        kiir("a + b = " + ossz2);
        
        
        int osszeg = osszead(a, b);
        osszeg += osszead(c, d);
        kiir("1+2+3+4="+osszeg+"\n");
        
        int osszeg2 = osszead(a, b);
        osszeg2 += osszead(osszeg2, c);
        kiir("gyoke: "+Math.sqrt(osszeg2));
    }
    
    private static int elso10SzamOsszege(){
        int osszeg = 0;
        for (int i = 0; i < 10; i++){
            osszeg += i;
        }
        return osszeg;
        
    }
    
    private static int osszead(int a, int b){
        return a + b;
    }

    private static void kiir(String szoveg){
        System.out.println(szoveg);
        
    }
}
