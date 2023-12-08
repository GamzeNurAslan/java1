package yildiz;
import java.util.Scanner;
public class Yildiz {
public static void main(String[] args) {
       Scanner klavye=new Scanner(System.in);
       System.out.println("Bir değer giriniz:");
       int n=klavye.nextInt();
       for(int i=0;i<=n;i++){
          for(int k=0;k<=(n-i);k++){
              System.out.print(" ");
          }
          for(int j=1;j<=(2*i-1);j++){
              System.out.print("*");
          }
           System.out.println(" ");
       }


       
}
    
}

       
            
                
          



       
            

