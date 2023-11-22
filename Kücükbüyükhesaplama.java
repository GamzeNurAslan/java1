package kücükbüyükhesaplama;
import java.util.Scanner;
public class Kücükbüyükhesaplama {
public static void main(String[] args) {
    int sayi1,sayi2;
    Scanner klavye = new Scanner(System.in);
    System.out.print("Birinci giriniz:");
    sayi1 = klavye.nextInt();
    System.out.print("İkinci sayıyı giriniz:");
    sayi2 = klavye.nextInt();
    if (sayi1>sayi2){
    System.out.println("sayi1 daha büyüktür.");
    }else{
        System.out.println("sayi2 daha büyüktür.");
    
    }
    
    
       
    }
    
}
