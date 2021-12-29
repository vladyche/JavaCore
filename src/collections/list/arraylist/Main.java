package collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> strings = new ArrayList<>();
        strings.add("string-1");
        strings.add("string-2");
        strings.add("string-3");

        for(String string : strings){
            System.out.println(string);
        }
    }
}
