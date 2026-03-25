public class DisplayMultipleNamesApp {

    public static void main(String[] args) {

        // Check if no names are provided
        if (args.length == 0) {

            // Default case
            String defaultName = "World";
            System.out.println("Hello " + defaultName);

        } else {

            // Loop through all command-line arguments
            for (int i = 0; i < args.length; i++) {

                // Store current name
                String userName = args[i];

                // Create message
                String message = "Hello " + userName;

                // Display output
                System.out.println(message);
            }
        }
    }
}
