package kanvermevermeme;
import java.util.Scanner;
public class Kanvermevermeme {
public static void main(String[] args) {
     int age,weight;
    Scanner klavye = new Scanner(System.in);
    System.out.print("enter age=");
    age = klavye.nextInt();
    System.out.print("enter weight=");
    weight = klavye.nextInt();
    if (age>=18){
        if (weight>=48){
        System.out.println("Kan verebilirsiniz");
        }
    }else{
        System.out.println("Kan veremezsiniz kan verebilmeniz için 18 yaşından büyük ve eşit yaşta olmalısınız.");
    
      
    }
    
}
}