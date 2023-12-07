package faktoriyelhesabi;
import java.util.Scanner;
public class Faktoriyelhesabi {
public static void main(String[] args) {
    Scanner klavye = new Scanner(System.in);
        int faktoriyel = 1;
        System.out.println("Bir sayi giriniz: ");
        int sayi = klavye.nextInt();
        
        for(int i = 1; i <= sayi; i++)
        {
            faktoriyel = faktoriyel * i;
        }
        System.out.println(sayi + "!= " + faktoriyel);
   
       
    }
    
}
