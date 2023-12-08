package armstrongsayi;
import java.util.Scanner;
public class Armstrongsayi {
public static void main(String[] args) {
         Scanner klavye=new Scanner(System.in);
         int sayi;
         System.out.print("Bir sayı giriniz:");
         sayi=klavye.nextInt();
         int basNum=0;
         int numSay=sayi;
         int basdeger;
         int sonuc=0;
         int basPow;
         while(numSay!=0){
         numSay/=10;
         basNum++;
         }
         numSay=sayi;
         while(numSay!=0){
         basdeger=numSay%10;
         basPow=1;
         for(int i=1;i<=basNum;i++){
         basPow*=basdeger;
         }
         sonuc+=basPow;
         numSay/=10;
         }
         if(sonuc==sayi){
             System.out.println(sayi+" sayısı bir Armstrong sayısıdır.");
         }else{
             System.out.println(sayi+" sayısı Armstrong sayı değildir.");
         }
    }
    
}
