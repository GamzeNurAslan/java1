
package fazlalikorani;
import java.util.Scanner;
public class Fazlalikorani {
public static void main(String[] args) {
    float sugar ;
    Scanner klavye = new Scanner(System.in);
    System.out.println("Enter the amount of sugar=");
    sugar = klavye.nextFloat();
    if (sugar >= 0.9){
        System.out.println("to much sugar");
    }else if(0.4<sugar && sugar<0.9){
        System.out.println("Moderately sweet");
    }
    else{
        System.out.println("low sugar ");
        
    
    
    
    }
       
    }
    
}
