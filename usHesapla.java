/*import java.util.Scanner;
public class Usdegeri {
   public static void main(String[] args) {
        System.out.println(usluhesapla(5));
        //5!=120
    }
     public static int usluhesapla(int n){
      if(n<=1){
          return 1;
      }else{
         return n*usluhesapla(n-1);
      }}}
*/
//*****************************************************************************//
public class usHesapla{
    public static void main(String [] args){
        System.out.println(ushesaplama(4,2));
        // 2^3=8
    }
    public static int ushesaplama(int taban,int us){
      if(us == 0){
         return 1;
   }
      else if(us == 1){
         return taban;
      }else{
         return taban*ushesaplama(taban,us-1);
      }
    }
}
    

