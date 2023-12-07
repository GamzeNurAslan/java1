package katbulma;
import java.util.Scanner;
public class Katbulma {
public static void main(String[] args) {
    Scanner klavye=new Scanner(System.in);
    int n;
    System.out.print("Bir sayı giriniz:");
       n= klavye.nextInt();
       for(int i=0;i<=n;i+=20){
           System.out.println(i);
       }
    }
    
}
