public class DisplayNameApp {

    public static void main(String[] args) {

        // Check if user provided a command-line argument
        if (args.length > 0) {

            // Store user name from arguments
            String userName = args[0];

            // Create greeting message
            String message = "Hello " + userName;

            // Display output
            System.out.println(message);

        } else {

            // Handle case when no argument is provided
            System.out.println("No name provided. Please pass your name as a command-line argument.");
        }
    }
}
