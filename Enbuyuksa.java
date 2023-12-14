package enbuyuksa;
import java.util.Scanner;
public class Enbuyuksa {
public static void main(String[] args) {
     Scanner klavye=new Scanner(System.in);
     int n,max=0,min=0;
     System.out.println("Girilecek sayı adedi=");
     n=klavye.nextInt();
     for(int i=1;i<=n;i++){
         System.out.println("Sayı giriniz:"+i);
         int k=klavye.nextInt();
         if(k==1){
           max=i;
           min=i;
         }
         if(k>max){
           max=k;
         }
         if(k<min){
         min=k;
         }
     }
     System.out.println("Girilen sayılar arasında en büyük olan sayı="+max);
     System.out.println("Girilen sayılar arasında en küçük olan sayı="+min);
}
}
       