import java.util.*;

public class MethodReferenceExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Sorting using lambda expression
        Collections.sort(names, (s1, s2) -> s1.compareToIgnoreCase(s2));

        names.forEach(System.out::println);
    }
}

class MethodReferenceExample1 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Sorting using method reference
        Collections.sort(names, String::compareToIgnoreCase);

        names.forEach(System.out::println);
    }
}
