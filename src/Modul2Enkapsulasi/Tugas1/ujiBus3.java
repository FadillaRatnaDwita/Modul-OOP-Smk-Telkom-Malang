package Modul2Enkapsulasi.Tugas1;


public class ujiBus3 {

    public static void main(String[] args) {
       Bus3 bus = new Bus3(40); 
            bus.getPenumpang(19);//Password
            bus.getPenumpang(24);//Password
            bus.cetakPenumpang();
            
            //Menambah penumpang
            bus.addPenumpang(15);
            bus.cetakPenumpang();
            
            //Menambah penumpang
            bus.addPenumpang(5);
            bus.cetakPenumpang();
            
            //Menambah penumpang
            bus.addPenumpang(2);
            bus.cetakPenumpang();
            
          System.out.println("Rata-Rata Penumpang adalah " + bus.penumpang + " / " + bus.counter + " = "+ bus.getAverage());
    }
    
}
