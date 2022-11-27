package Learn ;

public class learn2 {
    public static void main(String[] args) {


      /*Karşılaştırma Operatörleri
     Java'da Karşılaştırma Operatörleri (Java Comparison Operators) sayesinde, farklı iki değişkenin birbirleriyle olan durumları hakkında bir yorum yapabilirsiniz.

     Kısacası Java'da Karşılaştırma Operatörleri , bir değişkenin başka bir değişkenden büyük, küçük, eşit değil veya eşit olup olmadığını belirler. Bu operatörlerin çoğunu günlük hayatımızda ve matematikte kullanıyoruz. İki değişkenin eşit olup olmadığını test ederken "=" değil de "==" kullanmanız gerektiğini (yani çift eşittir) unutmayın.

     JAVA KARŞILAŞTIRMA OPERATÖRLERİ

      == Eşittir ( x == y )

     != Eşit Değildir ( x != y )

     > Büyüktür ( x > y )

     < Küçüktür ( x < y )

     >= Büyük Eşittir ( x >= y )

     <= Küçük Eşittir ( x <= y ) */

        int A = 10 ;
        int B = 20 ;
        int C = 32 ;
        int D = 10 ;

        // == Operatörü
        System.out.println(A==B);
        System.out.println(A==C);
        System.out.println(C==D);

        //!=  Eşit Değil Operatörü
        System.out.println(B!=D);
        System.out.println(A!=B);
        System.out.println(C!=B);

        //> Büyüktür Operatörü
        System.out.println(B>D);
        System.out.println(C>B);
        System.out.println(C>A);

        // >= Büyük-Eşittir Operatörü
        System.out.println(A>=D);
        System.out.println(D>=C);
        System.out.println(C>=B);

        //< Küçüktür Operatörü
        System.out.println(A<B);
        System.out.println(B<C);
        System.out.println(A<C);

        // <= Küçük-Eşittir Operatörü
        System.out.println(A<=C);
        System.out.println(B<=C);
        System.out.println(A<=D);
    }
}