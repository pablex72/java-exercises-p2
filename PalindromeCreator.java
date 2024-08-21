import java.util.ArrayList;
import java.util.List;

public class PalindromeCreator {
    public static void main(String[] args) {
        System.out.println(solve("adfa")); // Output: true
        System.out.println(solve("bd"));   // Output: true
    }

    public static boolean solve(String st) {
        // List to hold all the possible combinations
        List<String> possibleStrings = new ArrayList<>();
        possibleStrings.add("");

        // Generating all possible strings by replacing each character
        for (char c : st.toCharArray()) {
            List<String> newStrings = new ArrayList<>();
            List<Character> possibleCharacters = new ArrayList<>();

            // Get possible characters based on the rules
            if (c == 'a') {
                possibleCharacters.add('b');
            } else if (c == 'z') {
                possibleCharacters.add('y');
            } else {
                possibleCharacters.add((char) (c - 1));
                possibleCharacters.add((char) (c + 1));
            }

            // Combine previous strings with new characters
            for (String str : possibleStrings) {
                for (char pc : possibleCharacters) {
                    newStrings.add(str + pc);
                }
            }

            // Update possible strings
            possibleStrings = newStrings;
        }

        // Check if any generated string is a palindrome
        for (String ps : possibleStrings) {
            if (isPalindrome(ps)) {
                return true; // Return true if a palindrome is found
            }
        }

        return false; // Return false if no palindromes were found
    }

    // Helper method to check if a string is a palindrome
    public static boolean isPalindrome(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
