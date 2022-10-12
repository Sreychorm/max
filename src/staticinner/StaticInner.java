package staticinner;


class Outer{
    public static class InnerClass{
        int inner=25;
        void innerDisplay(){
            System.out.println("Inner Value=" + inner);
        }

    }

}

public class StaticInner {
    public static void main(String[] args) {
        Outer.InnerClass obj= new Outer.InnerClass();
        obj.innerDisplay();

    }

}
