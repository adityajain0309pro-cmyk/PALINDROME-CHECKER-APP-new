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

        // --- Use Case 3: Reverse-string based palindrome check (in same file) ---
        System.out.println();
        System.out.println("Use Case 3: Reverse String Based Palindrome Check");

        String input2 = "racecar"; // change to test other values
        System.out.println("Input string: " + input2);

        StringBuilder sb = new StringBuilder();
        // Iterate from the last character to the first.
        for (int i = input2.length() - 1; i >= 0; i--) {
            sb.append(input2.charAt(i));
        }

        String reversed = sb.toString();
        System.out.println("Reversed string: " + reversed);

        if (input2.equals(reversed)) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }

}