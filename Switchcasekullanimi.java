
package switchcasekullanimi;
import java.util.Scanner;
public class Switchcasekullanimi {
public static void main(String[] args) {
     int n1,n2,select;
       Scanner klavye = new Scanner(System.in);
       System.out.println("Birinci sayıyı giriniz=");
       n1 = klavye.nextInt();
       System.out.println("İkinci sayıyı giriniz=");
       n2 = klavye.nextInt();
       System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
       System.out.print("Seçiminiz:");
       select = klavye.nextInt();
    if(select==1){
        System.out.println("Toplam="+(n1+n2));
    }else if(select==2){
        System.out.println("Çıkarma="+(n1-n2));
    }else if (select==3){
        System.out.println("Çarpma="+(n1*n2));
    }else if(select==4){
        if (n2!=0){
         System.out.println("Bölme="+(n1/n2));
        
        }else{
            System.out.println("Bir sayı 0'a bölünemez.");
        }
    }else{
        System.out.println("Yanlış seçim yaptınız.Tekrar deneyiniz.");
       
        

}
       
       
    }
    
}
