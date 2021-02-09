
package KonsepPBOModul1Lanjutan;
import java.util.*;

public class Latihan3 {

    public static void main(String[] args) {
    Scanner masukan =  new Scanner(System.in);
    int a,b,c;
    System.out.println("Program Menjumlah 2 nilai");
    System.out.print("Masukkan nilai a : ");
    a = masukan.nextInt();
    System.out.print("Masukkan nilai b : ");
    b = masukan.nextInt();
    System.out.print("Masukkan nilai c : ");
    c = masukan.nextInt();
    System.out.println( );
    System.out.println("Jumlah a + b : " + jumlah(a, b) );
    System.out.println("Jumlah b + c : " + jumlah(b, c) );
    System.out.println("Jumlah a + c : " + jumlah(a, c) );
    }
    
    //Konstruktor
    private static int jumlah(int a, int b){
        int hasil = a + b;
        return hasil;
    }
}
