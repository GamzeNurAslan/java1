package faktoriyel;
import java.util.Scanner;
public class Faktoriyel {
public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int armut,elma,domates,muz,patlican,toplam;
      //klavyeden kg değerlerini gir:
          System.out.print("Armut kilosunu yaz=");
          armut=input.nextInt();
          System.out.print("Elma kilosunu yaz=");
          elma=input.nextInt();
          System.out.print("Domates kilosunu yaz=");
          domates=input.nextInt();
          System.out.print("Muz kilosunu yaz=");
          muz=input.nextInt();
               System.out.print("Patlıcan kilosunu yaz=");
          patlican=input.nextInt();    
          //hesaplamalarr
         toplam = (int) (armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5.00);
          System.out.println("Toplam ödenecek tutar:"+toplam);
          
    }
    
}
