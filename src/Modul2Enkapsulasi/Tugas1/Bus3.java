package Modul2Enkapsulasi.Tugas1;


public class Bus3 {
    public double penumpang;
    public double maxPenumpang;
    public double penumpangBaru;
    public double counter;
    
    public Bus3(double maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    //Methode mutator
    public void addPenumpang(double penumpang){
    double temp;
    temp = this.penumpang+penumpang;
    if(temp > maxPenumpang){
        System.out.println("Penumpang melebihi kuota");
    }else{
        this.penumpang = temp;
        counter++;
    }  
}

    public void getPenumpang(double password){
        if(password == 24){
            System.out.println("Password benar");
        }else{
            System.out.println("Password salah");
        }
    }
    
    public double getAverage(){
        return penumpang/counter;
    }
    
    public void cetakPenumpang(){
        System.out.println("Penuumpang bus sekarang = " + penumpang);
        System.out.println("Maksimum penumpang yang seharusnya = " + maxPenumpang);
        
       
    }
    
}
