
import java.util.Scanner;

class Lexico {

    public static void main(String[] args) {
        Scanner ran = new Scanner(System.in);
        String str = "welcometojava";
        int n = 3;
        int l = str.length();
        String maxString = " ";
        String minString = " ";
        for (int i = 0; i < l - 2; i++) {
            String newString = " ";
            for (int j = 0; j < n; j++) {
                newString = newString + str.charAt(i + j);
            }

            if (newString.compareToIgnoreCase(maxString) > 0) {
                maxString = newString;
            } else if (minString.compareToIgnoreCase(newString) > 0) {
                minString = newString;
            } else {
                minString = newString;
            }
        }
        System.out.println(minString);
        System.out.println(maxString);
    }
}
