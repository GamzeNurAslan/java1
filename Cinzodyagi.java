package cinzodyagi;
import java.util.Scanner;
public class Cinzodyagi {
public static void main(String[] args) {
       Scanner klavye=new Scanner(System.in);
       int dogumtarihi;
       System.out.println("Doğum tarihinizi girin:");
       dogumtarihi=klavye.nextInt();
       if(dogumtarihi%12 == 0){
           System.out.println("Çin zodyağı burcunuz=Maymun");
       }else if(dogumtarihi%12 == 1){
           System.out.println("Çin zodyağı burcunuz=Horoz");
       }else if(dogumtarihi%12 == 2){
           System.out.println("Çin zodyağı burcunuz=Köpek");
       }else if(dogumtarihi%12 == 3){
           System.out.println("Çin zodyağı burcunuz=Domuz");
       }else if(dogumtarihi%12 == 4){
           System.out.println("Çin zodyağı burcunuz=Fare");
       }else if(dogumtarihi%12 == 5){
           System.out.println("Çin zodyağı burcunuz=Öküz");
       }else if(dogumtarihi%12 == 6){
           System.out.println("Çin zodyağı burcunuz=Kaplan");
       }else if(dogumtarihi%12 == 7){
           System.out.println("Çin zodyağı burcunuz=Tavşan");
       }else if(dogumtarihi%12 == 8){
           System.out.println("Çin zodyağı burcunuz=Ejderha");
       }else if(dogumtarihi%12 == 9){
           System.out.println("Çin zodyağı burcunuz=Yılan");
       
       }else if(dogumtarihi%12 == 10){
           System.out.println("Çin zodyağı burcunuz=At");
       }else if(dogumtarihi%12 == 11){
           System.out.println("Çin zodyağı burcunuz=Koyun");
       }
}
}