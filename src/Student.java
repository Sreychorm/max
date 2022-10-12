public class Student {
    String username;
    String gender;
    int age;

    public Student(String username, String gender, int age) {
        this.username = username;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    void showInfor(Student obj){
        System.out.println("---------------------------------");
        System.out.println("username: "+username);
        System.out.println("gender: "+gender);
        System.out.println("age: "+age);
        System.out.println("---------------------------------");
    }
    void get(){
        showInfor(this);
    }


    public static void main(String[] args) {
        Student student1= new Student("Dara","Male",23);
        Student student2= new Student("sophea","female",25);
        student1.get();
//        System.out.println(student1);
//        System.out.println(student2);

    }
}
