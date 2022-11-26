package src.src;

public class Palindrom {

     static boolean palindrow(int n){
        int reslt=n , resNumber=0, LastNumber;
        while(reslt !=0){
            System.out.println("===========");
            System.out.println("Sayınız :" +reslt);
           
            LastNumber=reslt%10;
           System.out.println("Son basamak :" +LastNumber);
          
           resNumber=(resNumber*10)+LastNumber;
           System.out.println("Yeni sayınız :" +resNumber);
          
           reslt /=10;
        }
        
        return true;
     } 

    public static void main (String[]args){


           /* Palindrom Sayı Nedir ?
           Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

           Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....*/


           palindrow(569);
        
    }
    
}
