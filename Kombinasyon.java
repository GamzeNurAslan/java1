package kombinasyon;
import java.util.Scanner;
public class Kombinasyon {
public static void main(String[] args) {
    Scanner klavye=new Scanner(System.in);
    int n,r;
    System.out.println("N sayısını girin:");
    n=klavye.nextInt();
    System.out.println("R sayısını girin:");
    r=klavye.nextInt();
    if(n<r){
        System.out.println("N,R'den büyük olmalıdır.Tekrar deneyiniz lütfen.");
        n=klavye.nextInt();
    }
    int faktoriyel1=1;
    int faktoriyel2=1;
    int faktoriyel3=1;
      for(int i=1;i<=n;i++){
      faktoriyel1*=i;
      }
     System.out.println(n + "!= " + faktoriyel1);
      for(int j=1;j<=r;j++){
      faktoriyel2*=j;
      }
       System.out.println(r + "!= " + faktoriyel2);
       for(int k=1;k<=(n-r);k++){
       faktoriyel3*=k;
       }
       System.out.println((n-r) + "!= " + faktoriyel3);
       int carpim = faktoriyel2*faktoriyel3;
       int kombinasyon=faktoriyel1/carpim;
       System.out.println(n+" sayısının "+r+"'li"+"kombinasyonu="+kombinasyon);




}
}
