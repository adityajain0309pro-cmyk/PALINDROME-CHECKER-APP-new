public class PalindromeCheckerApp {

    // ✅ Singly Linked List Node
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // ✅ Doubly Linked List Node  <-- MUST BE HERE
    static class DoublyNode {
        char data;
        DoublyNode next;
        DoublyNode prev;

        DoublyNode(char data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");

        System.out.println();
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

        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        System.out.println();
        System.out.println("Use Case 3: Reverse String Based Palindrome Check");

        String input2 = "racecar";
        System.out.println("Input string: " + input2);

        StringBuilder sb = new StringBuilder();
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

        System.out.println();
        System.out.println("Use Case 4: Character Array Two-Pointer Palindrome Check");

        String input3 = "radar";
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

        System.out.println();
        System.out.println("Use Case 5: Stack-Based Palindrome Check");

        String input4 = "noon";
        System.out.println("Input string: " + input4);

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input4.toCharArray()) {
            stack.push(c);
        }

        boolean isPalStack = true;

        for (char c : input4.toCharArray()) {
            char top = stack.pop();
            if (c != top) {
                isPalStack = false;
                break;
            }
        }

        System.out.println("Is Palindrome (stack)? : " + isPalStack);

        System.out.println();
        System.out.println("Use Case 6: Queue + Stack Fairness Check");

        String input5 = "civic";
        System.out.println("Input : " + input5);

        java.util.Queue<Character> queue = new java.util.LinkedList<>();
        java.util.Stack<Character> stack2 = new java.util.Stack<>();

        for (char c : input5.toCharArray()) {
            queue.add(c);
            stack2.push(c);
        }

        boolean isPalindromeFair = true;

        while (!queue.isEmpty()) {
            char q = queue.remove();
            char s = stack2.pop();
            if (q != s) {
                isPalindromeFair = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindromeFair);

        System.out.println();
        System.out.println("Use Case 7: Deque Based Optimized Palindrome Checker");

        String input6 = "refer";
        System.out.println("Input : " + input6);

        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();
        for (char c : input6.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalDeque = true;

        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();
            if (first != last) {
                isPalDeque = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalDeque);
        System.out.println();
        System.out.println("Use Case 8: Linked List Based Palindrome Checker");

        String input7 = "racecar";
        System.out.println("Input : " + input7);

        // Convert string to linked list
        Node head = null;
        Node tail = null;

        for (char c : input7.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Step 1: Find middle using fast and slow pointers
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node prev = null;
        Node current = slow;

        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        // Step 3: Compare first half and reversed second half
        Node firstHalf = head;
        Node secondHalf = prev;

        boolean isLinkedListPalindrome = true;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                isLinkedListPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        System.out.println("Is Palindrome (Linked List)? : " + isLinkedListPalindrome);
        System.out.println();
        System.out.println("Use Case 9: Doubly Linked List Based Palindrome Checker");

        String input8 = "level";
        System.out.println("Input : " + input8);

        // Convert string to doubly linked list
        DoublyNode headD = null;
        DoublyNode tailD = null;

        for (char c : input8.toCharArray()) {
            DoublyNode newNode = new DoublyNode(c);

            if (headD == null) {
                headD = newNode;
                tailD = newNode;
            } else {
                tailD.next = newNode;
                newNode.prev = tailD;
                tailD = newNode;
            }
        }

        // Two pointer comparison (front & back)
        DoublyNode leftNode = headD;
        DoublyNode rightNode = tailD;

        boolean isDoublyPalindrome = true;

        while (leftNode != null && rightNode != null && leftNode != rightNode && rightNode.next != leftNode) {

            if (leftNode.data != rightNode.data) {
                isDoublyPalindrome = false;
                break;
            }

            leftNode = leftNode.next;
            rightNode = rightNode.prev;
        }

        System.out.println("Is Palindrome (Doubly Linked List)? : " + isDoublyPalindrome);}
}