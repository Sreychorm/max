package staticinner;

class OuterClass{
    private int outervalue=12;
    class InnerClass{
        int innervalue=24;
        void display(){
            System.out.println("Outer value is :"+outervalue);
            System.out.println("Hello from inner class");
        }
    }
}


public class NornalInnter {
    public static void main(String[] args){
        OuterClass.InnerClass obj=new OuterClass().new InnerClass();
        obj.display();
    }
}
