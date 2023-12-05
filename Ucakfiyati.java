package ucakfiyati;
import java.util.Scanner;
public class Ucakfiyati {
public static void main(String[] args) {
         Scanner klavye=new Scanner(System.in);
        double mesafe,yas,tip,secme,fiyat,select = 0;
        System.out.println("Mesafeyi KM cinsinden veriniz:");
        mesafe = klavye.nextInt();
        if(mesafe>0){
            System.out.println("devam et");
        }else{
            System.out.println("hatalı bilgi girdiniz");
        }
        System.out.println("Yaş bilgisini giriniz:");
        yas = klavye.nextInt();
        if(mesafe>0){
            System.out.println("devam et");
        }else{
            System.out.println("hatalı bilgi girdiniz");
        }
        System.out.print("1-Tek yön\n2-Gidiş-Dönüş");
        System.out.println("Seçiniz:");
        secme = klavye.nextInt();
        
          fiyat = mesafe * 0.10;
          System.out.println(fiyat);
          if(select == 2){
              System.out.println("Toplam ücretiniz:"+(fiyat-fiyat%20));
          }
          if(yas<12){
              System.out.println("Toplam ücretiniz:"+(fiyat-fiyat%50));
          }else if(12<yas && yas<24){
              System.out.println("Toplam ücretiniz:"+(fiyat-fiyat%10));
              }else if(yas>65){
              System.out.println("Toplam ücretiniz:"+(fiyat-fiyat%30));
              }
          
    }
    
}
