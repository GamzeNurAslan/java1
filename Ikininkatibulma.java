package ikininkatibulma;
import java.util.Scanner;
public class Ikininkatibulma {
public static void main(String[] args) {
     Scanner klavye=new Scanner(System.in);
       int n;
       System.out.print("Bir sayı giriniz:");
       n = klavye.nextInt();
       for(int i=1;i<=n;i*=2){
       
           System.out.println(i);
       
       }
        
    }
    
}
