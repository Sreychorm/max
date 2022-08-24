import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Please input your name: ");
        String name = input.nextLine();
        System.out.print("Please input you class: ");
        String your_class = input.nextLine();

        System.out.print("Math: ");
        float math = input.nextFloat();
        System.out.print("Physic: ");
        float physic = input.nextFloat();
        System.out.print("Java: ");
        float java = input.nextFloat();

        float sum = math+physic+java;
        float avg = (float) sum/3;

        String grande="";
        if (avg>=85) grande="A";
        else if (avg>=75) grande="B";
        else if (avg>=65) grande="C";
        else if (avg>=50) grande="D";
        else grande="F";

        System.out.println("==========================================");
        System.out.printf("Class: %s \nName: %s \n", your_class, name);
        System.out.printf("your Total Score is: %f \nAverage is: %f \nGrande \n", sum,avg,grande);

    }
}
