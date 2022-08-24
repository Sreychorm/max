import java.util.Scanner;
public class HelloWorld {


    public static void main(String[] args){
//        int a=5;
//        char gender='f';
//        float salary=25.2f;
//        short shortValue=12;
//        double doubleValue= 1213123d;
//        String message="hello";
//        System.out.println(message);
//        System.out.println("int:"+a +" char:"+gender+" float:"+salary+" short:"+shortValue);
//        int age=10;
//        if(age==10)
//            System.out.println("your are 10 years old");
//        else
//            System.out.println("not 10 years old");


//        int math=9;
//        int physic=5;
//        int java=3;
//        int sum = math+physic+java;
//        float average=(float) sum/3;
//        System.out.println("Total score is: "+sum);
//        System.out.println("Average is: "+average);
//        if (average>8.5) System.out.println("Grade A");
//        else if (average>=6.5) System.out.println("Grade B");
//        else if (average>=5) System.out.println("Grade C");
//        else System.out.println("Grade D");


//        String gender ="female";
//        int age=20;
//        if (gender.equals("female") || age==18){
//            System.out.println("you are qualify");
//        }else{
//            System.out.println("you are not qualify....");
//        }

        //ternery

        Scanner input = new Scanner(System.in);
        System.out.print("a:");
        int a = input.nextInt();

        System.out.print("b:");
        int b = input.nextInt();

        int max=0;
        max=(a>b)? a:b;
        System.out.println("Max value is:"+ max);



    }
}

//        max =(a>b)? (a>c)? (a>d)? a:(c>d)? c:d:
//                (b>a)?(b>c)?(b>d)?b:(c>d)? c:d:
//                        (c>a)?(c>b)?(c>d)?c:(b>d)?b:d:
//                                (d>a)?(d>b)?(d>c)?d:(b>c)?c:b;
