package exception;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class  Student{
    int id;
    String studentName;
    String address;
    String classRoom; // A1 , A2
    String birthOfDate;
    float score ;
    String grade;

    Student(){
        address="unknown";
        classRoom="unknown";
        birthOfDate="unknown";

    }
    //
    Student(int id, String studentName,String address,String classRoom, String birthOfDate,float score, String grade){
        this.id =id;
        this.studentName = studentName;
        this.address = address;
        this.classRoom = classRoom ;
        this.birthOfDate = birthOfDate;
        this.score = score;
        this.grade = grade;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", address='" + address + '\'' +
                ", classroom='" + classRoom + '\'' +
                ", birthOfDate='" + birthOfDate + '\'' +
                ", score=" + score +
                ", grade='" + grade + '\'' + "\n"+
                '}';
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<Student>();
        int option = 0;
        do {
            System.out.println("------------------- Welcome to Student Management System --------------------------");
            System.out.println("1. Enroll Student ");
            System.out.println("2. Edit Student Information");
            System.out.println("3. Delete Student Information");
            System.out.println("4. Search Student Information ");
            System.out.println("5. Show All Student Information ");
            System.out.println("6. Exit the program");

            System.out.print(" Enter value (1 to 6): ");


            try {
                option = input.nextInt();
            } catch (InputMismatchException ex) {
                option = 0;
                System.out.println(" You have enter the wrong option !");
            } finally {
                input.nextLine();
            }

            if (option > 0) {
                switch (option) {
                    case 1:
                        boolean isStudentEntryValid = true;
                        System.out.println("=================Enroll Student ==========");
                        Student student = new Student();
                        System.out.print(" Enter Student ID : ");
                        student.id = input.nextInt();
                        System.out.print(" Enter Student Name: ");
                        input.nextLine();
                        student.studentName = input.nextLine();

                        System.out.print(" Enter Student ClassRoom :  ");
                        student.classRoom = input.nextLine();

                        System.out.print(" Enter Student BirthOfDate : ");
                        student.birthOfDate = input.nextLine();

                        System.out.print(" Enter Student Score : ");
                        try {
                            student.score = input.nextFloat();
                        } catch (InputMismatchException ex) {
                            isStudentEntryValid = false;
                            System.out.println("Error :  Score has float type ");

                        }

                        System.out.print(" Enter Student grade : ");
                        input.nextLine();
                        student.grade = input.nextLine();


                        // Add into the list
                        if (isStudentEntryValid)
                            studentList.add(student);
                        else
                            System.out.println(" The Information that you entered is not correct !");
                        break;
                    case 2:
                        int editStudentID = 0;
                        System.out.println(" ========= Edit Student Information ========= ");
                        System.out.print(" Enter the student ID to edit : ");

                        try {
                            editStudentID = input.nextInt();
                        } catch (InputMismatchException ex) {
                            System.out.println(" You have entered the wrong format ... ");
                        }

                        if (editStudentID != 0) {
                            // ID = 1001  , 1002 => unique
                            for (int i = 0; i < studentList.size(); i++) {
                                if (studentList.get(i).id == editStudentID) {

                                    Student updateStudent = new Student(); //

                                    System.out.println("Enter new Student Name : ");
                                    input.nextLine();
                                    String updateName = input.nextLine();

                                    System.out.println(" Enter student address");
                                    input.nextLine();
                                    String updateAddress = input.nextLine();

                                    //  Constructor
                                    updateStudent.studentName = updateName;
                                    updateStudent.address = updateAddress;

                                    /// If they enter the score correctly
                                    // update the information
                                    // else failed cause information is invalid

                                    studentList.set(i, updateStudent); // -> name, address
                                    System.out.println(" New Student Information has been updated sucessfully !");

                                }

                            }
                        }
                        break;
                    case 5:
                        System.out.println(" ======== Show all the student information =======");
                        for (int i = 0; i < studentList.size(); i++) {
                            System.out.println(studentList.get(i));
                        }
                        break;
                }

            }
        } while (option != 6);
    }
}