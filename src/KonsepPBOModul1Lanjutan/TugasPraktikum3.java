
package KonsepPBOModul1Lanjutan;

public class TugasPraktikum3 {

    public static void main(String[] args) {
    int n=5;
    for(int p=0; p<n; p++){
        for(int q = 0; q<n; q++){
            if(p == 0 || p == n - 1 || q == n - 1 - p){
                System.out.print("@");
            }else{
                System.out.print(" ");
            }
        }
         System.out.println(" ");
    }
       
    }
    
}
