import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String[] words = new String[5];
        words[2] = "Hello, Kiresh";

        Optional<String> optionalWord = Optional.ofNullable(words[2]);

        if (optionalWord.isPresent()) {
            System.out.println("Word is: " + optionalWord.get());
        } else {
            System.out.println("Word is not present");
        }

        optionalWord.ifPresent(word -> System.out.println("Word using ifPresent: " + word));

        String defaultWord = optionalWord.orElse("Default Word");
        System.out.println("Word using orElse: " + defaultWord);

        String defaultWordSupplier = optionalWord.orElseGet(() -> "Default Word from Supplier");
        System.out.println("Word using orElseGet: " + defaultWordSupplier);

        // Using orElseThrow to throw an exception if the value is not present
        try {
            String wordOrThrow = optionalWord.orElseThrow(() -> new Exception("Word not found"));
            System.out.println("Word using orElseThrow: " + wordOrThrow);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
