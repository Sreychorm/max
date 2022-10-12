public class NestedStatic {
    int outer=12;
    public static class InnerClass{
        String username="sophea";
        int age=25;


        void showInfor(){
            System.out.println("-----------------------------");
  //          System.out.println("From outer" );
            System.out.println("Name=" + username);
            System.out.println("Age=" + age);
            System.out.println("-----------------------------");
        }
    }
    public static void main(String[] args) {
        NestedStatic.InnerClass obj= new NestedStatic.InnerClass();
        obj.showInfor();
        System.out.println("Username: "+obj.username);

    }
}
