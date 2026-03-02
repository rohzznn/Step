import java.util.HashMap;
import java.util.Map;

public class BannerApp {

    // Function to create pattern map
    public static Map<Character, String[]> createPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return map;
    }

    // Function to render banner word
    public static void renderBanner(String word, Map<Character, String[]> map) {

        int height = map.get(word.charAt(0)).length;

        for (int row = 0; row < height; row++) {

            for (int i = 0; i < word.length(); i++) {

                char ch = word.charAt(i);

                String[] pattern = map.get(ch);

                System.out.print(pattern[row] + "  ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = createPatternMap();

        String word = "OOPS";

        renderBanner(word, patternMap);
    }
}
