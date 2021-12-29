package collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "string-1");
        map.put(1, "string-2");
        map.put(2, "string-3");

        //get value by key
        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.get(i));
        }

        //Map.Entry
        for(Map.Entry<Integer, String> item : map.entrySet()){
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("key: " + item.getKey());
            System.out.println("value: " + item.getValue());
            System.out.println("-------------------------------------------------------------------------------------");
        }

    }
}
