package Modul3Pewarisan.TugasPraktikum;

public class anggotaSekolah {
    private String nama;
    private int umur;
    private String nik;
    private String gender;
    private String alamat;
    
    public anggotaSekolah(String nama, int umur, String nik, String gender, String alamat){
        this.nama = nama;
        this.umur = umur;
        this.nik = nik;
        this.gender = gender;
        this.alamat = alamat;
    }
    
    public void show(){
        System.out.println("Nama: " + this.nama);
        System.out.println("Umur: " + this.umur);
        System.out.println("Jenis Kelamin: " + this.gender);
        System.out.println("NIK: " + this.nik);
        System.out.println("Alamat : " + this.alamat);
    }
}
