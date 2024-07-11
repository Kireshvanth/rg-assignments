import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseExample {
    public static void main(String[] args) {
        // List of strings
        List<String> words = Arrays.asList("hello", "world", "java", "stream");

        // Convert each string to uppercase using map
        List<String> uppercaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Print the uppercase strings
        uppercaseWords.forEach(System.out::println);
    }
}
