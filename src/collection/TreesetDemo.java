package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetDemo {
    public static void main(String[] args){
        TreeSet<Integer> treeset= new TreeSet<>();
        treeset.add(10);
        treeset.add(60);
        treeset.add(15);
        treeset.add(25);
        System.out.println("Before: Treeset value ");
        System.out.print(treeset);

        System.out.println("\n using Stream");
        treeset.stream().forEach(System.out::println);


        System.out.println("\n using Intorator");
        Iterator<Integer> integerIterator=treeset.iterator();
        while ((integerIterator.hasNext())){
            System.out.print(" "+integerIterator.next());
        }

        System.out.println("\n using Foreach");
        for (Integer integer:treeset){
            System.out.print(" "+integer);
        }
    }
}
