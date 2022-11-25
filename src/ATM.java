package src.src;

import java.util.Scanner;

public class ATM {
   
    public static void main (String[] args) {

        String name , password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0){
            System.out.print("Kullanıcı Adınız :");
            name = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if(name.equals("AKGUL") && password.equals("KrA673")) {
                System.out.println("Merhaba, AKGULBANK'a Hoşgeldiniz!");

                do{
                    System.out.println("1-Para yatırma\n" +
                    "2-Para Çekme\n" +
                    "3-Bakiye Sorgula\n" +
                    "4-Çıkış Yap");
                 System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                   select = input.nextInt();

            switch (select) {

                case 1:
                    System.out.print("Para miktarı : ");
                    int price = input.nextInt();
                    balance += price;
                    System.out.println("Hesabiniza "+price+ "TL yatırılmıştır. Bakiyeniz : "+balance);
                    break;

                case 2:
                    System.out.print("Para miktarı : ");
                    int price2 = input.nextInt();
                    if (price2 > balance) {
                        System.out.println("Bakiye yetersiz.");
                    } else {
                        balance -= price2;
                        System.out.println("Kalan bakiyeniz "+balance);
                    }
                    break;

                case 3:
                    System.out.println("Bakiyeniz : " + balance);
                    break;}

                }while (select != 4);
                    System.out.println("Tekrar görüşmek üzere.");
                    break;

                }
            else {
                right--;
                System.out.println("Hatali kullanici adi veya şifre girdiniz. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. lutfen banka ile iletisime geciniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);

                }
                    

             
        
                
            }   
                
                   
            
                
            
        }
    }
    
}
