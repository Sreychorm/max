import java.util.Scanner;

public class Month {
    public static void main(String[] args){
        int month;
        int day=0;
        Scanner input =new Scanner (System.in);
        System.out.print("Pls input month: ");
        month = input.nextInt();
        switch (month){
            case 1,3,5,7,8,10,12:
                day=31;
            break;
            case 2:
                day=28;
            break;
            case 4,6,9,11:
                day =30;
            break;
            default:
                System.out.println("Invalid Number of month");
        }
         System.out.println("Month "+month +" has "+ day + " days");

    }
}
