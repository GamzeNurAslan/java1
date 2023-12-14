package fibonaccidizisi;
import java.util.Scanner;
public class Fibonaccidizisi {
public static void main(String[] args) {
    int n,n1=0,n2=1,n3;
    Scanner klavye=new Scanner(System.in);
    System.out.print("Değer giriniz:");
    n=klavye.nextInt();
    System.out.print(n1+" "+n2);
    for(int i=2;i<n;i++){
      n3=n1+n2;
        System.out.print(" "+n3);
        n1=n2;
        n2=n3;
    }
    System.out.println();
    }
    
}
