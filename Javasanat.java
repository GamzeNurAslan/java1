package javasanat;
import java.util.Scanner;
public class Javasanat {
public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int n,toplam=0;
        do{
            System.out.print("Sayı giriniz:");
            n = klavye.nextInt();
            if(n%2==0){
             toplam+=n;
             
            }
        }while(n%4==0);
    System.out.println("Toplam="+toplam);

    }
    
}
