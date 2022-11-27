package Learn;

import java.util.Scanner;

public class Donguornek {
    public static void main(String[] args){

      int password ;
      boolean İsPasswordSuccess= false;

      Scanner inp = new Scanner(System.in);

      while(!İsPasswordSuccess){
        System.out.println("Şifrenizi giriniz :");
      password =inp.nextInt();
      if(password==123){
        System.out.println("Doğru");
        İsPasswordSuccess = true;
        System.out.println("Sisteme başarılı giriş yaptınız!");
      }else{
        System.out.println("Yanlış");
        System.out.println("Sisteme yanlış giriş yaptınız. Tekrar deneyin!");
      }
      }
      




    }
    
}
