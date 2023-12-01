package calisma;
import java.util.Scanner;
public class Calisma {
public static void main(String[] args) {
        double sıcaklık;
        Scanner input=new Scanner(System.in);
        System.out.print("Sıcaklık değerinizi girin:");
        sıcaklık=input.nextDouble();
        if(sıcaklık<5){
        System.out.println("Kayak yap");
        }else if(5<sıcaklık && sıcaklık<15){
        System.out.println("Sinema izle");
        }else if(15<sıcaklık && sıcaklık<25){
        System.out.println("Piknik yap");
        }else{
        System.out.println("Yüzmeye git");
        
        }
    }
    
}
