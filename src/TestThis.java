public class TestThis {
    String username;
    int age;
    TestThis(){
        this("Dara",25);
    }

    TestThis(String username, int age) {
        this.username = username;
        this.age = age;
    }

    @Override
    public String toString() {
        return "TestThis{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        TestThis obj = new TestThis();
        System.out.println(obj);
    }
}
