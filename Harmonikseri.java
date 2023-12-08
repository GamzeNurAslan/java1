package harmonikseri;
import java.util.Scanner;
public class Harmonikseri {
public static void main(String[] args) {
       Scanner klavye=new Scanner(System.in);
       System.out.println("Bir sayı değeri giriniz:");
       int n=klavye.nextInt();
       double sonuc=0;
       for(double i=1;i<=n;i++){
       sonuc+=(1/i);
       
       }
       System.out.println(sonuc);
    }
    
}
