package Learn;

public class DonguLearn {


    public static void main (String [] args){

      // FOR döngüsü ve str.charAt() ile tüm elemanlar gezilir.


        //For
        // Continue-Break

        /*Java'da "continue" deyimi , döngü içinde bir koşul oluştuğunda o döngüyü tamamlamadan bir sonraki kademeye geçmeye yarar. */

          for (int i=1; i<10 ; i++){   /*i+=3 -> 3 artır demek, i++ ise 1 artır */
            if(i==7){
               System.out.println("i değeri 7 dir.");
               break;
            }
            System.out.println(i);
         }
          /* int i = 0;                            
           while (i < 10) {
            i++;
           if (i == 5) {
            continue;
            }
           System.out.println(i);
            } */
          

          int i=1;

          //While
          while (i<10) {
            System.out.println(i); /*i++ yazmayınca devamlı döngüye girecektir Fakat yazarsak 10 kadar tek tek artar. */
            i++;
          }

          //İnfinite Loop
          System.out.println("While Döngüsü bitti.");
        
          //Do While
          int k = 2 ;
          do{
            System.out.println(k + ","); 
            k+=3;
          } while(k<15);

          System.out.println("Do While Döngüsü bitti.");
          
          //Örnek1

          int left = 100, right = 200;
            while (++left < --right);
          System.out.println("100 ile 200'ün ortası: " + left);

          //Örnek2

          int m=1, l=1;
          while(m<3)
          {
          do
             {
              System.out.print(l + ",");
              l++;
              }while(l<4);
              i++;
             }
           

             
             
             
             
    }    


 
         
}        