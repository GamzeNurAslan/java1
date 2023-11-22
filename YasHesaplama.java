
package yashesaplama;
import java.util.Scanner;
public class YasHesaplama {
public static void main(String[] args) {
    int dy,sy,yas;
    Scanner klavye = new Scanner ( System.in);
    System.out.println("Doğum yılını giriniz:");
    dy = klavye.nextInt();
    System.out.println("Bugünün yılını giriniz:");
    sy = klavye.nextInt();
   
    yas = sy - dy;
    System.out.println(""+yas);
  
    
    
    
       
    }
    
}
