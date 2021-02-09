package Modul3PewarisanLatihan4;

class DemoOverride2 {

    public static void main(String[] args) {
        B  obj = new B();
        obj.setA(50);
        obj.setB(150);
        //akan memanggil method yang ada pada kelas B
        obj.tampilkanNilai();
    }
    
}
