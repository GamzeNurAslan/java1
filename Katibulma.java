package katibulma;
import java.util.Scanner;
public class Katibulma {
public static void main(String[] args) {
     Scanner klavye=new Scanner(System.in);
     int sayi,toplam=0;
     System.out.println("Bir sayı giriniz:");
     sayi=klavye.nextInt();
     for(int i=1;i<=sayi;i+=2){
         System.out.println(i);
     toplam+=i;
     }
     System.out.println("Sayıların toplamı="+toplam);
    }
    
}
