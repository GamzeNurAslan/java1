package ebekhesapla;
import java.util.Scanner;
public class Ebekhesapla {
public static void main(String[] args) {
       Scanner klavye=new Scanner(System.in);
    System.out.println("Birinci sayıyı gir:");
    int n1=klavye.nextInt();
    System.out.println("İkinci sayıyı gir:");
    int n2=klavye.nextInt();
    
    int ebob=1;
    int ekok=1;
      for(int i=1;i<=n1;i++){
         if(n1 % i == 0 && n2 % i == 0){
             System.out.println(i);
              ebob = i;
         }
      }
      System.out.println("*********************************");
      for(int j=1;j<=(n1*n2);j++){
          if(j % n1 == 0 && j % n2 == 0){
              System.out.println(j);
              ekok = j;
          }
      
      }
    }
    
}
