/**
 * OOPSBannerApp
 *
 * UC6: Using Static Helper Methods for Character Patterns
 *
 * @author Amrit
 * @version 1.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ", O[i], O[i], P[i], S[i]);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Static helper method for letter O
    public static String[] getO() {
        return new String[]{
                " ******** ",
                "*        *",
                "*        *",
                "*        *",
                "*        *",
                "*        *",
                " ******** "
        };
    }

    // Static helper method for letter P
    public static String[] getP() {
        return new String[]{
                "********  ",
                "*       * ",
                "*       * ",
                "********  ",
                "*         ",
                "*         ",
                "*         "
        };
    }

    // Static helper method for letter S
    public static String[] getS() {
        return new String[]{
                " ******** ",
                "*         ",
                "*         ",
                " ******** ",
                "         *",
                "         *",
                " ******** "
        };
    }
}