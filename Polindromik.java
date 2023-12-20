package polindromik;
import java.util.Scanner;
//Poindromik sayi,iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
//Örnek;1,101,9999...
public class Polindromik {
       static boolean isPolindrom(int number){
       int temp=number,reverseNumber=0,lastNumber=0;
       while(temp!=0){
           System.out.println("-------------------");
           System.out.println("Sayi=>"+temp);
           lastNumber=temp%10;
           System.out.println("Son basamak=>"+lastNumber);
           reverseNumber=(reverseNumber*10)+lastNumber;
           System.out.println("Yeni sayi=>"+reverseNumber);
           temp/=10;
       }
         if(number == reverseNumber)
                 return true;
         else
             return false;
       }
    public static void main(String[] args) {
        System.out.println(isPolindrom(5648975));
    }
    
}
