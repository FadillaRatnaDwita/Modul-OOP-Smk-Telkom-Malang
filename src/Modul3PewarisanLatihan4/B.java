package Modul3PewarisanLatihan4;

class B extends A{
  private int b;
  
  public void setB (int nilai){
      b = nilai;
  }
  
  public int getB(){
      return b;
  }
  
  //Melakukan override terhadap methode tampilkanNilai() yang ada pada kelas A
  public void tampilkanNilai(){
      super.tampilkanNilai();//Memanggil methode kelas A
      System.out.println("Nilai : " + getB());
  }
}
