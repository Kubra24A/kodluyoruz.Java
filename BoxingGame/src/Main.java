public class Main {
    public static void main(String[] args) {
      fighter Mike = new fighter("Tyson",10,100,65,50);
      fighter Muhammed = new fighter("Ali",20,100,90,45);
      Ring legend = new Ring(Mike,Muhammed,65,90);
        legend.run();
    }
}