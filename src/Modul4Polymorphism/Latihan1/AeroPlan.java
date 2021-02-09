package Modul4Polymorphism.Latihan1;

public class AeroPlan extends Vehicle {
    public void walk(){
        System.out.println("Aeroplan is Flying");
    }
    
    //Override methode 
    public void fuel(){
        System.out.println("Fuels");
    }
    
    public static void main(String[] args) {
        AeroPlan garuda = new AeroPlan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}
