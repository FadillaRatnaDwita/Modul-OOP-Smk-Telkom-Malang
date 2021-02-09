package Presensi1;

  class Player{
   //Definisi atribut
    String nama;
    int kecepatan;
    int nyawa;

    // definisi method run
    void run(){
        System.out.println(nama +" is running...");
        System.out.println("Speed: "+ kecepatan);
    }

    // definisi method isDead untuk mengecek nilai kesehatan (healthPoin)
    boolean isDead(){
        if(nyawa <= 0) return true;
        return false;
    }
  }


public class Game {

    public static void main(String[] args) {
        // membuat objek player
        Player petani = new Player();

        // mengisi atribut player
        petani.nama = "Petani Kode";
        petani.kecepatan = 78;
        petani.nyawa = 100;

        // menjalankan method
        petani.run();

        if(petani.isDead()){
            System.out.println("Game Over!");
        }

    }
    
    
}
