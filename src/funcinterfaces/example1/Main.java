package funcinterfaces.example1;

public class Main {
    public static void main(String[] args) {

        //anonymous class
        ConcatString str1 = new ConcatString(){

            @Override
            public String build(String s1, String s2){
                return s1 + " " + s2;
            }
        };

        System.out.println(str1.build("Hello", "World"));

        //lambda expression
        ConcatString str2 = (String s1, String s2) -> s1 + " " + s2;
        System.out.println(str2.build("Java", "World"));
    }
}
