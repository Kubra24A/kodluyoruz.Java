package Learn;

public class patika {

    /*Return ve Void Kullanımı
   Java'da iki tür metot mevcuttur bunlar : Return (geri dönüşü olan) , Void (geri dönüşü olmayan) metotlar. Return metotlar çağrıldığında geriye bir değer döndürürken, Void metotlar geriye bir değer döndürmemektedir.

           
          Return Metotlar

           Java'da oluşturduğumuz bir metodun bir değer üretmesini istendiğinde, "return" deyimi kullanılır. Metot içerisinde yazılan kod parçacıkları çalışacaktır, buna ek olarak metot içinde oluşturduğumuz bir veriyi dışarıya aktarma ihtiyacı duyabiliriz, bu durumlarda "return" deyimi kullanılır. Geri dönecek değerin veri tipi, metot tanımlarken verdiğimiz veri tipi ile aynı olmalıdır. Aksi halde derleyici tarafından hata alınır.
  
               static int toplam(int x, int y) {
               return x + y;
               }
               public static void main(String[] args) {
               int t = toplam(5,2);
                 System.out.println(t);
              }
              
              Çıktısı="7"
              
                Void Metotlar

              Java'da yazılan bir metodun geriye bir değer döndürmesini istemiyor, sadece metot içindeki kod bloğunun çalışmasını istersek "void" deyimi kullanmalıdır. Metot tanımlanırken veri tipi kısmına "void" deyimi yazılması yeterlidir. Void metotlar içerisinde "return" deyimi kullanılamamaktadır.

                    //EXAMPLE

                 static void toplam(int x, int y) {
                     System.out.println(x+y);
                    }
                 public static void main(String[] args) {
                        toplam(5,2);
                     }
                    
                     Çıktısı="7" */

                     //EXAMPLE2

                    /*static void show()
                                 {
                         System.out.println("Show metodu..");
                       return;
                          }                  
                  public static void main(String[] args)
                      {
                   show();
                     }  çıktısı = Show metodu..*/


                     //EXAMPLE3
                     
                     /*static int sum (int a, int b){
                        int reslt=a+b;
                        return a+b;
                     }
                     public static void main(String[]args){
                        int reslt=sum( 5, 2) * sum(3, 1);
                        System.out.println(reslt);
                     }
                     Çıktısı= 28*/

                     //EXAMPLE4

                    /*static void show(int a, char b) {
                        System.out.print("PATİKA PATİKA ");
                    }
                
                    static void show(char a, int b) {
                        System.out.print("DEV DEV ");
                    }
                
                    public static void main(String[] args) {
                        show(25, 'A');
                        show('B', 11);
                    }  Çıktısı=PATİKA PATİKA DEV DEV*/

                    //EXAMPLE5

                    /*  static int info() {
                      System.out.println("Patika");
                     return 0;
                     }

                       static void info() {
                       System.out.println("Dev");
                     }
                     public static void main(String[] args) {
                    info();
                    }  Çıktısı=Hata verir*/

                    /* METOTLARLA OVERLOADİNG(AŞIRI YÜKLENME)
                    
                    Java'da, iki veya daha fazla metot, parametreler açısından farklılık gösteriyorsa (farklı sayıda parametre, farklı türde parametre veya her ikisi) aynı isime sahip olabilir. Bu duruma metotlarda "Overloading" yani aşırı yüklenme işlemi denir.

                    Buradaki amaç aynı işlemi farklı parametrelerle yapacak olan metot ismini tek seferde kullanmaktır. Overloading işlemi "Nesne Yönelimli Programlamada" da çok kullanılmaktadır.
                    
                    void func() { ... }
                    void func(int a) { ... }
                    float func(double a) { ... }
                    float func(int a, float b) { ... }
                    
                    Burada func() metodu (overloading) aşırı yüklenmiştir. Bu metotlar aynı isime sahiptir ancak farklı parametreler kabul eder.*/

                    //PARAMETRELER

                    /*static void ekranaYaz(int a) {
                        System.out.println("Parametreler : " + a);
                    }
                
                    static void ekranaYaz(int a, int b) {
                        System.out.println("Parametreler : " + a + " ve " + b);
                    }
                
                    public static void main(String[] args) {
                        ekranaYaz(5);
                        ekranaYaz(10, 2);
                    }*/

                    //LOCAL

