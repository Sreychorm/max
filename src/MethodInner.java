
        class OuterClass {
            int outer = 12;

            void outerMethod() {
                class InnerClass {
                    int inner = 24;

                    void innerMethod() {
                        System.out.println("Inner Method");
                    }
                }
                InnerClass objInner = new InnerClass();
                objInner.innerMethod();
                System.out.println("Outer Method: value of innerValue is" + objInner.inner);
            }
        }

    public class MethodInner {
    public static void main(String[] args) {
        OuterClass objOuter =new OuterClass();
        System.out.println("value of OuterValue:"+objOuter.outer);
        objOuter.outerMethod();

    }

}



