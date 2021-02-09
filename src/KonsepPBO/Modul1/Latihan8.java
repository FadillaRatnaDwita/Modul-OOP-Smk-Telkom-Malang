
package KonsepPBO.Modul1;
import java.util.*;
public class Latihan8 {

    public static void main(String[] args) {
    Scanner masukan = new Scanner(System.in);  
        System.out.print("Masukkan nilai TPA: ");
        int TPA = masukan.nextInt();
        System.out.print("Masukkan nilai Bahasa Inggris: ");
        int bahasaInggris = masukan.nextInt();
        if ((TPA > 85) && (bahasaInggris > 80)){
            System.out.println("Siswa dapat Beasiswa");
        }else{
            System.out.println("Siswa tidak dapat Beasiswa");
        }
    }
    
}
