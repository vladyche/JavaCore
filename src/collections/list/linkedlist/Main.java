package collections.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> list = new LinkedList<>();
        list.add("string-1");
        list.add("string-2");
        list.add("string-2");

        for(String s : list){
            System.out.println(s);
        }

        //add to position
        list.add(3, "string-new");

        //size
        System.out.println(list.size());

        //get by index
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
