package Presensi1;
 class AlatHitung {
    
    float penjumlahan(){
        System.out.println("Menghitung penjumlahan");
        return 0;
    }
    
    float pengurangan(){
        System.out.println("Menghitung pengurangan");
        return 0;
    }
    
    float perkalian(){
        System.out.println("Menghitung perkalian");
        return 0;
    }
    
    float pembagian(){
        System.out.println("Menghitung pembagian");
        return 0;
    }
    
    float mod(){
        System.out.println("Menghitung modulus/hasil sisa bagi");
        return 0;
    }
    
}

class Kalkulator extends AlatHitung {
    float x;
    float y;
    
    void Show (){
        System.out.println("Nilai x = " + x);
        System.out.println("Nilai y = " + y);
    }

    @Override
    float penjumlahan(){
        float hasilTambah = x + y;
        System.out.println(x + " + " + y);
        System.out.println("Hasil Tambah: "+ hasilTambah);
        return hasilTambah;
    }

    @Override
    float pengurangan(){
        float hasilKurang= x - y;
        System.out.println(x + " - " + y);
        System.out.println("Hasil Pengurangan: " + hasilKurang);
        return hasilKurang;
    }
    
    @Override
    float perkalian(){
        float hasilKali= x * y;
        System.out.println(x + " * " + y);
        System.out.println("Hasil Perkalian " + hasilKali);
        return hasilKali;
    }
    
    @Override
    float pembagian(){
        float hasilBagi= x / y;
        System.out.println(x + " / " + y);
        System.out.println("Hasil Pembagian: " + hasilBagi);
        return hasilBagi;
    }
    
    @Override
    float mod(){
        float hasilMod= x % y;
        System.out.println(x + " % " + y);
        System.out.println("Hasil Modulus: " + hasilMod);
        return hasilMod;
    }
}

 
 
public class Presensi2 {

    public static void main(String[] args) {
         System.out.println("=========================== ALAT HITUNG KALKULATOR =========================== ");
    AlatHitung alatHitung = new AlatHitung();
    
        System.out.println("\n>>>>>>>>>>========== Kalkulator 1 ==========<<<<<<<<<<");
    
    Kalkulator kalkulator1 = new Kalkulator();
    kalkulator1.x = 23;
    kalkulator1.y = 17;
    
    kalkulator1.Show();
    alatHitung.penjumlahan();
    kalkulator1.penjumlahan();
    alatHitung.pengurangan();
    kalkulator1.pengurangan();
    alatHitung.perkalian();
    kalkulator1.perkalian();
    alatHitung.pembagian();
    kalkulator1.pembagian();
    alatHitung.mod();
    kalkulator1.mod();
    
    System.out.println("\n>>>>>>>>>>========== Kalkulator 2 ==========<<<<<<<<<<");
    
    Kalkulator kalkulator2 = new Kalkulator();
    kalkulator2.x = 119;
    kalkulator2.y = 36;
    
    kalkulator2.Show();
    alatHitung.penjumlahan();
    kalkulator2.penjumlahan();
    alatHitung.pengurangan();
    kalkulator2.pengurangan();
    alatHitung.perkalian();
    kalkulator2.perkalian();
    alatHitung.pembagian();
    kalkulator2.pembagian();
    alatHitung.mod();
    kalkulator2.mod();
    
   
    
    
    
    
            
    }
    
}
