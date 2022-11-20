import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM),
    yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
    İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
    Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
     Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
    Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
    Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
    Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
    İpucu
    Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
    Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
    İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
    Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
    Toplam Tutar = (135-27)* 2 = 216 TL
    Mesafeyi km türünden giriniz : 1500
    Yaşınızı giriniz : 20
    Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2
    Toplam Tutar = 216 TL
        */

      Scanner scan = new Scanner(System.in) ;
        System.out.println("Mesafeyi km türünden giriniz :");
        int km = scan.nextInt();
        double ucusIndirimi = km * 0.10 ;
        System.out.println("Yaşınızı giriniz :");
        int yas = scan.nextInt();
        double yasIndirimi = 0;
        System.out.println("Yolculuk yönünü giriniz :");
        System.out.println("1 => Tek Yön\\n2 => Gidiş-Dönüş");
        int tybe = scan.nextInt();

        if ((km>0 ) && (yas>0) && (tybe == 1 || tybe == 2)) {
          if (yas<12){
            yasIndirimi = ucusIndirimi *0.5;
          } else if (yas>=12 && yas<=24) {
            yasIndirimi = ucusIndirimi * 0.1;
          } else if (yas >= 65) {
            yasIndirimi = ucusIndirimi * 0.3;
          } else {
            yasIndirimi=0;
          }
        }

        double tutar = km * 0.10;
        double   IndirimliTutar = tutar - yasIndirimi;
        double tipIndirimi;
        double ucusTutar;

        if (tybe==2) {
          tipIndirimi = IndirimliTutar*0.20;
          ucusTutar = (IndirimliTutar-tipIndirimi) * 2 ;
        } else {
          ucusTutar=IndirimliTutar;
        }
      System.out.println("Toplam tutarınız :" +ucusTutar + "TL");


    }
}