package armstrongsayi1;
import java.util.Scanner;
public class Armstrongsayi1 {
public static void main(String[] args) {
    Scanner klavye=new Scanner(System.in);
    System.out.print("Bir sayı giriniz:");
    int sayi= klavye.nextInt();
    int basamak=0;
    int toplam=0;
    while(sayi!=0){
    toplam+=(sayi%10);
    sayi/=10;
    ++basamak;
    }
    System.out.println("Basamak toplamı="+toplam);
    }
    
}
