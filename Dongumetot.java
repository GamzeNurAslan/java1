package dongumetot;
import java.util.Scanner;
public class Dongumetot {
   
public static void main(String[] args) {
         Scanner klavye=new Scanner(System.in);
         System.out.print("Bir sayı girin:");
         int sayi=klavye.nextInt();
          hesapla(sayi);
    }
     public static void hesapla(int sayi){
        if(sayi>0){
           sayi-=5;
            System.out.println("Şu anki değer:"+sayi);
            hesapla(sayi);
        }else{
            while(sayi<=0){
                sayi+=5;
                System.out.println("Şu anki değer:"+sayi);
            }
        }
     }
    
    }
    

