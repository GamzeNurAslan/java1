package switchcasehesapmakinasi;
import java.util.Scanner;
public class SwitchcaseHesapmakinasi {
public static void main(String[] args) {
    int n1,n2,select;
    Scanner klavye=new Scanner(System.in);
    System.out.print("İlk sayıyı giriniz:");
    n1 = klavye.nextInt();
    System.out.print("İkinci sayıyı giriniz:");
    n2 = klavye.nextInt();
    System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
    System.out.print("Seçiminiz:");
    select = klavye.nextInt();
    switch(select){
        case 1:
            System.out.println("Toplama");
            System.out.println("Toplam:"+(n1+n2));
            break;
        case 2:
            System.out.println("Çıkarma");
            System.out.println("Çıkarma:"+(n1-n2));
            break;
        case 3:
            System.out.println("Çarpma");
            System.out.println("Çarpma:"+(n1*n2));
            break;
        case 4:
            System.out.println("Bölme");
             if (n2!=0){
              System.out.print("Bölme:"+(n1/n2));
                    }else{
                 System.out.println("Bir sayı 0'a bölünemez.");
             }
            break;
        default :
            System.out.println("Yanlış seçim yaptınız.Tekrar deneyiniz.");
            break;
           
            
           
           
            
    
    
    }
    
       
    }
    
}
