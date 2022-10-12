public class Varag {
    //using varag
    public static int sunV2(String message, int... values){
        System.out.println(message);
        int sum=0;
        for(int v:values){
            sum=sum+v;
        }
        return sum;
    }
    public static void main(String[] args) {

        // display varag
        int result2=sunV2("Hello",10);
        int result3=sunV2("Good Morning",10,20);
        System.out.println(result2);
        System.out.println(result3);


    }
}

