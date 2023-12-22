import java.util.Scanner;
public class Gelismishesapmakine{
    static void mod(){
      Scanner klavye=new Scanner(System.in);
      int sayi,sonuc=0,i=1;
       while (true){
           System.out.println(i++ +". sayı:");
           sayi=klavye.nextInt();
           if(sayi==0){
             break;
           }
           sonuc %= sayi;
       }
        System.out.println("Sonuç="+sonuc);
    }
   static void alanvecevre(){
      Scanner klavye=new Scanner(System.in);
       System.out.print("Uzun kenarı giriniz:");
       int uzun=klavye.nextInt();
       System.out.print("Kısa kenarı giriniz:");
       int kisa=klavye.nextInt();
       int alan=1,cevre=1;
       
       
           alan=uzun*kisa;
            cevre=2*uzun+2*kisa;
       System.out.print("Sonuç="+alan);
       System.out.print("Çevre="+cevre);
   }
   public static void main(String[] args){
       Scanner klavye=new Scanner(System.in);
       int secme;
       
       
       String menu="\n1-Mod Alma\n"+"2-Dikdörtgenin alanı ve çevresi hesaplama\n"+"3-Çıkış yap";
       do{
           System.out.println(menu);
           System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
           secme=klavye.nextInt();
           switch(secme){
               case 1:
                   mod();
                     break;
               case 2:
                   alanvecevre();
                      break;
               case 0:
                   break;
               default:
                   System.out.println("Yanlış bir değer girdiniz,lütfen tekrar deneyiniz:");
           }
       }
           while(secme != 0);
       }
   }
