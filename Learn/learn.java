package Learn;

import java.util.Scanner;

public class learn {
    public static void main(String[] args) {

         /*
        Not Ortalaması Hesaplayan Program
        Java ile Matematik, Fizik, Kimya, Çoğrafya, İngilizce, Tarih, Edebiyat, Resim ve Müzik derslerinin sınav puanlarını
        kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
        Ödev
        Aynı program içerisinde koşullu ifadeler kullanılarak,
        eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" ,
        küçük ise "Sınıfta Kaldı" yazsın.
        Not : If ve Else kullanılmayacak...
        */

        //Değişkenler oluştur
        int mat, fizik, kimya, cografya, ingilizce, tarih, edebiyat, resim, muzik;

        //Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik notunuz :");
        mat = inp.nextInt();
        System.out.println(mat);

        System.out.print("Fizik notunuz :");
        fizik = inp.nextInt();
        System.out.println(fizik);

        System.out.print("kimya notunuz :");
        kimya = inp.nextInt();
        System.out.println(kimya);

        System.out.print("Cografya notunuz :");
        cografya = inp.nextInt();
        System.out.println(cografya);

        System.out.print("İngilizce notunuz :");
        ingilizce= inp.nextInt();
        System.out.println(ingilizce);

        System.out.print("Tarih notunuz :");
        tarih = inp.nextInt();
        System.out.println(tarih);

        System.out.print("Edebiyat notunuz :");
        edebiyat = inp.nextInt();
        System.out.println(edebiyat);

        System.out.print("Resim notunuz :");
        resim = inp.nextInt();
        System.out.println(resim);

        System.out.print("Muzik notunuz :");
        muzik = inp.nextInt();
        System.out.println(muzik);

        int toplam =(mat + fizik + kimya + cografya + ingilizce + tarih + edebiyat + resim + muzik) ;

        double ort = toplam/9.0;
        System.out.println("Not ortalamanız : " + ort);
        boolean kaldi = true;
        kaldi = ort <60;
        String sonuc = kaldi? "Sınıfta Kaldı" : "Sınıfı Geçti";
        System.out.println(sonuc);
        
        }
    
}
