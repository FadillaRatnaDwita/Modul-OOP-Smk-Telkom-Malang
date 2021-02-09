package kelasTerbuka;

//Class Penduduk
class Penduduk{
   //data member/atribut
    String nama;
    int umur;
    String gender;
    
    //Constructor akan dipanggil saat object dari class dibuat ===> Seperti Methode
    Penduduk(String nama, int umur, String gender){
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        //This.atribut/variabel merupakan milik class 
        //sedangkan hanya nama atribut merupakan milik parameter
     }
    
    //Methode tanpa return dan tanpa parameter
    void show(){
        System.out.println("\nNama Penduduk : " + this.nama );
        System.out.println("Umur : " + this.umur);
        System.out.println("Jenis Kelamin : " + this.gender);
    }
    
    //Methode tanpa return dengan parameter
    void setNama(String nama){
        this.nama = nama;   
    }
    
    //Methode dengan return tanpa parameter
    String getName(){
        return this.nama;
    }
    
    int getUmur(){
        return this.umur;
    }
    
    //Methode return dengsn parameter
    String kata(String message){
        return message + " juga, nama saya adalah " + this.nama;
    }
    
}



public class Methode {

    public static void main(String[] args) {
        //Membuat objek penduduk
        Penduduk penduduk1 = new Penduduk("Dewianti", 22 , "Perempuan");
        penduduk1.show();//Memanggil methode
        penduduk1.setNama("Sleve");
        penduduk1.show();
        String data = penduduk1.kata("Hello");
        System.out.println(data);
       
        
        
        Penduduk penduduk2 = new Penduduk("Ariano", 18, "Laki-Laki");
        penduduk2.show();
         System.out.println("Nama : " + penduduk2.getName());
        System.out.println("Umur : " + penduduk2.getUmur());
        
        
       
    }
    
}
