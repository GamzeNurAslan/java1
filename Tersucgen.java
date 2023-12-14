package tersucgen;
import java.util.Scanner;
public class Tersucgen {
public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz=");
        int n=klavye.nextInt();
        for(int i=n;i>=1;i--){
          for(int j=1;j<=(n-1);j++){
              System.out.print("");
          }
          for(int k=1;k<=(2*i+1);k++){
              System.out.print("*");
          }
            System.out.println();
        }
    }
    
}
