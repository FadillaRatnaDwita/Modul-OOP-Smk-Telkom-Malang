package StudiKasusObjek;
import java.lang.Math;  //LIBRARY MATH CLASS
        
//Membuat Class Kubus
class Kubus{
    //Definisi atribut
    double sisi;
    
 //Definisi methode untuk menghitung luas permukaan kubus
    double hitungLPKubus(){
      return 6*sisi*sisi;
    }
    
 //Definisi methode untuk menghitung volume kubus
    double hitungVolumeKubus(){
     return sisi*sisi*sisi;
    }
    
    //Membuat methode showKubus
    void showKubus(){
        System.out.println("========== Kubus ==========  ");
        System.out.println("Sisi = " + sisi + " cm");
        System.out.println("Luas Permukaan Kubus = " + hitungLPKubus()+ " cm^2");
        System.out.println("Volume Kubus = " + hitungVolumeKubus() + " cm^3" );
    }
}

//Membuat Class Balok
class Balok{
    //Definisi atribut
    double p, l, t;
    
 //Definisi methode untuk menghitung luas permukaan balok
    double hitungLPBalok(){
      return 2*((p*l)+(p*t)+(l*t));
    }
    
 //Definisi methode untuk menghitung volume balok
    double hitungVolumeBalok(){
     return p*l*t;
    }
    
  //Membuat methode show 
    void showBalok(){
        System.out.println("\n========= Balok =========\n");
        System.out.println("Panjang = " + p + " cm");
        System.out.println("Lebar = " + l + " cm"); 
        System.out.println("Tinggi = " + t + " cm");
        System.out.println("Luas Permukaan = " + hitungLPBalok() + " cm^2");
        System.out.println("Volume Balok = " + hitungVolumeBalok() + " cm^3");
    }
}

//Membuat Class Tabung
class Bola{
    //Definisi atribut
    double jariJari;
    
 //Definisi methode untuk menghitung luas permukaan bola
    double hitungLPBola(){
      return (4 * Math.PI * Math.pow(jariJari,2));
    }
    
 //Definisi methode untuk menghitung volume bola
    double hitungVolumeBola(){
     return (4 * Math.PI * Math.pow(jariJari,3)/3);
    }
    
  //Membuat methode show 
    void showBola(){
        System.out.println("\n========= Bola =========\n");
        System.out.println("Jari Jari = " + jariJari + " cm");
        System.out.println("Luas Permukaan = " + hitungLPBola() + " cm^2");
        System.out.println("Volume Balok = " + hitungVolumeBola()+ " cm^3");
    }
}
public class MenghitungLuasBangunRuang { 
    public static void main(String[] args) {
       //Membuat Objek Kubus
       Kubus kubusA = new Kubus();
       kubusA.sisi = 19;
       kubusA.showKubus();
       
       //Membuat Objek Balok
       Balok balok1 = new Balok();
       balok1.p = 28;
       balok1.l = 5;
       balok1.t = 10;
       balok1.showBalok();
       
        //Membuat Objek Bola
        Bola ballBlack = new Bola();
        ballBlack.jariJari = 111;
        ballBlack.showBola();
    }
}
