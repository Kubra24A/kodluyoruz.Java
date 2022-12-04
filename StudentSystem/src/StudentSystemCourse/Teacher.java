package StudentSystemCourse;

public class Teacher {
    public String branch;
    public String name;
    String no;
    int Teacherİ;



    public Teacher(String name, String no, String branch) {
        this.name = name;
        this.no = no;
        this.branch = branch;
        this.Teacherİ = Teacherİ;

    }

    public  void print (){
        System.out.println(this.name+" -> " +this.no+" / "+this.branch);
    }
}
