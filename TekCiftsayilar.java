package tek.ciftsayilar;
import java.util.Scanner;
public class TekCiftsayilar {
public static void main(String[] args) {
    int sayi;
    Scanner klavye = new Scanner(System.in);
    System.out.println("Sayıyı giriniz:");
    sayi = klavye.nextInt();
    if (sayi % 2 == 0){
        System.out.print("Sayı çifttir.");
    }else{
        System.out.print("Sayı tektir.");
    }
       
    }
    
}
