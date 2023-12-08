package armstrongsayi1;
import java.util.Scanner;
public class Armstrongsayi1 {
public static void main(String[] args) {
     Scanner klavye=new Scanner(System.in);
        int sayi,b;
        System.out.println("Bir sayı giriniz:");
        sayi=klavye.nextInt();
        int basamaknumarasi=0;
        int tempNumber=sayi;
        int basValue;
        int result=0;
        int basPow;
        while(tempNumber != 0){
        tempNumber/=10;
        basamaknumarasi++;
        }
        tempNumber=sayi;
        while(tempNumber != 0){
        basValue=tempNumber%10;
        basPow=1;
        for(int i=1;i<=basamaknumarasi;i++){
        basPow*=basValue;
        }
        result+=basPow;
        tempNumber/=10;
        }
        if(result== sayi){
            System.out.println(sayi + " sayısı bir Armstrong sayıdır.");
        }else{
            System.out.println(sayi + " sayısı Armstrong sayı değildir.");
        }
        
    }
    
}
