package javautil;
import java.util.Scanner;
public class Javautil {
public static void main(String[] args) {
    Scanner klavye= new Scanner(System.in);
    System.out.println("Bir sayı giriniz:");
    int n = klavye.nextInt();
    System.out.println("1 ile "+n+"sayıları arasındaki 3'e ve 4'e bölünen sayıların ortalaması: ");
    double toplam=0,sayac=0;
    for(int i=1;i<=n;i++){
    if(i%12==0){
    //System.out.print(i+" ");
    sayac++;
    toplam+=i;
    }
    }
       System.out.println(toplam/sayac);
    }
    
}
