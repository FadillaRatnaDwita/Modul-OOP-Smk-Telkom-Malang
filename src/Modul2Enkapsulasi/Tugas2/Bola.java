package Modul2Enkapsulasi.Tugas2;
import java.lang.Math;  //LIBRARY MATH CLASS

public class Bola {
    private double jariJari; //property jari-jari ---> double
    
    //Membuat constructor
    public Bola (double jariJari){
        this.jariJari = jariJari;
    }
    
    //Methode setJariJari
    public void setJariJari(double jariJari){
        this.jariJari = jariJari;
    }
    
    //Methode showDiameter
    public void showDiameter(){
        System.out.println("Diameter Bola adalah " + 2*jariJari);
    }
    
    //Methode showLuasPermukaan
    public void showLuasPermukaan(){
        System.out.println("Luas Permukaan Bola = " + (4 * Math.PI * Math.pow(jariJari,2)));
    }
    
    //Methode showVolme
    public void showVolume(){
        System.out.println("Volume Bola = " + (4 * Math.PI * Math.pow(jariJari,3)/3));
    }
}
