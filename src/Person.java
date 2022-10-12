public class Person {
    String name,position, gender, address;
    float salary;
    Person(){
        position ="teacher";

    }

    Person (String newName, String newPosition, float newSalary){
        name=newName;
        position=newPosition;
        salary=newSalary;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args){
        Person personOne = new Person();
        System.out.println(personOne);
    }
}
