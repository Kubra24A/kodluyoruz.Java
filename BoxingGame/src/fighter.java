public class fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public  fighter(String name,int damage,int health,int weight,double dodge){
        this.name= name;
        this.damage= damage;
        this.health= health;
        this.weight= weight;
        this.dodge= dodge;
    }

    public int hit(fighter foe){
        System.out.println("-----------------");
        System.out.println(this.name+" => "+ "  " +this.damage+"  "+"Hasar vurdu.");

        if(foe.dodge()) {
            System.out.println(foe.name+" "+"gelen hasarı blokladı.");
            return  foe.health;
        }
        if(foe.health-this.damage<0){
            return 0;
        }

        return  foe.health-this.damage;
    }
    public boolean dodge() {
        double randomValue = Math.random()*100;
        return  randomValue <= this.dodge;
    }

}


