package abstrac;

abstract class UserLogicAbstract{
    String userID="1231";
    String roles;
    abstract void login(String userName, String password);
    abstract void signUp(String userName, String password);
    void display(){
        System.out.println("Defualt user: "+userID);
    }

}
class UserLogic extends UserLogicAbstract{
    String userName, password;

    @Override
    void login(String userName, String password) {
        if(userName.equals(this.userName) && password.equals(this.password)){
            System.out.println("Login Successful!");
        }else System.out.println("Fail to Login !");
    }

    @Override
    void signUp(String userName, String password) {
        this.userName=userName;
        this.password=password;

    }
}

public class AbstracTest {
    public static void main(String[] args){
        UserLogic obj= new UserLogic();
        obj.signUp("admin","12345");
        obj.login("admin", "12345");
        obj.display();
    }
}
