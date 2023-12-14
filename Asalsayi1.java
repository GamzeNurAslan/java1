package asalsayi1;
public class Asalsayi1 {
public static void main(String[] args) {
       int sayma=0;
       for(int n=2;n<=100;n++){
          int m=0;
          for(int i=2;i<n;i++){
             if(n%i==0){
                m=1;
                  break;
             }
          }
          if(m==0){
              System.out.print(n+"\n");
              sayma++;
          }
       }
    }
    
}
