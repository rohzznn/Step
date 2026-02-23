/**
 * UC5 - OOPS Banner using inline Array Initialization with String.join()
 * Optimized version of UC4 with cleaner structure.
 */
public class OOPSBannerApp5 {

    public static void main(String[] args) {

        // Declare and initialize banner in a single step
        String[] banner = {

            String.join("", " *****  ", " *****  ", " *****  ", " ***** "),
            String.join("", "*     * ", "*     * ", "*     * ", "*     *"),
            String.join("", "*     * ", "*     * ", "*     * ", "*     *"),
            String.join("", "*     * ", "*     * ", " *****  ", " ***** "),
            String.join("", "*     * ", "*     * ", "*       ", "*     "),
            String.join("", "*     * ", "*     * ", "*       ", "*     "),
            String.join("", " *****  ", " *****  ", "*       ", " ***** ")
        };

        // Print banner using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
