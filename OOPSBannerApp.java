/**
 * OOPSBannerApp
 *
 * UC4: Using Arrays and Loops to render banner
 *
 * @author Lynxx
 * @version 1.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] O = {
                " ******** ",
                "*        *",
                "*        *",
                "*        *",
                "*        *",
                "*        *",
                " ******** "
        };

        String[] P = {
                "********  ",
                "*       * ",
                "*       * ",
                "********  ",
                "*         ",
                "*         ",
                "*         "
        };

        String[] S = {
                " ******** ",
                "*         ",
                "*         ",
                " ******** ",
                "         *",
                "         *",
                " ******** "
        };

        // Create banner lines using concatenation
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = O[i] + " " + O[i] + " " + P[i] + " " + S[i];
        }

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}