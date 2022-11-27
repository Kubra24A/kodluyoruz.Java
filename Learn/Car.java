package Learn;



public class Car {


    String type;
    String model;
    String color;
    String miktarı;
    int speed;
    int speedLimit=180;

    public static void main(String[] args) {

        System.out.println("ARABALAR DÜNYASI  " +"♚");
        System.out.println("  ");
        Car audi = new Car();
        audi.model="Audi A3";
        audi.color= "Black";
        audi.type= "Sports";
        audi.speed=10;
        audi.miktarı="2.000.000 milyon TL";
        System.out.println("Marka:"+ " " +audi.model);
        System.out.println("Hız:"+ " "  +audi.speed);
        System.out.println("Renk:"+ " " +audi.color);
        System.out.println("Tarz:"+ " " +audi.type);
        System.out.println("Fiyat:"+ " " +audi.miktarı);
        System.out.println("==================");

        Car mercedes = new Car();
        mercedes.model="Mercedes";
        mercedes.color="Kırmızı";
        mercedes.type="A180 Sedan";
        mercedes.speed=20;
        mercedes.miktarı="3.500.000 milyon TL";
        System.out.println("Marka:"+ " " +mercedes.model);
        System.out.println("Hız:"+ " "  +mercedes.speed);
        System.out.println("Renk:"+ " " +mercedes.color);
        System.out.println("Tarz:"+ " " +mercedes.type);
        System.out.println("Fiyat:"+ " " +mercedes.miktarı);
        System.out.println("==================");


        Car bmw = new Car();
        bmw.model="BMW";
        bmw.color="Mavi";
        bmw.speed=15;
        bmw.type="Sports";
        bmw.miktarı="4.000.000 milyon TL";
        System.out.println("Marka:"+ " " +bmw.model);
        System.out.println("Hız:"+ " "  +bmw.speed);
        System.out.println("Renk:"+ " " +bmw.color);
        System.out.println("Tarz:"+ " " +bmw.type);
        System.out.println("Fiyat:"+ " " +bmw.miktarı);
        System.out.println("==================");

       
    }
    
}
