package Percobaaan;
//Class Persegi
class Persegi{
    //Definisi atribut
    double sisi;
    
 //Definisi methode untuk menghitung keliling persegi
    double hitungKelilingPersegi(){
      return 4*sisi;
    }
    
 //Definisi methode untuk menghitung luas persegi
    double hitungLuasPersegi(){
     return sisi*sisi;
    }
}

//Class Persegi Panjang
class PersegiPanjang {
  //Definisi atribut
    double panjang;
    double lebar;
      
  //Methode untuk menghitung kelilingpersegipanjang
    double hitungKelilingPersegiPanjang(){
        return (2 * panjang) + (2 * lebar);
    }
    
   //Methode untuk menghitung kelilingpersegipanjang
    double hitungLuasPersegiPanjang(){
        return panjang * lebar ;
    } 
   }




public class Menghitung {

  
    public static void main(String[] args) {
        System.out.println("\n ============ Menghitung Luas dan Keliling Persegi ============= \n");
        
       // membuat objek persegi1
       Persegi persegi1 = new Persegi();
       persegi1.sisi = 15;
       System.out.println("Keliling Persegi1 = " + persegi1.hitungKelilingPersegi());
       System.out.println("Luas Persegi1 = " + persegi1.hitungLuasPersegi());
       
       Persegi persegi2 = new Persegi();
       persegi2.sisi = 8;
       System.out.println("Keliling Persegi2 = " + persegi2.hitungKelilingPersegi());
       System.out.println("Luas Persegi2 = " + persegi2.hitungLuasPersegi());
       
        System.out.println("\n =========== Menghitung Luas dan Keliling Persegi Panjang ============ \n");
       
       //Membuat objek persegi panjang
       PersegiPanjang persegiPanjangA = new PersegiPanjang();
       persegiPanjangA.panjang = 21;
       persegiPanjangA.lebar = 11;
       System.out.println("Keliling Persegi Panjang A = " + persegiPanjangA.hitungKelilingPersegiPanjang());
       System.out.println("Luas Persegi Panjang A = " + persegiPanjangA.hitungLuasPersegiPanjang());
       
       PersegiPanjang persegiPanjangB = new PersegiPanjang();
       persegiPanjangB.panjang = 39;
       persegiPanjangB.lebar = 15;
       System.out.println("Keliling Persegi Panjang B = " + persegiPanjangB.hitungKelilingPersegiPanjang());
       System.out.println("Luas Persegi Panjang B = " + persegiPanjangB.hitungLuasPersegiPanjang());
        
    }
    
}
