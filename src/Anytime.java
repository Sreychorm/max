public class Anytime {
    public static void main(String[] args){
        int i=0;
        // for loop
        for( i =0; i<5 ; i++){
            System.out.println(i);
        }
        //while loop
//        while (i<5){
//            System.out.println(i);
//            i++;
//        }
        // do while
        do {
            System.out.println(i);
            i++;
        } while (i<5);
        int opt = 0;
        do{
            System.out.println(opt);
            opt++;
        }while (opt<4);
    }
}
