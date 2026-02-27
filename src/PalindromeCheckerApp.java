import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.\n");

        // --- UC2: Hardcoded Palindrome Validation ---
        System.out.println("Palindrome Checker Application - UC2: Hardcoded Palindrome Validation");
        String input = "racecar";
        System.out.println("Input string: " + input);

        boolean isPalindrome = true;
        int len = input.length();
        for (int i = 0; i < len / 2; i++) {
            if (input.charAt(i) != input.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Result: " + (isPalindrome ? "Palindrome" : "NOT a palindrome") + "\n");

        // --- UC3: Reverse String Based Palindrome Check ---
        System.out.println("Use Case 3: Reverse String Based Palindrome Check");
        String input2 = "racecar";
        System.out.println("Input string: " + input2);
        StringBuilder sb = new StringBuilder();
        for (int i = input2.length() - 1; i >= 0; i--) sb.append(input2.charAt(i));
        String reversed = sb.toString();
        System.out.println("Reversed string: " + reversed);
        System.out.println("Result: " + (input2.equals(reversed) ? "Palindrome" : "NOT a palindrome") + "\n");

        // --- UC4: Character Array Two-Pointer Check ---
        System.out.println("Use Case 4: Character Array Two-Pointer Palindrome Check");
        String input3 = "radar";
        System.out.println("Input string: " + input3);
        char[] chars = input3.toCharArray();
        int start = 0, end = chars.length - 1;
        boolean isPal = true;
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPal = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Is Palindrome? : " + isPal + "\n");

        // --- UC5: Stack-Based Palindrome Check ---
        System.out.println("Use Case 5: Stack-Based Palindrome Check");
        String input4 = "noon";
        System.out.println("Input string: " + input4);
        Stack<Character> stack = new Stack<>();
        for (char c : input4.toCharArray()) stack.push(c);
        boolean isPalStack = true;
        for (char c : input4.toCharArray()) {
            if (c != stack.pop()) {
                isPalStack = false;
                break;
            }
        }
        System.out.println("Is Palindrome (stack)? : " + isPalStack + "\n");

        // --- UC6: Queue + Stack Fairness Check ---
        System.out.println("Use Case 6: Queue + Stack Fairness Check");
        String input5 = "civic";
        System.out.println("Input : " + input5);
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack2 = new Stack<>();
        for (char c : input5.toCharArray()) {
            queue.add(c);
            stack2.push(c);
        }
        boolean isPalindromeFair = true;
        while (!queue.isEmpty()) {
            if (queue.remove() != stack2.pop()) {
                isPalindromeFair = false;
                break;
            }
        }
        System.out.println("Is Palindrome? : " + isPalindromeFair + "\n");

        // --- UC7: Deque Based Optimized Palindrome Checker ---
        System.out.println("Use Case 7: Deque Based Optimized Palindrome Checker");
        String input6 = "refer";
        System.out.println("Input : " + input6);
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input6.toCharArray()) deque.addLast(c);
        boolean isPalDeque = true;
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalDeque = false;
                break;
            }
        }
        System.out.println("Is Palindrome? : " + isPalDeque + "\n");

        // --- UC8: Linked List Based Palindrome Checker ---
        System.out.println("Use Case 8: Linked List Based Palindrome Checker");
        String input7 = "racecar";
        System.out.println("Input : " + input7);
        Node head = null, tail = null;
        for (char c : input7.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) head = tail = newNode;
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        Node slow = head;
        for (Node fast = head; fast != null && fast.next != null; fast = fast.next.next) slow = slow.next;
        Node prev = null, nextNode;
        for (Node current = slow; current != null; current = nextNode) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
        }
        nextNode = head;
        Node secondHalf = prev;
        boolean isLinkedListPalindrome = true;
        for (; secondHalf != null; secondHalf = secondHalf.next) {
            if (nextNode.data != secondHalf.data) {
                isLinkedListPalindrome = false;
                break;
            }
            nextNode = nextNode.next;
        }
        System.out.println("Is Palindrome (Linked List)? : " + isLinkedListPalindrome + "\n");

        // --- UC9: Doubly Linked List Based Palindrome Checker ---
        System.out.println("Use Case 9: Doubly Linked List Based Palindrome Checker");
        String input8 = "level";
        System.out.println("Input : " + input8);
        DoublyNode headD = null, tailD = null;
        for (char c : input8.toCharArray()) {
            DoublyNode newNode = new DoublyNode(c);
            if (headD == null) headD = tailD = newNode;
            else {
                tailD.next = newNode;
                newNode.prev = tailD;
                tailD = newNode;
            }
        }
        DoublyNode leftNode = headD, rightNode = tailD;
        boolean isDoublyPalindrome = true;
        while (leftNode != null && rightNode != null && leftNode != rightNode && rightNode.next != leftNode) {
            if (leftNode.data != rightNode.data) { // ✅ compare data
                isDoublyPalindrome = false;
                break;
            }
            leftNode = leftNode.next;
            rightNode = rightNode.prev;
        }
        System.out.println("Is Palindrome (Doubly Linked List)? : " + isDoublyPalindrome + "\n");

        // --- UC10: Case-Insensitive & Space-Ignored Palindrome Check ---
        System.out.println("Use Case 10: Case-Insensitive & Space-Ignored Palindrome Check");
        String input10 = "A man a plan a canal Panama";
        System.out.println("Input : " + input10);
        String normalizedInput = input10.replaceAll("\\s+", "").toLowerCase();
        int l = 0, r = normalizedInput.length() - 1;
        boolean isPalUC10 = true;
        while (l < r) {
            if (normalizedInput.charAt(l) != normalizedInput.charAt(r)) {
                isPalUC10 = false;
                break;
            }
            l++;
            r--;
        }
        System.out.println("Is Palindrome (case-insensitive & space-ignored)? : " + isPalUC10 + "\n");

        // --- UC11: Object-Oriented Palindrome Service ---
        System.out.println("Use Case 11: Object-Oriented Palindrome Service");
        PalindromeChecker checkerUC11 = new PalindromeChecker();
        String[] uc11Tests = {"racecar", "hello", "A man a plan a canal Panama"};
        for (String s : uc11Tests) {
            System.out.println("Input: " + s);
            boolean res = checkerUC11.checkPalindrome(s);
            System.out.println("Is Palindrome? : " + res + "\n");
        }

        // --- UC12: Strategy Pattern for Palindrome Algorithms ---
        System.out.println("Use Case 12: Strategy Pattern for Palindrome Algorithms");
        String[] uc12Tests = {"racecar", "hello", "A man a plan a canal Panama"};

        // Create strategies
        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeStrategy dequeStrategy = new DequeStrategy();

        // Using StackStrategy
        System.out.println("--- Using StackStrategy ---");
        StrategyPalindromeChecker checkerUC12 = new StrategyPalindromeChecker(stackStrategy);
        for (String s : uc12Tests) {
            System.out.println("Input: " + s + " | Is Palindrome? : " + checkerUC12.check(s));
        }

        // Switch to DequeStrategy at runtime
        System.out.println("\n--- Switching to DequeStrategy ---");
        checkerUC12.setStrategy(dequeStrategy);
        for (String s : uc12Tests) {
            System.out.println("Input: " + s + " | Is Palindrome? : " + checkerUC12.check(s));

        }
        // --- UC13: Performance Comparison of Palindrome Approaches ---
        System.out.println("Use Case 13: Performance Comparison of Palindrome Approaches");

