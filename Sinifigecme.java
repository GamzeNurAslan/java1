package sinifigecme;
import java.util.Scanner;
public class Sinifigecme {
public static void main(String[] args) {
    int mat,fizik,kimya,biyoloji,muzik,Turkce,ort;
    Scanner klavye=new Scanner(System.in);
     System.out.print("Matematik notunu girin:");
      mat = klavye.nextInt();
     if(0<=mat && mat<=100){
         System.out.println("devam et");
     }else{
         System.out.println("Bu not hesaplanamaz");
     }
       System.out.print("Fizik notunu girin:");
       fizik = klavye.nextInt();
       if(0<=fizik && fizik<=100){
         System.out.println("devam et");
     }else{
         System.out.println("Bu not hesaplanamaz");
     }
         System.out.print("Kimya notunu girin:");
         kimya = klavye.nextInt();
         if(0<=kimya && kimya<=100){
         System.out.println("devam et");
     }else{
         System.out.println("Bu not hesaplanamaz");
     }
           System.out.print("Biyoloji notunu girin:");
           biyoloji = klavye.nextInt();
           if(0<=biyoloji && biyoloji<=100){
         System.out.println("devam et");
     }else{
         System.out.println("Bu not hesaplanamaz");
     }
             System.out.print("Müzik notunu girin:");
             muzik = klavye.nextInt();
             if(0<=muzik && muzik<=100){
         System.out.println("devam et");
     }else{
         System.out.println("Bu not hesaplanamaz");
     }
               System.out.print("Turkce notunu girin:");
               Turkce = klavye.nextInt();
               if(0<=Turkce && Turkce<=100){
         System.out.println("devam et");
     }else{
         System.out.println("Bu not hesaplanamaz");
     }
                 ort = (mat+fizik+kimya+biyoloji+muzik+Turkce)/6;
                 System.out.println("Ortalamanız:"+ort);
    
                   if(ort>=50){
                       System.out.println("Sınıfı geçtiniz,tebrikler:))");
                   }else{
                       System.out.println("Sınıfı geçemediniz maalesef:((");
                   }
    
        
    }
    
}
