
package ödevpatika2;
import java.util.Scanner;
public class ÖdevPatika2 {
public static void main(String[] args) {
      double fiyat,kdvOran1 = 0.18,kdvOran2 = 0.08,kdvFiyat,kdvliFiyat;
  Scanner klavye = new Scanner(System.in);
  System.out.print("Fiyat tutarını giriniz:");
  fiyat = klavye.nextDouble();
 
  if (fiyat<=1000){
      System.out.print("KDV değeriniz=0.18");
      kdvFiyat = fiyat*kdvOran1;
      kdvliFiyat = fiyat+kdvFiyat;
      
       System.out.println("KDV'siz fiyat ="+fiyat);
      System.out.println("KDV Oranı="+kdvOran1);
      System.out.println("KDV Fiyatı="+kdvFiyat);
      System.out.println("KDV'li Fiyatı="+kdvliFiyat);
      
  }else{
      System.out.print("KDV değeriniz=0.08");
       kdvFiyat = fiyat*kdvOran2;
      kdvliFiyat = fiyat+kdvFiyat;
       
      System.out.println("KDV'siz fiyat ="+fiyat);
      System.out.println("KDV Oranı="+kdvOran2);
      System.out.println("KDV Fiyatı="+kdvFiyat);
      System.out.println("KDV'li Fiyatı="+kdvliFiyat);
       
    }
    
}
