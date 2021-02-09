package Modul3PewarisanLatihan5;

public class Truck {
    public int cadence;
    public int gear;
    public int speed;
    
    //Constructor
    public Truck (int startCadence, int startSpeed, int startGear){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    
    //Method
    public void setCadence (int newValue){
        cadence = newValue;
    }
    
    public void setGear (int newValue){
        gear = newValue;
    }
    
    public void applybrake (int decrement){
      speed = decrement;  // speed -= decrement;
    }
    
    public void speedUp (int increment){
      speed = increment;//  speed += increment;
    }
}
