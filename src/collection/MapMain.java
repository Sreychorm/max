package collection;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args){
        HashMap<Integer, String> rewards= new HashMap<>();
        rewards.put(1,"Bikecycle");
        rewards.put(2,"Notebook");
        rewards.put(null,"Notebook");
        rewards.put(1223, "Nothong");
        for(Map.Entry<Integer, String> reward : rewards.entrySet()){
            System.out.println(reward.getKey()+ "- "+reward.getValue());

        }

        HashMap<String,String> cars= new HashMap<>();
        cars.put("BWM", "1200$");
        cars.put("LAMBO", "5000$");
        System.out.println("BWM Price: "+ cars.get("BWM"));

    }
}
