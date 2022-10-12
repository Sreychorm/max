package inheritance;

class parent{
    String name="sophea";
    int age=19;
    void message(){
        System.out.println("This is message from parent class");
    }
}

public class Single extends parent{
    int wage=10;
    int hour=5;
    public static void main(String[] args) {
        Single obj = new Single();
        System.out.println("Name: "+obj.name);
        System.out.println("Age: "+obj.age);
        System.out.println("Wage: "+obj.wage);
        System.out.println("hours: "+obj.hour);
        obj.message();
    }
}
