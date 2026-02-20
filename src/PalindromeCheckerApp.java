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

        // --- Use Case 4: Character-array two-pointer based palindrome check ---
        System.out.println();
        System.out.println("Use Case 4: Character Array Two-Pointer Palindrome Check");

        String input3 = "radar"; // change to test other values
        System.out.println("Input string: " + input3);

        char[] chars = input3.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPal = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPal = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Is Palindrome? : " + isPal);

        // --- Use Case 5: Stack-based palindrome check ---
        System.out.println();
        System.out.println("Use Case 5: Stack-Based Palindrome Check");

        String input4 = "noon"; // change to test other values
        System.out.println("Input string: " + input4);

        java.util.Stack<Character> stack = new java.util.Stack<>();
        // Push each character onto the stack
        for (char c : input4.toCharArray()) {
            stack.push(c);
        }

        boolean isPalStack = true;
        // Iterate again through original string and compare with popped chars
        for (char c : input4.toCharArray()) {
            char top = stack.pop();
            if (c != top) {
                isPalStack = false;
                break;
            }
        }

        System.out.println("Is Palindrome (stack)? : " + isPalStack);

        // --- Use Case 6: Queue + Stack fairness check ---
        System.out.println();
        System.out.println("Use Case 6: Queue + Stack Fairness Check");

        String input5 = "civic"; // change to test other values
        System.out.println("Input : " + input5);

        java.util.Queue<Character> queue = new java.util.LinkedList<>();
        java.util.Stack<Character> stack2 = new java.util.Stack<>();

        // Insert each character into both queue and stack
        for (char c : input5.toCharArray()) {
            queue.add(c); // FIFO
            stack2.push(c); // LIFO
        }

        boolean isPalindromeFair = true;
        // Compare until queue becomes empty
        while (!queue.isEmpty()) {
            char q = queue.remove();
            char s = stack2.pop();
            if (q != s) {
                isPalindromeFair = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindromeFair);
    }

}