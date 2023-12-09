package bankamatikifelse;
import java.util.Scanner;
public class Bankamatikifelse {
public static void main(String[] args) {
    Scanner klavye=new Scanner(System.in);
    String userName,password;
    int deneme=3;
    int cepte=1500;
    int secme;
    while(deneme>0){
        System.out.print("Kullanıcı adınız:");
        userName=klavye.nextLine();
        System.out.print("Şifreniz:");
        password=klavye.nextLine();
        if(userName.equals("gamze") && password.equals("patika123")){
            System.out.println("Merhaba xx bankasına hoşgeldiniz:))");
            do{
                System.out.println("1-Para yatırma\n"+"2-Para çekme\n"+"3-Bakiye Sorgula\n"+"4-Çıkış Yap");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
                secme=klavye.nextInt();
                if(secme == 1){
                    System.out.println("Para miktarı=");
                    int para=klavye.nextInt();
                    cepte+=para;
                }else if(secme == 2){
                    System.out.println("Para miktarı=");
                    int para = klavye.nextInt();
                    if(para>cepte){
                        System.out.println("Bakiye yetersiz");
                    }else{
                       cepte -= para;
                    }
                }else if(secme == 3){
                    System.out.println("Bakiyeniz="+cepte);
                }
            }while(secme != 4);
            System.out.println("Tekrar görüşmek üzere:))");
            break;
        }else{
          deneme--;
            System.out.println("Hatalı kullanıcı veye şifre.Tekrar deneyiniz.");
            if(deneme==0){
                System.out.println("Hesabınız bloke olmuştur.Lütfen banka ile iletişime geçiniz.");
            }else{
                System.out.println("Kalan hakkınız:"+ deneme);
            }
        }
        }
    }
        
    }
    

