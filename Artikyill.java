
package artikyill;
import java.util.Scanner;
public class Artikyill {
public static void main(String[] args) {
         Scanner klavye=new Scanner(System.in);
      int yil;
      System.out.print("Bir yıl giriniz:");
      yil = klavye.nextInt();
      if(yil % 4 == 0){
          System.out.println("Artık yıldır.");
        
      }else{
          System.out.println("Artık yıl değildir.");
      }
    }
    
}
