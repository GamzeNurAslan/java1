package uslusayi;
/*Scanner klavye=new Scanner(System.in);
       int n,r,uslu;
       System.out.println("Üssü alınacak sayıyı giriniz:");
       n=klavye.nextInt();
       System.out.println("Üs olacak sayıyı giriniz:");
       r=klavye.nextInt();
       uslu=(int) Math.pow(n,r);
       System.out.println("Üslü ifade="+uslu);*/
//*****************************************************************************//
import java.util.Scanner;
public class Uslusayi {
public static void main(String[] args) {
         Scanner klavye=new Scanner(System.in);
         int n,r,toplam=1;
         System.out.println("Üssü alınacak sayıyı giriniz:");
         n=klavye.nextInt();
         System.out.println("Üs olacak sayıyı giriniz:");
         r=klavye.nextInt();
         for(int i=1;i<=r;i++){
             toplam*=n;
             System.out.println(""+toplam);
         }
    }
    
}
