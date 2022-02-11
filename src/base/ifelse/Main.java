package base.ifelse;

public class Main {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            if((i % 2) == 0){
                System.out.println("even number: " + i);
            }else {
                System.out.println("odd number: " + i);
            }
        }
    }
}
