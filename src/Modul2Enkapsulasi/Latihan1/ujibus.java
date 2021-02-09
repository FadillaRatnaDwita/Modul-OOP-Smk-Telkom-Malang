package Modul2Enkapsulasi.Latihan1;

public class ujibus {

    public static void main(String[] args) {
     //Membuat objek busMini dari kelas bus
     Bus busMini = new Bus();
     //Memasukkan jumkah penumpang dan maxPenumpang ke dalam objek busMini
     busMini.penumpang = 5;
     busMini.maxPenumpang = 15;
     //Memanggil methode cetak pada kelas bus
     busMini.cetak();
     
     //Menambah penumpang busMini
     busMini.penumpang = busMini.penumpang + 5;
     //Memanggil methode cetak pada kelas Bus
     busMini.cetak();
     
     //Mengurangi jumlah penumpang busMIni
     busMini.penumpang = busMini.penumpang - 2;
     busMini.cetak();
     
     //Menambah penumpang busMini
     busMini.penumpang = busMini.penumpang + 8;
     busMini.cetak();
    }
    
}
