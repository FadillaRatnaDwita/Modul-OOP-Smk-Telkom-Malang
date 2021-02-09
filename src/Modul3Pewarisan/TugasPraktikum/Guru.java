package Modul3Pewarisan.TugasPraktikum;

public class Guru extends anggotaSekolah{
 private String nip;
 private String mapel;
 
 public Guru(String nip, String mapel, String nama, int umur, String nik, String gender, String alamat){
     super(nama, umur, nik, gender, alamat);
     this.nip = nip;
     this.mapel = mapel;
 }
 
 public void show(){
     super.show();
     System.out.println("NIP :" + this.nip);
     System.out.println("Mengajar Mata pelajaran :" + this.mapel);
 }
    
}
