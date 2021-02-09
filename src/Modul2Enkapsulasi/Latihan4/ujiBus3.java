package Modul2Enkapsulasi.Latihan4;

public class ujiBus3 {

    public static void main(String[] args) {
        Bus3 bus = new Bus3(5);
            bus.getPenumpang(17);
            bus.getPenumpang(24);
            bus.cetakPenumpang();
            
            //Menambah penumpang
            bus.addPenumpang(2);
            bus.cetakPenumpang();
            
            //Menambah penumpang
            bus.addPenumpang(1);
            bus.cetakPenumpang();
            
            //Menambah penumpang
            bus.addPenumpang(2);
            bus.cetakPenumpang();
            
            //Menambah penumpang
            bus.addPenumpang(2);
            bus.cetakPenumpang();
            
    }
    
}
