package StudentSystemCourse;

public class Course {

    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    public int note;
    public double verbalNote;



    public  Course(String name, String code,String prefix){
        this.name= name;
        this.code= code;
        this.prefix= prefix;
        this.note = 0;
        this.verbalNote= 0;
    }

    public  void  addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.courseTeacher= t;
            System.out.println("Transaction successful.");
        }  else {
            System.out.println(t.name+"Your academician cannot teach this course.");
        }
    }

    public void printTeacher(){
        if (courseTeacher != null){
            System.out.println(this.name+"Academician of the course :" +courseTeacher.name);
        } else {
            System.out.println(this.name+ "No academician has been assigned to the course. We're sad.");
        }
    }



}
