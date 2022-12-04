import StudentSystemCourse.Course;

public class Student {
    String name;
    int stuNo;
    String classes;
    Course Math;
    Course Physics;
    Course Chemical;
    Course Bio;
    double average;
    boolean isPass;

    public  Student (String name, int stuNO, String classes, Course Math,Course Physics,Course Chemical,Course Bio ) {
        this.name= name;
        this.classes= classes;
        this.Math = Math;
        this.Physics= Physics;
        this.Chemical= Chemical;
        this.Bio= Bio;
        calcAverage();
        this.isPass= false;
    }

    public  void addBulkExamNote(int Math, int Physics, int Chemical, int Bio){

        if(Math >=0 && Math<=100){
            this.Math.note= Math;
        }

        if(Physics>=0 && Physics<=100){
            this.Physics.note= Physics;
        }

        if (Chemical>=0 && Chemical<=100){
            this.Chemical.note= Chemical;
        }

        if(Bio >=0 && Bio <=100){
            this.Bio.note= Bio;
        }
    }

    public  void isPass(){
        if(this.Math.note==0 || this.Physics.note==0 || this.Chemical.note==0 || this.Bio.note==0 ){
            System.out.println("Student grades not entered");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average :" +this.average);
            if(this.average >50){
                this.isPass = true;
                System.out.println("Passed the class!");
            } else {
                System.out.println("Failed in class!" );
                this.isPass = false;
            }
        }

    }
    private void calcAverage() {
        double MathA=(this.Math.note *0.8) + (this.Math.verbalNote * 0.2);
        double PhysicsB= (this.Physics.note*0.8) + (this.Physics.verbalNote* 0.2);
        double ChemicalC = (this.Chemical.note*0.7) + (this.Chemical.verbalNote * 0.3);
        double BioD = (this.Bio.note*0.6 ) + (this.Bio.verbalNote*0.2);
        this.average = ((MathA+PhysicsB+ChemicalC+BioD) / 4.0);
    }

    private boolean isCheckPass() {
        calcAverage();
        return this.average>50;
    }

    private void printNote() {
        System.out.println("************************************");
        System.out.println("Student\t:" +this.name);
        System.out.println("Math grade\t:" +this.Math.note);
        System.out.println("Math oral grade\t:" +this.Math.verbalNote);
        System.out.println("Physics grade\t:" +this.Physics.note);
        System.out.println("Physics oral grade\t:" +this.Physics.verbalNote);
        System.out.println("Chemical grade\t:" +this.Chemical.note);
        System.out.println("Chemical oral grade\t:" +this.Chemical.verbalNote);
        System.out.println("Bio grade\t:" +this.Bio.note);
        System.out.println("Bio oral grade\t:" +this.Bio.verbalNote);
    }

    public  void  verbalNote(int V_Math, int V_Physics, int V_Chemical, int V_Bio){
        if (V_Math >=0 && V_Math<= 100){
            this.Math.verbalNote = V_Math;
        }
        if (V_Physics >=0 && V_Physics<= 100) {
            this.Physics.verbalNote = V_Physics;
        }
        if (V_Chemical >=0 && V_Chemical<= 100) {
            this.Chemical.verbalNote = V_Chemical;
        }
        if (V_Bio >=0 && V_Bio<= 100) {
            this.Bio.verbalNote = V_Bio;
        }
    }




}
