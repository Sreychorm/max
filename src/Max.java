import java.util.Scanner;

public class Max {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("a:");
        int a = input.nextInt();
        System.out.print("b:");
        int b = input.nextInt();
        System.out.print("c:");
        int c = input.nextInt();
        System.out.print("d:");
        int d = input.nextInt();

        int max=0;int min=0;
        max =(a>b && a>c && a>d)? a: (b>c && b>d)? b: (c>d)?c:d;
        min =(a<b && a<c && a<d)? a: (b<c && b<d)? b: (c<d)?c:d;
        System.out.printf("Max value is:%d \nMin Value is:%d", max,min);




//        if (a>b && a>c) max=a;
//        else if (b>a && b>c) max=b;
//        else max=c;
//        max =(a>c)? (a>c)? a:c : (b>c)?b:c;

//        max =(a>b)? (a>c)? (a>d)? a:(b>c)?(b>d)? b: (c>d)?c:d;2

//        System.out.printf("Max value is: %i \nMin Value is: %i",max,min);

//        int max=0;
//        max=(a>b)? a:b;
//        System.out.println("Max value is:"+ max);
    }
}
