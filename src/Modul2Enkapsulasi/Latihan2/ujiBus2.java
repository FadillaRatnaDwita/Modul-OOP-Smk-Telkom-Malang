package Modul2Enkapsulasi.Latihan2;

public class ujiBus2 {

    public static void main(String[] args) {
        //Membuat objek busBesar dari kelas bus
        Bus busBesar = new Bus(40);
        busBesar.cetak();
        
        //Penambahan penumpang
        busBesar.addPenumpang(15);
        busBesar.cetak();
        
        //Penambahan penumpang
        busBesar.addPenumpang(5);
        busBesar.cetak();
        
        //Penambahan penumpang
        busBesar.addPenumpang(26);
        busBesar.cetak();
    }
    
}