// Test inputs
        String[] testInputs = {
                "racecar",
                "A man a plan a canal Panama",
                "hello world",
                "noon",
                "refer"
        };

// Strategies to compare
        PalindromeStrategy[] strategies = {
                new StackStrategy(),
                new DequeStrategy()
        };

        String[] strategyNames = {"StackStrategy", "DequeStrategy"};

        for (int i = 0; i < strategies.length; i++) {
            PalindromeStrategy strat = strategies[i];
            System.out.println("\n--- Timing: " + strategyNames[i] + " ---");

            for (String inputStr : testInputs) {
                long startTime = System.nanoTime();
                boolean result = strat.isPalindrome(inputStr);
                long endTime = System.nanoTime();
                long duration = endTime - startTime;

                System.out.println("Input: \"" + inputStr + "\" | Is Palindrome? : "
                        + result + " | Time (ns): " + duration);
            }
        }
        System.out.println();
    }

    // --- Supporting Classes ---
    static class Node {
        char data;
        Node next;
        Node(char data) { this.data = data; this.next = null; }
    }

    static class DoublyNode {
        char data;
        DoublyNode next, prev;

        DoublyNode(char data) {
            this.data = data;   // assign the char
            this.next = null;   // initially no next
            this.prev = null;   // initially no prev
        }
    }

    // --- UC11 Palindrome Service Class ---
    static class PalindromeChecker {
        public boolean checkPalindrome(String input) {
            if (input == null) return false;
            String normalized = input.replaceAll("\\s+", "").toLowerCase();
            Stack<Character> stack = new Stack<>();
            for (char c : normalized.toCharArray()) stack.push(c);
            for (char c : normalized.toCharArray()) {
                if (c != stack.pop()) return false;
            }
            return true;
        }
    }

    // --- UC12 Strategy Interface & Implementations ---
    interface PalindromeStrategy {
        boolean isPalindrome(String input);
    }

    static class StackStrategy implements PalindromeStrategy {
        public boolean isPalindrome(String input) {
            if (input == null) return false;
            String normalized = input.replaceAll("\\s+", "").toLowerCase();
            Stack<Character> stack = new Stack<>();
            for (char c : normalized.toCharArray()) stack.push(c);
            for (char c : normalized.toCharArray()) if (c != stack.pop()) return false;
            return true;
        }
    }

    static class DequeStrategy implements PalindromeStrategy {
        public boolean isPalindrome(String input) {
            if (input == null) return false;
            String normalized = input.replaceAll("\\s+", "").toLowerCase();
            Deque<Character> deque = new ArrayDeque<>();
            for (char c : normalized.toCharArray()) deque.addLast(c);
            while (deque.size() > 1) if (deque.removeFirst() != deque.removeLast()) return false;
            return true;
        }
    }

    static class StrategyPalindromeChecker {
        private PalindromeStrategy strategy;
        public StrategyPalindromeChecker(PalindromeStrategy strategy) { this.strategy = strategy; }
        public void setStrategy(PalindromeStrategy strategy) { this.strategy = strategy; }
        public boolean check(String input) { return strategy.isPalindrome(input); }
    }
}