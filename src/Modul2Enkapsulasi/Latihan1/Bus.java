package Modul2Enkapsulasi.Latihan1;


public class Bus {
    public int penumpang;
    public int maxPenumpang;
    
    public void cetak(){
        System.out.println("Penumpang bus sekarang adalah " + penumpang);
        System.out.println("Penumpang maksimum bus seharusnya adalah " + maxPenumpang);
    }
}
