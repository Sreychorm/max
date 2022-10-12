import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        int num;
        int n;
//        int num2=0;
//        int reverse=0;
//        int num3=0;
        Scanner input = new Scanner(System.in);
        System.out.print("pls input number:");
        n = input.nextInt();

//        while(num!=0){
//            num2=num%10;
//            reverse=reverse*10+num2;
//            num=num/10;
//        }
//        System.out.println(reverse);
        int sum=0;
        while(n>0){
            if (n%2==0) {
                System.out.println(n);
                sum=sum+n;
            }
            n--;
        }
        System.out.println(sum);





    }
}
