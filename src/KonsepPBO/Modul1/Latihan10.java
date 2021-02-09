
package KonsepPBO.Modul1;
import java.util.*;
public class Latihan10 {

    public static void main(String[] args) {
    Scanner masukan = new Scanner(System.in);//Mendeklarasi scanner
        System.out.print("Masukkan batas bilangan : ");//Mengambil input user untuk batas bilangan
        int batas = masukan.nextInt();//Mendeklarasi var. batas (Tipe data int) dengan scanner 
        int hasil = 0;//Mendeklarasi var. hasil = 0
        for(int i=1; i<=batas; i++){//Untuk i = 1, i kurang dari batas, i++
         hasil += i; //nilai hasil adalah nilai hasil itu sendiri ditambah dengan nilai variabel i
        System.out.println("Total jumlahnya adalah : " +hasil);
        }
    }
}
