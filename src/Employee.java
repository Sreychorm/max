import java.util.Scanner;

public class Employee {
    String fullName;
    float wage;
    float hours;



//    Employee(String newFullname, float newWage, float newHours ){
//        fullName=newFullname;
//        wage=newWage;
//        hours=newHours;
//    }

    @Override
    public String toString() {

        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", wage=" + wage +
                ", hours=" + hours +
                ", salary=" + salary() +
                '}';
    }
    public float salary(){
        float salary= wage*hours;
        if (salary>=500){
            return salary-(salary*15)/100;
        }else return salary;

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number of Employee");
        int number = input.nextInt();
        Employee[] employee =new Employee[number];
        for (int i=0; i<number; i++){
            employee[i]= new Employee();
            System.out.print("Name: ");
            employee[i].fullName= input.next();
            System.out.print("Wage: ");
            employee[i].wage= input.nextFloat();
            System.out.print("Hours: ");
            employee[i].hours= input.nextFloat();
        }
        for (int i=0; i<number; i++){
            System.out.println(employee[i]);
        }


//        Employee newEmployee = new Employee("Dara", 20, 45);
//        float total = newEmployee.totalWage();
//        System.out.println(newEmployee);
//        System.out.println("Total salary is "+total);

    }
}
