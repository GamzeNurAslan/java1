package fibonaccidizisi;
/*Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
 Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar,
 yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.
Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır.*/

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
