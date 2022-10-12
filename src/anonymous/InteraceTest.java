package anonymous;

interface Ainterace{
    void message();
    void info();
}
public class InteraceTest {
    static Ainterace demo= new Ainterace(){
        @Override
        public void message() {
            System.out.println("Here's message");
        }

        @Override
        public void info() {
            System.out.println("Here's info");
        }
    };
    public static void main(String[] args) {
        demo.message();
        demo.info();
        Ainterace demo2 = new Ainterace(){
            @Override
            public void message() {
                System.out.println("Here's message");
            }

            @Override
            public void info() {
                System.out.println("Here's ino");
            }
        };
        demo2.message();
        demo2.info();
    }
}
