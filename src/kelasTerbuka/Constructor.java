package kelasTerbuka;

//Class tanpa constructor /polos
class Mahasiswa{
    String nama;
    int umur;
}

//Class dengan constructor
class Siswa{
    String nama;
    String kelas;
    String jurusan;
    
    //Constructor dipanggil saat objek pertama kali dibuat
//    Siswa(){
//        System.out.println("Ini adalah constructor");    
//    }
    
      //Constructor dengan parameter
      Siswa (String inputNama, String inputKelas, String inputJurusan){    
          nama = inputNama;
          kelas = inputKelas;
          jurusan = inputJurusan;
          
         System.out.println("Nama Siswa : " + nama);
         System.out.println("Kelas : " + kelas);
         System.out.println("Jurusan : " + jurusan);
      }
    
   }



public class Constructor {

  
    public static void main(String[] args) {
        
     //Membuat objek mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Levira Ariana";
        mahasiswa1.umur = 20;
        
        System.out.println("Nama Mahasiswa : " + mahasiswa1.nama);
        System.out.println("Umur : " + mahasiswa1.umur );
        
      //Membuat object siswa
         Siswa siswa1 = new Siswa("Stevya", "X" , "RPL");
         Siswa siswa2 = new Siswa("Allando", "XI","TKJ");
                 
         
   
    }
    
}
