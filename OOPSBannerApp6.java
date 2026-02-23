/**
 * UC6 - OOPS Banner using Static Helper Methods
 * Improves modularity by separating character pattern logic.
 */
public class OOPSBannerApp6 {

    public static void main(String[] args) {

        String[] o = printO();
        String[] p = printP();
        String[] s = printS();

        // Final banner array (7 rows)
        String[] banner = new String[7];

        for (int i = 0; i < banner.length; i++) {
            banner[i] = o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i];
        }

        // Enhanced for-loop to print
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Static method for letter O
    public static String[] printO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Static method for letter P
    public static String[] printP() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Static method for letter S
    public static String[] printS() {
        return new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }
}
