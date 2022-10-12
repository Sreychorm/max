import java.util.Scanner;

public class TestClass {
    public static void welcomeMessage(String subject){
        System.out.println("Welcome"+subject);
    }
//    public static float cal(int a, int b, String opt){
//       switch (opt){
//           case "+": return a+b;
//           case "-" : return a-b;
//           case "*" : return a*b;
//           case "/" : return a/b;
//           default: return 0;
//       }
//    }
    public static void call(int n){
        if(n<0) return ;
        System.out.println(" "+ n);
        n=n-1;
        call(n);
    }
    public static int sumNum(int n){
        if(n!=0)
            return n+ sumNum(n-1);
        else return 0;
    }
    public static int Factorial(int n){
        if(n==0 || n==1)
            return 1;
        return Factorial(n-1)*n;
    }

    public static void main(String[] args) {
        //welcomeMessage("English");
//        float result = cal(9,2,"+");
//        System.out.println("Result="+result);
//        call(9);
        System.out.println("Result="+sumNum(4));
        System.out.println("Result="+Factorial(3));
    }
}
