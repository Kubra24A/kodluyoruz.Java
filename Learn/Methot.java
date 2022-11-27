package Learn;

public class Methot {

          /* Metotlar (Fonksiyonlar)
         Java'da Metotlar sadece çağrıldığında kullanılan kod bloklarıdır. Metotlara bir diğer adlandırma olarak Fonksiyonlar'da denilmektedir. Bunun sebebi bu kod yapısının matematikte ki fonksiyon mantığına çok benzemesidir. Java'da metotlarımızın içerisine veri aktarmak için ise parametre girebilmekteyiz.

            Neden Metot Kullanırız ?
         Programlamada metot kullanmamızın sebebi, bir çok yerde kullanacağımız kodu tek seferde yazıp lazım olduğunda çağırmaktır. Örnek vermek gerekirse, programımız içerisinde bir çok yerde matematikteki "üs alma" işlemini gerçekleştirmiş olalım. Her defasında üs alma işlemi için aynı kodları yazmak yerine bu kodları metot olarak yazıp lazım olduğunda çağırmak işlerimizi kolaylaştıracaktır. Ayrıca metotlar "Nesne Yönelimli Programlamanın" yapı taşlarındandır. Programlamada karmaşık bir problemi daha küçük parçalara bölmek, programınızın anlaşılmasını kolaylaştırır ve yeniden kullanılabilir hale getirir.

           Metot Tanımlama
           Java'da metotların sözdizimi şu şekildedir :

                    veriTipi metotAdi(parametre1, parametre2, ....) {
                      // kod bloğu
                    }
           Metot Çağırma
         Java'da önceden yazdığımız metotları erişimi olduğu yerlerde çağırabiliriz. Java'da bir metodu çağırmak için metodun adını ve ardından iki parantez () ve bir noktalı virgül yazılmalıdır. Aşağıda ki örnekte toplama(); adlı metodun nasıl çağrıldığı hakkında bir örnektir. 
         
                     public class JavaPatika {static int toplama(int a, int b) {
                     return a + b;
                      }
                     public static void main(String[] args) {
                      int sonuc = toplama(5, 2);
                            System.out.println(sonuc);
                        }
                    }

                           // Çıktısı "7"*/

    static void helloJava(){
        System.out.println("Hello JAVA");
    }

    
    static int power(int base,int exp){
        int result=1;
        for(int i=1; i<=exp; i++){
            result *= base;

        }
        return result;
    }
    public static void main(String[] args){

        //static int power(int base,int exp){ return 1;} ->  SADECE class yazılır MAİN e yazılmaz.
        
    

       //f(x)=2x+5
       //f(6)=2*6+5=17
       //f(x,y,z)=3x+2y+5z
       //f(4,1,7)=3*4+2*1+5*7=49

       /*int base =2, exp=3,reslt=1;
       for(int i=1; i<=exp; i++){
        reslt*=base;
       }
          System.out.println(reslt);

          base=3;
          exp=5;
          reslt=1;
          for(int i=1; i<=exp; i++){
            reslt*=base;

          }
          System.out.println(reslt);
       
        /*int x = 25;
        System.out.println(run(5));
    }

    static int run(int x) {
        x = 10;
        return x;    -> cevabı = 10*/ 

      //1.yol
      /*int case1=power(base:2,exp:3);
       * System.out.println(case1);
       */

       //2.yol
       /*int n1=2,n2=2;
        * int case1=power(n1,n2);
       * System.out.println(case1);
        */

        System.out.println(power(2, 3));
        System.out.println(power(4, 2));
        helloJava();

        

    }
}