package sinifigecme;
import java.util.Scanner;
public class Sinifigecme {
public static void main(String[] args) {
    int mat,fizik,kimya,biyoloji,muzik,Turkce,ort;
    Scanner klavye=new Scanner(System.in);
     System.out.print("Matematik notunu girin:");
     mat = klavye.nextInt();
       System.out.print("Fizik notunu girin:");
       fizik = klavye.nextInt();
         System.out.print("Kimya notunu girin:");
         kimya = klavye.nextInt();
           System.out.print("Biyoloji notunu girin:");
           biyoloji = klavye.nextInt();
             System.out.print("Müzik notunu girin:");
             muzik = klavye.nextInt();
               System.out.print("Turkce notunu girin:");
               Turkce = klavye.nextInt();
                 ort = (mat+fizik+kimya+biyoloji+muzik+Turkce)/6;
                 System.out.println("Ortalamanız:"+ort);
    
                   if(ort>=50){
                       System.out.println("Sınıfı geçtiniz,tebrikler:))");
                   }else{
                       System.out.println("Sınıfı geçemediniz maalesef:((");
                   }
    
        
    }
    
}
