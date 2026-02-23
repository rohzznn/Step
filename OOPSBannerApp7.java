/**
 * UC7 - OOPS Banner using Character Pattern Class
 * Stores each character and its ASCII pattern in a centralized structure.
 */
public class OOPSBannerApp7 {

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        CharacterPattern[] word = {O, O, P, S};

        String[] banner = new String[7];

        for (int i = 0; i < banner.length; i++) {
            StringBuilder row = new StringBuilder();

            for (CharacterPattern ch : word) {
                row.append(ch.getPattern()[i]).append("  ");
            }

            banner[i] = row.toString();
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Static inner class for character pattern mapping
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
}
