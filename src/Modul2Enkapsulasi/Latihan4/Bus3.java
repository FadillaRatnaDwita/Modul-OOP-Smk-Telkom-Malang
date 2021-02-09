package Modul2Enkapsulasi.Latihan4;

public class Bus3 {
    public int penumpang;
    public int maxPenumpang;
    
    public Bus3(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    //Methode mutator
    public void addPenumpang(int penumpang){
    int temp;
    temp = this.penumpang+penumpang;
    if(temp > maxPenumpang){
        System.out.println("Penumpang melebihi kuota");
    }else{
        this.penumpang = temp;
    }  
}

    public void getPenumpang(int password){
        if(password == 24){
            System.out.println("Password benar");
        }else{
            System.out.println("Password salah");
        }
    }
    
    public void cetakPenumpang(){
        System.out.println("Penuumpang bus sekarang = " + penumpang);
        System.out.println("Maksimum penumpang yang seharusnya = " + maxPenumpang);
    }
}
