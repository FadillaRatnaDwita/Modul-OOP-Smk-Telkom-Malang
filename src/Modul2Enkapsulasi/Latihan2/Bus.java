package Modul2Enkapsulasi.Latihan2;

public class Bus {
private int penumpang;
private int maxPenumpang;

//Konstruktor kelas bus
public Bus(int maxPenumpang){
    this.maxPenumpang = maxPenumpang;
    penumpang = 0;
}

//Methode mutator untuk menambahkan penumpang
public void addPenumpang(int penumpang){
    int temp;
    temp = this.penumpang+penumpang;
    if(temp >= maxPenumpang){
        System.out.println("Penumpang melebihi kuota");
    }else{
        this.penumpang = temp;
    }  
}

public void cetak(){
        System.out.println("Penumpang bus sekarang adalah " + penumpang);
        System.out.println("Penumpang maksimum bus seharusnya adalah " + maxPenumpang);
}
}
