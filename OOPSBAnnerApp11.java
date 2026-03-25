public class DisplayNameDefaultApp {

    public static void main(String[] args) {

        // Variable to store user name
        String userName = "World"; // default value

        // Check if command-line argument is provided
        if (args.length > 0) {

            // Assign input value
            userName = args[0];
        }

        // Create greeting message
        String message = "Hello " + userName;

        // Display output
        System.out.println(message);
    }
}
