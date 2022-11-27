package Learn;

public class learn5 {

    public static void main (String[] args) {

 
        /* Switch-Case Yapısı
      Javada birden çok kod bloğunu koşullara bağlamak için "switch" deyimi kullanılır. Switch Case; tanımlanmış olan yalnızca bir değişkenin, alacağı değerlere bağlı olarak, farklı sonuçlar döndürmesini sağlayan bir yapıdır. Switch kısmında kullanılacak olan değişkenler byte, short, int, char veya String veri tipine sahip olmalıdır.
      */
 
       /*switch(değer) {
     case x:
        // değer x'e eşitse bu kod bloğu çalışacak
        break;
     case y:
        // değer y'ye eşitse bu kod bloğu çalışacak
        break;
     default:
        // değer hiç bir şeye eşit değilse bu kod bloğu çalışacak
      } */


      int day = 7 ;

      if (day == 1) {
       System.out.println("Today is Monday");
      } else if (day == 2){
        System.out.println("Today is Tuesday");
      } else if (day == 3){
        System.out.println("Today is Wednesday");
      } else if (day == 4){
        System.out.println("Today is Thursday");
      } else if (day == 5){
        System.out.println("Today is Friday");
      } else if (day == 6){
        System.out.println(" Today is Saturday");
      } else if (day == 7){
        System.out.println("Today is Sonday");
      } else {
        System.out.println("You are logged in incorrectly.");
      }

      /* İf-else-if komutu ne kadar pratik ve tercih edilen komut olsa da fazla yer kaplamasından dolayı Switch-case kullanımı daha
       * iyidir çünkü daha yer kaplar ve daha pratiktir.
       */

       switch (day) {
        case 1 :
        System.out.println("Today is Monday");
        break;
        case 2 :
        System.out.println("Today is Tuesday");
        break;
      default :
      System.out.println("You are logged in incorrectly.");

       }



    }
    
}
