package calisma;
import java.util.Scanner;
public class Calisma {
public static void main(String[] args) {
         int k;
    Scanner input=new Scanner(System.in);
    System.out.println("Faktöriyel sayısını giriniz:");
    k=input.nextInt();
    int toplam=1;
    
    for(int i=1;i<=k;i++){
    toplam*=i;
    System.out.println("Faktöriyel="+toplam);
    }
    }
    
}
