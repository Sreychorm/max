import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        float num1, num2;
        char opterator;
        float result = 0;
        System.out.println();
        Scanner input =new Scanner (System.in);
        System.out.print("num1=");
        num1 = input.nextFloat();
        System.out.print("num2=");
        num2 = input.nextFloat();
        System.out.print("operation:");
        opterator=input.next().charAt(0);
        switch (opterator){
            case '+':
                result = num1+num2;
            break;
            case '-':
                result = num1-num2;
                break;
            case '/':
                result = num1/num2;
                break;
            case '*':
                result = num1*num2;
                break;
            default:

        }
        System.out.printf("%.2f %c %.2f = %.2f",num1, opterator,num2,result);



    }
}
