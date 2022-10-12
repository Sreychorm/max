package inheritance;


class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
}
class Student extends Person{
    String classRoom;
    String grade;
    Student(String name, int age, String classRoom, String grade) {
        super(name, age);
        this.classRoom=classRoom;
        this.grade=grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classRoom='" + classRoom + '\'' +
                ", grade='" + grade + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Employee extends Person{
    int wage, hours;

    Employee(String name, int age, int wage, int hours) {
        super(name, age);
        this.wage=wage;
        this.hours=hours;
    }
    int salary(){
        return wage*hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "wage=" + wage +
                ", hours=" + hours +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", Salary=" + salary() +
                '}';
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Student student1= new Student("Mark", 25, "12A","A");
        System.out.println("____________ STUDENT INFO _________");
        System.out.println(student1);

        Employee employee= new Employee("Mark", 25, 12,10);
        System.out.println("____________ EMPLOYEE INFO _________");
        System.out.println(employee);

    }
}
