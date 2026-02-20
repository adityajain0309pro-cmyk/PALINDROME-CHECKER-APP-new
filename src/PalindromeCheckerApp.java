public class PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("Palindrome Checker Application - UC2: Hardcoded Palindrome Validation");

        // Hardcoded input for Use Case 2
        String input = "madam"; // change this string to test other values

        System.out.println("Input string: " + input);

        boolean isPalindrome = true;
        int len = input.length();

        // Loop only till half of the string length.
        for (int i = 0; i < len / 2; i++) {
            if (input.charAt(i) != input.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }

}