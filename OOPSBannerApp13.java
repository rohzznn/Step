public class SubstringGreetingApp {

    public static void main(String[] args) {

        // Check if no arguments are provided
        if (args.length == 0) {

            // Default message
            String defaultMessage = "Hello, World!";
            System.out.println(defaultMessage);

        } else {

            // Variable to store names with delimiter
            String combinedNames = "";

            // Enhanced for loop to combine names
            for (String name : args) {

                combinedNames = combinedNames + name + ", ";
            }

            // Remove trailing ", " using substring
            combinedNames = combinedNames.substring(0, combinedNames.length() - 2);

            // Final message
            String message = "Hello, " + combinedNames + "!";

            // Display output
            System.out.println(message);
        }
    }
}
