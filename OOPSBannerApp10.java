public class DisplayNameDefaultApp {

    public static void main(String[] args) {

        // Declare variable for name
        String userName;

        // Check if argument is provided
        if (args.length > 0) {

            // Take name from command-line
            userName = args[0];

        } else {

            // Default value if no input
            userName = "World";
        }

        // Create message
        String message = "Hello " + userName;

        // Display output
        System.out.println(message);
    }
}
