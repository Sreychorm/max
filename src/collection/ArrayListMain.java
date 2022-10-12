package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMain {
    public static void main(String[] args){
        ArrayList<Integer> intList=new ArrayList<>();
        intList.add(10);
        intList.add(30);
        intList.add(50);
        intList.add(1,70);
        System.out.println("before delete : ");
        System.out.println(intList);
        intList.remove(2);
        intList.set(0,40);
        System.out.println("before delete and reset ");
        System.out.println(intList);

        Collections.sort(intList,Collections.reverseOrder());

        for(int i=0; i<intList.size();i++){
            System.out.print(" "+intList.get(i));
        }
    }
}
