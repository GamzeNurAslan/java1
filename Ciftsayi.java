package ciftsayi;
import java.util.Scanner;
public class Ciftsayi {
public static void main(String[] args) {
      Scanner klavye=new Scanner(System.in);
      int sayi;
       System.out.println("Bir sayı giriniz:");
      sayi=klavye.nextInt();
      for(int i=0;i<=sayi;i+=2){
         
          if(i%2==0){
          System.out.print(" "+i+" ");
          }
      
    }
}
}
