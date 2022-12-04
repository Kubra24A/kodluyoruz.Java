import StudentSystemCourse.Course;
import StudentSystemCourse.Teacher;

public class Main {
    public static void main(String[] args) {
        System.out.println("~Student Management Systems~");
        Course Math = new Course("Math", "MAT101", "MAT");
        Course Physics = new Course("Physics", "PHY101", "PHY");
        Course Chemical = new Course("Chemical", "CHM101", "CHM");
        Course Bio = new Course("Bio","BİO101","BİO");
        Teacher teac1 = new Teacher("Mr. John Simons", "789", "MAT");
        Teacher teac2 = new Teacher("Mrs. Monica Dimanzi", "669", "PHY");
        Teacher teac3 = new Teacher("Mr. Michael Allison", "445", "CHM");
        Teacher teac4 = new Teacher("Mrs. Julianna Loren", "905","BİO");
        teac1.print();
        teac2.print();
        teac3.print();
        teac4.print();
        Math.addTeacher(teac1);
        Physics.addTeacher(teac2);
        Chemical.addTeacher(teac3);
        Bio.addTeacher(teac4);
        Student s1 = new Student("Samantha Max", 4, "893", Math, Physics, Chemical,Bio);
        s1.addBulkExamNote(22,20,40,55);
        s1.verbalNote(35, 40, 55,65);
        s1.isPass();
        Student s2 = new Student("Frank Johnson", 4, "345", Math, Physics, Chemical,Bio);
        s2.addBulkExamNote(57,30,95,70);
        s2.verbalNote(75, 50, 100,56);
        s2.isPass();
        Student s3 = new Student("Natalie Patrick", 4, "215", Math, Physics, Chemical,Bio);
        s3.addBulkExamNote(80,70,95,78);
        s3.verbalNote(90, 100, 100,98);
        s3.isPass();



    }
}