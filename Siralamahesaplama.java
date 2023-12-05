package siralamahesaplama;
import java.util.Scanner;
public class Siralamahesaplama {
public static void main(String[] args) {
    Scanner klavye=new Scanner(System.in);
      System.out.println("Arka arkaya 10 tane sayı yazın:");
      System.out.println("Yazdığınız bu 10 sayı arasından en büyük ve en küçük sayıyı bulun.");
      int max=0;
      int min=0;
      for(int i=1;i<=10;i++){
          System.out.println("sayıyı girin:"+i);
          int n = klavye.nextInt();
          if(i==1){
          max = n;
          min = n;
          }if(n>max){
          max=n;
          }if(n<min){
          min=n;
          
          }
      }
      System.out.println("Girdiğiniz 10 sayıdan en büyük olanı="+max);
      System.out.println("Girdiğiniz 10 sayıdan en küçük olanı="+min);
    }
    
}
