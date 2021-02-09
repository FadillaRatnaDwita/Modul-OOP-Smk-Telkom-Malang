
package KonsepPBO.Modul1;
import java.util.*;
public class Latihan6 {

    public static void main(String[] args) {
    Scanner masukan = new Scanner(System.in);
    System.out.print("Masukkan nilai WEB : ");
    int nilai = masukan.nextInt();
    if (nilai  >=  90){
        System.out.println("Nilai A");
    }else if (nilai >= 75){
        System.out.println("Nilai B");
    }else if (nilai >= 50){
        System.out.println("Nilai C");
    }else if (nilai >=35){
        System.out.println("Nilai D");
    }else{
        System.out.println("Nilai E");
    }
    
    }
    
}
