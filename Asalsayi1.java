package asalsayi1;
public class Asalsayi1 {
    static boolean asal(int n){

     boolean m=true; // m=0 sas asal, 1 se değil
    for(int i=2;i<n;i++){
       if(n%i==0){
          m=false;
          break;
       }
    }
     return m;
       
}
public static void main(String[] args) {
    
            System.out.println(asal(5));

    }
    
}