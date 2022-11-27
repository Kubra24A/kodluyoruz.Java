package Learn;

public class learn4 {

    public static void main (String[] args) {


        /*If ve Else Blokları

      Java'da mantıksal ve koşullu ifadeler için if blokları kullanılır. Java 'da if blokları Türkçede "eğer" cümlesinin verdiği anlamla aynı şeyi ifade etmektedir. Programlamada koşul oluşturmak için if ve else bloklarını kullanırız. Else deyimi "değil ise" anlamı katmaktadır ve if deyiminden sonra kullanılır. Programlama da if ve else deyimleri çok önemlidir */
      

        int a = 20, b = 10;
        if ((a < b) && (b++ < 25)){
            System.out.println(a);
        }else{
            System.out.print(a);
        }
        System.out.println(b);



        int var1 = 5;
        int var2 = 6;
       if ((var2 = 1) == var1){
       System.out.print(var2);
        } else{
       System.out.print(++var2);
        }
        

        /*else if

       if - else - if

      if-else-if kalıbında, bir if satırı, istediğiniz sayıda else-if satırı ve isteğe bağlı olarak tanımlanan bir else satırı bulunur. Yani, else satırının tanımlanması şart değildir. Program, en başta yer alan if satırı ile if-else-if kalıbını değerlendirmeye başlar. İlk doğru ifadenin bulunduğu if veya else-if satırı ile karşılaştığında ilgili işlem satırını çalıştırır. Kalıbın geri kalan tüm satırlarını değerlendirmeye almadan geçer. Eğer if ve else if satırlarında yer alan ifadelerden hiç biri doğru bir sonuç vermezse, else satırında yer alan işlem satırını çalıştırır. else satırı da mevcut değilse, program if-else-if kalıbının hiç bir satırını çalıştırmadan bir sonraki satırdan çalışmasına devam eder. if-else-if kalıbında sadece tek bir satır işlem görür. */


      
       float saltRatio = 0.9f;
     if(saltRatio >= 0.8) {
	  System.out.println("yüksek derecede tuzlu");
     }
     else if(0.5 < saltRatio && saltRatio < 0.8 ) {
	System.out.println("orta derecede tuzlu");
    }
    else {
	System.out.println("düşük derecede tuzlu");
    }   


    int age=25;    
    int weight=48;
    
    if(age>=18){  
    
        if(weight>=48){    
            System.out.println("Kan verebilirsiniz");    
        } 
        else{  
            System.out.println("Kan veremezsiniz");    
        }  
    
    } 
    else{  
      System.out.println("Kan verebilmek için yaşınız 18'den büyük olmalıdır.");  
    } 

    
    }
    
}
