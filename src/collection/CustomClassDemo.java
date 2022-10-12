package collection;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
    String username;
    String gender;
    String address;
    int age;
    float score;
    Student (){
        this.username="unknown";
        this.gender="unknown";
        this.address="unknown";
    };
     Student(String username, String gender, String address,int age, int score){
         this.username=username;
         this.gender=gender;
         this.address=address;
         this.age=age;
         this.score=score;
     }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
public class CustomClassDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Student> studentList= new ArrayList<>();
        Student student1 = new Student("Dara","M","KPS", 20,100);
        studentList.add(student1);
        studentList.add( new Student("name","M", "PP", 12,98));

        for(int i=0; i<3;i++){
            Student student3= new Student();
            System.out.println("Pls Enter your Name");
            student3.username=input.next();
            student3.score=12;
            student3.gender="M";
            studentList.add(student3);

        }
        System.out.println(studentList);
        for(int i=0; i<studentList.size();i++){
            System.out.println("Student :"+studentList.get(i));
        }


    }
}
