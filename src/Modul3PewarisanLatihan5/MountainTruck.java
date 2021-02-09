package Modul3PewarisanLatihan5;

public class MountainTruck extends Truck {
    //The MountainTruck SubClass adds one field
    public int seatHeight;
    
    //Construction
    public MountainTruck(int startHeight, int startCadence, int startSpeed, int startGear){
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

     //Method
    public void setHeight(int newValue){
        seatHeight = newValue;
    }

    public static void main(String[] args) {
        System.out.println("Mulai Berjalan");
        MountainTruck MB = new MountainTruck(0, 0, 0, 0);
        System.out.println("gear = " + MB.gear);
        System.out.println("speed = " + MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("gear = " + MB.gear);
        System.out.println("speed = " + MB.speed);
        MB.speedUp(2);
        System.out.println("gear = " + MB.gear);
        System.out.println("speed = " + MB.speed);
                
    }
    
}
