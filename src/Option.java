import java.util.Scanner;

public class Option {
    public static void main(String[] args){
        float num1, num2;
        char opterator;
        float result = 0;
        int month,day=0,opt=1;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1-Calculator");
            System.out.println("2-Days of Month");
            System.out.println("3-Exit");
            System.out.println("==================================================");
            System.out.print("Please choose option above:");
            opt = input.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("1-Calculator");
                    System.out.print("num1=");
                    num1 = input.nextFloat();
                    System.out.print("num2=");
                    num2 = input.nextFloat();
                    System.out.print("operation:");
                    opterator = input.next().charAt(0);
                    switch (opterator) {
                        case '+': result = num1 + num2;break;
                        case '-': result = num1 - num2;break;
                        case '/': result = num1 / num2;break;
                        case '*': result = num1 * num2;break;
                        default:System.out.println("there are only 4 type of operator");
                    }
                    System.out.printf("\n result= %.2f %c %.2f = %.2f\n", num1, opterator, num2, result);

                break;
                case 2:
                    System.out.println("2-Days of Month ");
                    System.out.print("Pls input month: ");
                    month = input.nextInt();
                    switch (month) {
                        case 1, 3, 5, 7, 8, 10, 12: day = 31;break;
                        case 2: day = 28;break;
                        case 4, 6, 9, 11:day = 30;break;
                        default: System.out.println("Invalid Number of month");
                    }
                    System.out.println("Month " + month + " has " + day + " days");
                break;
                case 3:
                    System.out.println("Good Bye!");
                 break;
                default:System.out.println("there are only 3 choice 1-3");
            }
            System.out.println("==================================================");
        }while (opt!=3);
        

    }
}
