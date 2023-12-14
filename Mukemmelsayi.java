package mukemmelsayi;
import java.util.Scanner;
public class Mukemmelsayi {
public static void main(String[] args) {
       Scanner klavye=new Scanner(System.in);
       int n,top=0;
       System.out.println("Sayı giriniz:");
       n=klavye.nextInt();
       for(int i=1;i<n;i++){
          if(n%i==0){
            top+=i;
              System.out.println(i+"*"+(n/i)+"="+n);
          }
       }
       if(n==top){
           System.out.println("Girilen sayı Mükemmel sayıdır."+n);
       }else{
           System.out.println("Girilen sayı Mükemmel sayı değildir."+n);}
    }
    
} 