                    /* Lokal Değişken Kavramı

                    Java'da lokal değişkenler, kod blokları içerisinde tanımlanan değişkenlerdir ve sadece tanımlandıkları kod blokları içerisinde kullanılabilirler. Diğer metot ve sınıflar üzerinden erişimleri yoktur. Lokal değişkenler tanımladıkları ({...}) kod blokları arasında kullanılırlar.
                    
                        public class JavaPatika {
	                    
                            static void ekranaBas(){
                        // Hatalı kullanım 
                            System.out.println(a);
                     }    
    
                      public static void main(String[] args) {
                            int a = 10;
                            if (a < 10) {
                            int b = 20;
                            System.out.println(a);
                            }
                             // Hatalı kullanım 
                        System.out.println(b);
                          }
                     }
                     
                     Bu örnekte if blokları arasında tanımlanmış olan integer türünde ki "b" değişkeni, if bloğunun dışında ekrana bastırılmak istenildiğinde hata ile karşılaşılacaktır. Çünkü "b" değişkeni if blokları arasında tanımlanmıştır ve tanımlandığı kod blokları arasında kullanılabilir.

                     Dikkat edilmesi gereken diğer bir nokta, main metodun içerisinde tanımlanmış olan "a" değişkeni if bloğu içerisinde kullanılabilir, çünkü if bloğu main metodun bir parçasıdır. Ama "a" değişkeni ekranaBas(); metodu içerisinde kullanılamaz, bunun sebebi ise ekranaBas() ve main metodu farklı iki kod bloklarıdır.*/
                      

                     //EXAMPLE6

                     /*static void number(int x, int z) {
                        int y = 2;
                        x = x * y;
                        System.out.println(x);
                    }
                    public static void main(String[] args) {
                        int y = 3;
                        int z = 2;
                        if (y != z) {
                            int x = 20;
                        }
                        int x = 50;
                        number(x, z);
                    }*/


                    //EXAMPLE7

                   /*  public static void main(String args[]) {
                        String x = "Patika.dev";
                        kodluyoruz(x);
                        System.out.println(x);
                    }
                    static void kodluyoruz(String y)
                    {
                        String x = "Java101";
                        y = "Kodluyoruz";
                    }*/

                    
                    //RECURSİVE(ÖZYİNELİ) METOTLAR

                   /*  Java'da Recursive Metotlar, bir metodun kendisini çağırma tekniğidir. Bu teknik karmaşık problemleri ,çözmesi daha kolay problemlere ayırmayı sağlar. İki sayıyı birbirine eklemek kolaydır, ancak bir dizi sayıyı birbirine eklemek daha karmaşıktır. Recursive metotlar sürekli kendilerini çağırdıkları için dikkat edilmesi gereken durum en son aşama için koşul koyulmasıdır .Aşağıdaki örnekte recursive ile bir dizi sayıyı , iki sayı ekleme basit görevine bölerek toplamak için kullanılır:
                   
                  
                   public static void main(String[] args) {
                         int sonuc = toplam(10);
                    System.out.println(sonuc );
                     }
                         public static int toplam(int k) {
                         if (k > 0) {
                       return k + toplam(k - 1);
                         } else {
                          return 0;
                            }
                           }
                           Çıktısı=55
                      
                      
                           toplam() metodu çağrıldığında, k'dan küçük tüm sayıların toplamına k parametresini ekler ve sonucu döndürür. K değişkeni 0 olduğunda, metot sadece 0 döndürür. Metot çalışırken, program şu adımları izler:

                         f(1) = 1;

                         f(2) = f(1) + 2;

                         f(3) = f(2) + 3;

                         f(4) = f(3) + 4;

                          ..........

                         ..........

                          f(n) = f(n-1) + n;   
                          */

                          
                          //EXAMPLE8

                          /*static int basamaklarToplami(int sayi){
                            if (sayi == 0){
                                return 0;
                            }else
                               return sayi % 10 + basamaklarToplami(sayi / 10);
                        }
                        public static void main(String[] args){
                                System.out.println("Basamak toplami: "+basamaklarToplami(45612));
                        }   Çıktısı=18   */

                       
                       
                        //EXAMPLE9

                       /* static int as(int i) {
                            if (i < 2) return 1;
                            else return (i * as(i - 1));
                        }
                    
                        public static void main(String[] args) {
                            System.out.println(as(3));
                        }  Çıktısı=6  */

                       
                       
                        //EXAMPLE10

                       /* public static void main(String[] args) {
                            recursiveMethod(4);
                        }
                    
                        static void recursiveMethod(int num) {
                            num--;
                            if (num == 0)
                                return;
                            System.out.print(num + ",");
                            recursiveMethod(num);
                        } Çıktısı=3,2,1
                        */

                        static int f(int x){
                            int reslt=0;
                            for (int i=1; i<=x; i++){
                                reslt+=i;
                            }
                            return reslt;
                        }

                        public static void main(String[] args){
                            System.out.println(f(7));
                        }
                
}
