package funcinterfaces.example1;

@FunctionalInterface
public interface ConcatString {
    String build(String s1, String s2);
}
