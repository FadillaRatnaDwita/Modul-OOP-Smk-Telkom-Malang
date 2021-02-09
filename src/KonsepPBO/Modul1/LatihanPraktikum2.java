
package KonsepPBO.Modul1;


public class LatihanPraktikum2 {

    
    public static void main(String[] args) {
    float suhuC = 78;
    float suhuR = (float) (0.8 * suhuC);
    float suhuK = suhuC + 273;
    float suhuF = (float) ((1.8 * suhuC) + 31);
     
        System.out.println("R = " + "0.8 * " + suhuC + " = " + suhuR + "R");
        System.out.println("K = " + suhuC + " + 273 = " +suhuK + "K");
        System.out.println("R = " + "1.8 * " + suhuC + " + 31 = " +suhuF + "F");
    }
    
}
