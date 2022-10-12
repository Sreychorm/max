package anonymous;

class A{
    void message(){
        System.out.println("Message is from classA");
    }
}

public class Main {
    static A demo = new A(){
        @Override
        void message() {
      //      super.message();
            System.out.println("MainClass:The message is Override");

        }
    };
    public static void main(String[] args) {
        demo.message();
    }
}
