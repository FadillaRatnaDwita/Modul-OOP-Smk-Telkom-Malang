package StudiKasusEnkap;

//Membuat Class KeretaApi
public class KeretaApi {
    //Membuat atribut
    public double penumpang;
    private double maxPenumpang = 70;
    private double counter;
    public double penumpangBaru;
    private double hargaTiket;
    private char namaPenumpang = 'A';
    
    //Membuat fungsi addPenumpang
    public void addPenumpang(int penumpang){
    penumpangBaru = this.penumpang+penumpang; //PenumpangBaru adalah jumlah dari this.penumpang (penumpang di class KeretaApi)
                                                             //dengan penumpang (di void addPenumpang)
    if(penumpangBaru > maxPenumpang){ //Jika penumpangBaru > maxPenumpang maka penumpang melebihi kuota maxPenumpang
        System.out.println("Penumpang melebihi kuota");
    }else{  //Jika tidak maka penumpang = penumpangBaru
        this.penumpang = penumpangBaru;
        counter++;  //Berapa kali menambahkan penumpang
    }  
    }
    
    //Membuat methode getPenumpang
    public void getPenumpang(int kodeKereta){
        if(kodeKereta == 111){ //Jika kodeKereta == 111 maka penumpang dapat memasuki kereta
            System.out.println("\nPenumpang bisa memasuki kereta");
        }else{ //Jika tidak maka penumpang tidak dapat memasuki kereta
            System.out.println("\nPenumpang tidak bisa memasuki kereta");
        }
    }
    
    //Membuat methode getAverage
     public double getAverage(){
        return penumpang/counter; //Penumpang/counter s rata-rata penumpan ---> Jadi rata-rata penumpang didapat dari jumlah
                                                  //penumpang dibagi dengan berapa kali addPenumpang
    }
     
     //Membuat Methode addPembayaran
     public void addPembayaran(){
         hargaTiket = 36000;//Harga tiket 36.000
         double pembayaran = penumpang*hargaTiket;//Pembayaran adalah hasil kali penumpang dengan hargaTiket
         System.out.println("Pembayaran saat ini  = Rp " + pembayaran);
     }
     
     //Membuat methode getTotalPembayaran
     public void getTotalPembayaran(){
         System.out.println("\nTotal seluruh pembayaran = Rp " + hargaTiket * penumpang );  //Methode untuk menghitung total keseluruhan pembayaran
     }
     
     
     //Membuat methode cetak
     public void cetak(){
         System.out.println("\nJumlah penumpang = " + penumpang);
         System.out.println("Jumlah penumpang maksimal = " + maxPenumpang);
         
     }
}
