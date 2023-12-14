package javaapplication223;
import java.util.Scanner;
public class JavaApplication223 {
public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        int ebob = 1;
        int ekok = 1;

        System.out.print("Birinci sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        if (n1 < n2) {
            int i = 1;
            while (i <= n1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }

            i = n1;
            while (i <= n1 * n2) {
                if (i % n1 == 0 && i % n2 == 0) {
                    ekok = i;
                    break;
                }
                i += n1;
            }
        } else if (n2 < n1) {
            int i = 1;
            while (i <= n2) {
                if (n2 % i == 0 && n1 % i == 0) {
                    ebob = i;
                }
                i++;
            }

            i = n2;
            while (i <= n1 * n2) {
                if (i % n2 == 0 && i % n1 == 0) {
                    ekok = i;
                    break;
                }
                i += n2;
            }
        } else {
            System.out.println("Bu iki sayı birbirine eşittir.");
            return;
        }

        System.out.println("En büyük ortak bölen: " + ebob);
        System.out.println("En küçük ortak kat: " + ekok);
    }
}
    
    

