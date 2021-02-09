package Modul2Enkapsulasi.Tugas2;

public class testBola {

    public static void main(String[] args) {
       double jariJari = 21;//Membuat variabel jariJari
       
       Bola bola1 = new Bola(7);//Membuat objek dari class bola
       bola1.showDiameter();
       bola1.showLuasPermukaan();
       bola1.showVolume();;
       
        System.out.println("\n");
        bola1.setJariJari(jariJari);//memanipulasi jari2 dari objek yang telah dibuat
        bola1.showDiameter();
        bola1.showLuasPermukaan();
        bola1.showVolume();;
    }
    
}
