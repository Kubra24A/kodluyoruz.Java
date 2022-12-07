public class Employee {

        String name ;
        double salary;
        int workHours;
        int hireYear ;
        int mooT;
        int dayHour;

        public Employee (String name, double salary,int mooT,int workHours,int hireYear){
            this.name= name;
            this.salary = salary;
            this.workHours = workHours;
            this.hireYear= hireYear;
            this.mooT = mooT;


        }

        public double tax(){
            if(this.salary < 1000) {
                return 0;
            } else{
                return this.salary*0.03;
            }

        }

        public double bon(){
            if (this.workHours > 40){
                return (workHours-40)*30.0;
            }else{
                return 0.0;
            }

        }

        public double raiseSalary(){
            int year = 2022;
            int wYear= year-hireYear;
            this.mooT =(dayHour*8)*30;
            if (wYear<10)
                return  this.salary*0.05;
             else if(wYear>9 && wYear<20)
                return this.salary *0.1;
            else
                return this.salary*0.15;
        }

        public void printInfo(){
            System.out.println("=================");
            System.out.println("Name :" +this.name);
            System.out.println("Salary :" +this.salary);
            System.out.println("Working hour :" +this.workHours);
            System.out.println("Beginning years :" +this.hireYear);
            System.out.println("Tax :" +tax());
            System.out.println("Bonus :" +bon());
            System.out.println("Salary increase :" +raiseSalary());
            System.out.println("Moon salary :" +this.mooT);
            System.out.println("Salary with tax and bonus :" +(this.salary-tax() +bon()));
            System.out.println("Total Salary :" +(this.salary-tax()+bon()+raiseSalary()));

        }


}
