package StudiKasusEnkap;

public class TestKereta {

    public static void main(String[] args) {
        KeretaApi kai = new KeretaApi();//Membuat objek
        
        kai.getPenumpang(9);  //Memanggil methode getPenumpang untuk menambahkan kode (kode akan dicek)
        kai.getPenumpang(111); //Memanggil methode getPenumpang untuk menambahkan kode (kode akan dicek)
        kai.addPenumpang(25);  //Menambahkan jumlah penumpang dengan memanggil methode addPenumpang
        kai.cetak();  //Mencetak data penumpang dengan memanggil mehode cetak
        kai.addPembayaran();  //Memanggil methode pembayaran untuk mengetahui pembayaran saat ini
        
        kai.addPenumpang(15);  //Menambahkan jumlah penumpang dengan memanggil methode addPenumpang
        kai.cetak();  //Mencetak data penumpang dengan memanggil mehode cetak
        kai.addPembayaran();   //Memanggil methode pembayaran untuk mengetahui pembayaran saat ini
        
        kai.addPenumpang(10);  //Menambahkan jumlah penumpang dengan memanggil methode addPenumpang
        kai.cetak();  //Mencetak data penumpang dengan memanggil mehode cetak
        kai.addPembayaran();  //Memanggil methode pembayaran untuk mengetahui pembayaran saat ini
        
        kai.addPenumpang(20);  //Menambahkan jumlah penumpang dengan memanggil methode addPenumpang
        kai.cetak();  //Mencetak data penumpang dengan memanggil mehode cetak
        kai.addPembayaran(); //Memanggil methode pembayaran untuk mengetahui pembayaran saat ini
        
        kai.getTotalPembayaran(); //Memanggil methode getTotalPembayaran untuk mengetahui TotalPembayaran keseluruhan
        System.out.println("\nRata-rata penumpang = " + kai.getAverage());  //Mencetak rata-rata penumpang dengan memanggil methode getAverage
       
    }
    
}
