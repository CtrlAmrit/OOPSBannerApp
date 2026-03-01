/**
 * OOPSBannerApp
 *
 * UC7: Store Character Pattern in a Class
 *
 * @author Amrit
 * @version 1.0
 */
public class OOPSBannerApp {

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
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

    public static void main(String[] args) {

        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
                " ******** ",
                "*        *",
                "*        *",
                "*        *",
                "*        *",
                "*        *",
                " ******** "
        });

        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
                "********  ",
                "*       * ",
                "*       * ",
                "********  ",
                "*         ",
                "*         ",
                "*         "
        });

        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
                " ******** ",
                "*         ",
                "*         ",
                " ******** ",
                "         *",
                "         *",
                " ******** "
        });

        CharacterPatternMap[] characters = {O, O, P, S};

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap c : characters) {
                line.append(c.getPattern()[row]).append(" ");
            }

            System.out.println(line);
        }
    }
}