public class Main {
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("Faith",2000,30,50,1990);
        emp1.tax();
        emp1.bon();
        emp1.raiseSalary();
        emp1.printInfo();
        Employee  emp2 = new Employee("Hugh",2500,35,   30,1982);
        emp2.tax();
        emp2.bon();
        emp2.raiseSalary();
        emp2.printInfo();




    }

}
