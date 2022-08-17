import java.util.Scanner;

public class LinearSearchQ1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any word");
        String word = in.nextLine();
        System.out.println("Enter word to search for: ");
        char character = in.next().charAt(0);
        if (searchInStrings(word, character)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }

    static boolean searchInStrings(String word, char target) {
        for (char c : word.toCharArray()) {
            if (c == target)
                return true;
        }
        return false;
    }
}