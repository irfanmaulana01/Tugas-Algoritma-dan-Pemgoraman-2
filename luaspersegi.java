import java.util.Scanner;
import java.util.Locale;
    
class LuasPersegiPanjang {
 
  static double hitungLuasPersegiPanjang(double p, double l) {
    double luas = p*l;
    return Math.round(luas*100)/100.0 ;
  }
     
  public static void main(String args[]){
             
    Scanner input = new Scanner(System.in).useLocale(Locale.US);
        
    System.out.println("##  Program Java Luas Persegi Panjang  ##");
    System.out.println("=========================================");
    System.out.println();
       
    double panjang, lebar;
     
    System.out.print("Input panjang persegi: ");
    panjang = input.nextDouble();
     
    System.out.print("Input lebar persegi: ");
    lebar = input.nextDouble();
        
    System.out.println("Luas persegi panjang: "
                        +hitungLuasPersegiPanjang(panjang,lebar));
   
  }
}