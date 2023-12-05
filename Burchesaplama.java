package burchesaplama;
import java.util.Scanner;
public class Burchesaplama {
public static void main(String[] args) {
        int select,day;
        Scanner klavye=new Scanner(System.in);
          System.out.println("1-Ocak\n2-Şubat\n3-Mart\n4-Nisan\n5-Mayıs\n6-Haziran\n7-Temmuz\n8-Ağustos\n9-Eylül\n10-Ekim\n11-Kasım\n12-Aralık");
          select = klavye.nextInt();
           System.out.println("Doğduğun gün:");
        day = klavye.nextInt();
          if(select == 1){
            if(day>=1 && day<=31){
              if(day<22){
                  System.out.println("Oğlak Burcu");
              }else{
                  System.out.println("Kova Burcu");
              }
            }else {
                System.out.println("Geçersiz bir gün girdiniz.");
            }
          }else if(select == 2){
               if(day>=1 && day<=28){
              if(day<22){
                  System.out.println("Kova Burcu");
              }else{
                  System.out.println("Balık Burcu");
              }
            }else {
                System.out.println("Geçersiz bir gün girdiniz.");
            }
          
          }else if(select == 3){
           if(day>=1 && day<=31){
              if(day<20){
                  System.out.println("Balık Burcu");
              }else{
                  System.out.println("Koç Burcu");
              }
            }else {
                System.out.println("Geçersiz bir gün girdiniz.");
            }
          }else if(select == 4){
           if(day>=1 && day<=31){
              if(day<21){
                  System.out.println("Koç Burcu");
              }else{
                  System.out.println("Boğa Burcu");
              }
            }else {
                System.out.println("Geçersiz bir gün girdiniz.");
            }
          }else if(select == 5){
           if(day>=1 && day<=31){
              if(day<21){
                  System.out.println("Boğa Burcu");
              }else{
                  System.out.println("İkizler Burcu");
              }
            }else {
                System.out.println("Geçersiz bir gün girdiniz.");
            }
          }else if (select == 6){
           if(day>=1 && day<=31){
              if(day<22){
                  System.out.println("İkizler Burcu");
              }else{
                  System.out.println("Yengeç Burcu");
              }
            }else {
                System.out.println("Geçersiz bir gün girdiniz.");
            }
          }else if(select == 7){
           if(day>=1 && day<=31){
              if(day<23){
                  System.out.println("Yengeç Burcu");
              }else{
                  System.out.println("Aslan Burcu");
              }
            }else {
                System.out.println("Geçersiz bir gün girdiniz.");
            }
          }else if(select == 8){
           if(day>=1 && day<=31){
              if(day<23){
                  System.out.println("Aslan Burcu");
              }else{
                  System.out.println("Başak Burcu");
              }
            }else {
                System.out.println("Geçersiz bir gün girdiniz.");
            }
          }else if(select == 9){
           if(day>=1 && day<=31){
              if(day<23){
                  System.out.println("Başak Burcu");
              }else{
                  System.out.println("Terazi Burcu");
              }
            }else {
                System.out.println("Geçersiz bir gün girdiniz.");
            }
          }else if(select == 10){
           if(day>=1 && day<=31){
              if(day<23){
                  System.out.println("Terazi Burcu");
              }else{
                  System.out.println("Akrep Burcu");
              }
            }else {
                System.out.println("Geçersiz bir gün girdiniz.");
            }
          }else if(select == 11){
           if(day>=1 && day<=31){
              if(day<22){
                  System.out.println("Akrep Burcu");
              }else{
                  System.out.println("Yay Burcu");
              }
            }else {
                System.out.println("Geçersiz bir gün girdiniz.");
            }
          }
              
          
          
    }
    
}
