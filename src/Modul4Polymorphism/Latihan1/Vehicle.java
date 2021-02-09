package Modul4Polymorphism.Latihan1;

public abstract class Vehicle {//Kelas abstrak
    public void function(){
        System.out.println("Transportation Tools");
    }
    
     public void fuel(){//public abstract  void fuel(){
        System.out.println("Fuels");
    }
    
    public abstract void walk();
}
