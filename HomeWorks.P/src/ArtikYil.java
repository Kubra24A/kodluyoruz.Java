import java.util.Scanner;

public class ArtikYil {

    public static void main (String[] args) {

        /*Artık Yıl Nasıl Hesaplanır?

      Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:

      1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
      100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:

      Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
        */


        int yas = 0;

        Scanner inp = new Scanner (System.in) ;
        System.out.println("Yıl giriniz : ");
        yas = inp.nextInt();

        if(yas%100==0){
            if (yas%400==0){
                System.out.println("ARTIK YILDIR");
            } else {
                System.out.println("ARTIK YIL DEĞİLDİR");
            }
        } else if (yas % 4 == 0) {
            System.out.println("ARTIK YILDIR");
        } else {
            System.out.println("ARTIK YIL DEĞİLDİR");
        }

    }

}
