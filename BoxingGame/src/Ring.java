public class Ring {
    fighter f1;
    fighter f2;
    int minWeight;
    int maxWeight;
    int round = 1;
    String first;

    Ring (fighter f1, fighter f2, int minWeight,int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

   public boolean run(){
        if(checkWeight()){
            while (f1.health > 0 && f2.health > 0){
                System.out.println("==========NEW ROUND==========");
                f2.health = f1.hit(f2);
                if(isWin()){
                    break;
                }
                f1.health = f2.hit(f1);
                if (isWin()){
                    break;
            }
                printScore();
                round++;
        }

    }else{
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }


       return false;
   }

   public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }


    private boolean isWin() {
        if(f1.health==0){
            System.out.println("Maçı kazanan :" +f2.name);
            return  true;
        } else if(f2.health==0) {
            System.out.println("Maçı kaybeden :" +f2.name);
            return  true;

        }
       return  false;
    }

    public void printScore() {
        System.out.println("---------------------");
        System.out.println(f1.name+" => "+"Kalan Can \t:"+f1.health);
        System.out.println(f2.name+" => "+"Kalan Can \t:"+f2.health);
    }

    public boolean isFirst(boolean A){
        double randomK = Math.random()*100;
        if(randomK<=50){
            return  false;
        }

        return A;
    }


}

