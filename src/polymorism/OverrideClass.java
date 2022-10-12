package polymorism;
// Override
class Parent{
    String fullname;
    void disPlay(){
        System.out.println("Parent: display infor");
    }
    void message(){
        System.out.println("Parent: message");
    }
}
class Child extends Parent{
    @Override
    void disPlay() {
    //    super.disPlay();
        System.out.println("Child: display infor");
    }

    @Override
    void message() {
    //    super.message();
        System.out.println("Child: message");
    }
}
public class OverrideClass {
    public static void main(String[] args){
        Child obj= new Child();
        obj.disPlay();
        obj.message();
    }
}
