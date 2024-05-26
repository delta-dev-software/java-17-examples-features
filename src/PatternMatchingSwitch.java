public class PatternMatchingSwitch {
    public static void main(String[] args) {
        Object obj = "Hello, Java 17";

        // Use pattern matching in switch statement
        switch (obj) {
            case String s -> System.out.println("It's a string: " + s);
            case Integer i -> System.out.println("It's an integer: " + i);
            default -> System.out.println("Unknown type");
        }
    }
}
