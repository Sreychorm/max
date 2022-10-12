package polymorism;
//overloading
class AddUtil{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }

}
public class PolyClass {
    public static void main (String[] args){
        AddUtil obj= new AddUtil();
        int intValue2=obj.add(1,2);
        double doubleValue = obj.add(2.5,3.5);
        int intValue3= obj.add(1,2,3);
        System.out.println("Int 2 value: "+intValue2);
        System.out.println("Int 3 value: "+intValue3);
        System.out.println("Double value: "+doubleValue);
    }
}
