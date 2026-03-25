public class EnhancedForGreetingApp {

    public static void main(String[] args) {

        // Check if no arguments are provided
        if (args.length == 0) {

            // Default greeting
            String defaultMessage = "Hello, World!";
            System.out.println(defaultMessage);

        } else {

            // Enhanced for loop (for-each) to iterate through names
            for (String userName : args) {

                // Create greeting message
                String message = "Hello, " + userName + "!";

                // Display output
                System.out.println(message);
            }
        }
    }
}
