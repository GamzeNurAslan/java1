package bankamatikswitchcase;
import java.util.Scanner;
public class Bankamatikswitchcase {
public static void main(String[] args) {
       Scanner klavye=new Scanner(System.in);
       String ad,sifre;
       int deneme = 3;
       int cepte=2000;
       int top=0;
       System.out.print("Kullanıcı adınızı girin:");
       ad=klavye.nextLine();
       System.out.print("Şifrenizi girin:");
       sifre=klavye.nextLine();
       if(ad.equals("gamze") && sifre.equals("123")){
                System.out.println("Merhaba XX bankasına hoşgeldiniz:))");
              int secme = 4;
                  System.out.println("1-Para Yatırma\n"+"2-Para Çekme\n"+"3-Bakiye Sorgula\n"+"4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçin: ");
                secme = klavye.nextInt();
              switch (secme){
                  
                  case 1:
                      System.out.println("Para miktarı:");
                      int para=klavye.nextInt();
                      cepte+=para;
                      System.out.print("Fiş ister misiniz=");
                      System.out.println("1-Evet\n"+"2-Hayır");
                      int fis;
                      fis=klavye.nextInt();
                      switch (fis){
                          case 1:
                              System.out.println("Fişiniz veriliyor.");
                              break;
                          case 2:
                              System.out.println("Fiş yok.");
                             }
                      System.out.print("Toplam bakiyeniz="+cepte);
                      break;
                      
                  case 2:
                      System.out.println("Para miktarı:");
                      para=klavye.nextInt();
                      if(para>cepte){
                          System.out.println("Bakiyeniz yetersiz");
                      }else{
                        cepte-=para;
                      }
                       System.out.print("Fiş ister misiniz=");
                      System.out.println("1-Evet\n"+"2-Hayır");
                      fis=klavye.nextInt();
                      switch (fis){
                          case 1:
                              System.out.println("Fişiniz veriliyor.");
                              break;
                          case 2:
                              System.out.println("Fiş yok.");
                      }
                      System.out.print("Toplam bakiyeniz="+cepte);
                              break;
                              
                  case 3:
                      System.out.println("Bakiyeniz="+cepte);
                       System.out.print("Fiş ister misiniz=");
                      System.out.println("1-Evet\n"+"2-Hayır");
                      fis=klavye.nextInt();
                      switch (fis){
                          case 1:
                              System.out.println("Fişiniz veriliyor.");
                              break;
                          case 2:
                              System.out.println("Fiş yok.");
                      }
                            break;
                            
                  case 4:
                      System.out.println("Tekrar görüşmek üzere:))");
                      break;
                       default:
                           deneme--;
                            System.out.println("Hatalı kullanıcı adı veya şifre.Tekrar deneyiniz.");
                            break;
              }
       }
         if(deneme==0){
                   System.out.println("Hesabınız bloke olmuştur.Lütfen banka ile iletişime geçiniz.");
                }else{
                System.out.println("Kalan hakkınız="+deneme);
              }
             
               }
              
}

       
    


