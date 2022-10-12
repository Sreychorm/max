public class Animal {
    String type,size, color;
    int age, leg;
    void eat(){
        System.out.println("Animal is eating");
    }
    void run(){
        System.out.println("Animal is running");
    }
    void sleep(){
        System.out.println("Animal is sleeping");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", leg=" + leg +
                '}';
    }

    public static void main(String[] arg){
        Animal dog=new Animal();
        dog.type="dog";
        dog.age=1;
        dog.leg=4;
        System.out.println("The number of leg"+ dog.toString());
//        System.out.println("The number of leg"+ dog.leg);
//        Animal cat= new Animal();
//        System.out.println("The number of leg"+ cat.leg);

    }
}
