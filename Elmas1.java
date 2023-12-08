package elmas1;
import java.util.Scanner;
public class Elmas1 {
    //yıldızla elmas çizen program
public static void main(String[] args) {
    int i=8;//ELMASIN ÜST KISMINDAN EN GENİŞ KISMINA KADARKİ SATIR SAYISI
    int n=10;//KAÇ YILDIZLA BAŞLADIĞIN
    while (i != 0 && n<=n+(i-1)*2){//en geniş satırdaki yıldız için genel formül bulduk(istersen n'i değiştir fark etmez.)
      for(int k=1;k<i;k++) {
          System.out.print(" ");//kaydirma yapiyor ornegin en usttekisatir için 2 bosluk kaydiracak sonra yildiz basacak
      }
      for(int j=1;j<=n;j++){
          System.out.print("*");
      }
      n=n+2;//yildizler her seferinde iki artiyor(en genis satira kadar)
      i--;
        System.out.println();
    }
    //en genis satira kadar tamamdir su an i=0 n=(en genis satirdaki yildiz sayisi+2) oldu.
    int a = (n-2)/2;//a'ya en genis satirin altindaki satir sayisi dedim.Bu da =(En genis satirdaki yildiz sayisi/2)
    //Ondalikli Sayisinin Bir Alt Tam Sayiya Cevirerek Olur.(n INTEGER oldugu için 2'ye bolundugunde ondalıklı kısmı almayacak zaten)
    n=n-4;//en ustteki fordaen genis satirdaki yildizdan 2 fazla olmustu,4 cikarip alt satira yazacagimiz yildiz yaptik.
    while(i<=a && n>=1){
       for(int k=0;k<=i;k++){
           System.out.print(" ");
       }
       for (int j=1;j<=n;j++){
           System.out.print("*");
       }
       n=n-2;//yildizlar her seferinde 2 azaliyor.
       i++;
        System.out.println();//alt satira geciyor.
    }
       
    }
    
}
