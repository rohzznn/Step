public class StringJoinGreetingApp {

    public static void main(String[] args) {

        // Check if no arguments are provided
        if (args.length == 0) {

            // Default message
            String defaultMessage = "Hello, World!";
            System.out.println(defaultMessage);

        } else {

            // Join all names with comma and space
            String joinedNames = String.join(", ", args);

            // Create final greeting message
            String message = "Hello, " + joinedNames + "!";

            // Display output
            System.out.println(message);
        }
    }
}
