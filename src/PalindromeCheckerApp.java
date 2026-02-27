<<<<<<< HEAD
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {
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

        for(int i = 0; i < len / 2; ++i) {
=======
public class PalindromeCheckerApp {

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
>>>>>>> 11867fbb8735466cf14bda3a85e5b035a2205277
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
<<<<<<< HEAD
        String input2 = "racecar";
        System.out.println("Input string: " + input2);
        StringBuilder sb = new StringBuilder();

        for(int i = input2.length() - 1; i >= 0; --i) {
=======

        String input2 = "racecar";
        System.out.println("Input string: " + input2);

        StringBuilder sb = new StringBuilder();
        for (int i = input2.length() - 1; i >= 0; i--) {
>>>>>>> 11867fbb8735466cf14bda3a85e5b035a2205277
            sb.append(input2.charAt(i));
        }

        String reversed = sb.toString();
        System.out.println("Reversed string: " + reversed);
<<<<<<< HEAD
=======

>>>>>>> 11867fbb8735466cf14bda3a85e5b035a2205277
        if (input2.equals(reversed)) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        System.out.println();
        System.out.println("Use Case 4: Character Array Two-Pointer Palindrome Check");
<<<<<<< HEAD
        String input3 = "radar";
        System.out.println("Input string: " + input3);
        char[] chars = input3.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        boolean isPal;
        for(isPal = true; start < end; --end) {
=======

        String input3 = "radar";
        System.out.println("Input string: " + input3);

        char[] chars = input3.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPal = true;

        while (start < end) {
>>>>>>> 11867fbb8735466cf14bda3a85e5b035a2205277
            if (chars[start] != chars[end]) {
                isPal = false;
                break;
            }
<<<<<<< HEAD

            ++start;
        }

        System.out.println("Is Palindrome? : " + isPal);
        System.out.println();
        System.out.println("Use Case 5: Stack-Based Palindrome Check");
        String input4 = "noon";
        System.out.println("Input string: " + input4);
        Stack<Character> stack = new Stack();

        for(char c : input4.toCharArray()) {
=======
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
>>>>>>> 11867fbb8735466cf14bda3a85e5b035a2205277
            stack.push(c);
        }

        boolean isPalStack = true;

<<<<<<< HEAD
        for(char c : input4.toCharArray()) {
            char top = (Character)stack.pop();
=======
        for (char c : input4.toCharArray()) {
            char top = stack.pop();
>>>>>>> 11867fbb8735466cf14bda3a85e5b035a2205277
            if (c != top) {
                isPalStack = false;
                break;
            }
        }

        System.out.println("Is Palindrome (stack)? : " + isPalStack);
<<<<<<< HEAD
        System.out.println();
        System.out.println("Use Case 6: Queue + Stack Fairness Check");
        String input5 = "civic";
        System.out.println("Input : " + input5);
        Queue<Character> queue = new LinkedList();
        Stack<Character> stack2 = new Stack();

        for(char c : input5.toCharArray()) {
=======

        System.out.println();
        System.out.println("Use Case 6: Queue + Stack Fairness Check");

        String input5 = "civic";
        System.out.println("Input : " + input5);

        java.util.Queue<Character> queue = new java.util.LinkedList<>();
        java.util.Stack<Character> stack2 = new java.util.Stack<>();

        for (char c : input5.toCharArray()) {
>>>>>>> 11867fbb8735466cf14bda3a85e5b035a2205277
            queue.add(c);
            stack2.push(c);
        }

        boolean isPalindromeFair = true;

<<<<<<< HEAD
        while(!queue.isEmpty()) {
            char q = (Character)queue.remove();
            char s = (Character)stack2.pop();
=======
        while (!queue.isEmpty()) {
            char q = queue.remove();
            char s = stack2.pop();
>>>>>>> 11867fbb8735466cf14bda3a85e5b035a2205277
            if (q != s) {
                isPalindromeFair = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindromeFair);
<<<<<<< HEAD
        System.out.println();
        System.out.println("Use Case 7: Deque Based Optimized Palindrome Checker");
        String input6 = "refer";
        System.out.println("Input : " + input6);
        Deque<Character> deque = new ArrayDeque();

        for(char c : input6.toCharArray()) {
=======

        System.out.println();
        System.out.println("Use Case 7: Deque Based Optimized Palindrome Checker");

        String input6 = "refer";
        System.out.println("Input : " + input6);

        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();
        for (char c : input6.toCharArray()) {
>>>>>>> 11867fbb8735466cf14bda3a85e5b035a2205277
            deque.addLast(c);
        }

        boolean isPalDeque = true;

<<<<<<< HEAD
        while(deque.size() > 1) {
            char first = (Character)deque.removeFirst();
            char last = (Character)deque.removeLast();
=======
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();
>>>>>>> 11867fbb8735466cf14bda3a85e5b035a2205277
            if (first != last) {
                isPalDeque = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalDeque);
<<<<<<< HEAD
        System.out.println();
        System.out.println("Use Case 8: Linked List Based Palindrome Checker");
        String input7 = "racecar";
        System.out.println("Input : " + input7);
        Node head = null;
        Node tail = null;

        for(char c : input7.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        Node slow = head;

        for(Node fast = head; fast != null && fast.next != null; fast = fast.next.next) {
            slow = slow.next;
        }

        Node prev = null;

        Node nextNode;
        for(Node current = slow; current != null; current = nextNode) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
        }

        nextNode = head;
        Node secondHalf = prev;

        boolean isLinkedListPalindrome;
        for(isLinkedListPalindrome = true; secondHalf != null; secondHalf = secondHalf.next) {
            if (nextNode.data != secondHalf.data) {
                isLinkedListPalindrome = false;
                break;
            }

            nextNode = nextNode.next;
        }

        System.out.println("Is Palindrome (Linked List)? : " + isLinkedListPalindrome);
        System.out.println();
        System.out.println("Use Case 9: Doubly Linked List Based Palindrome Checker");
        String input8 = "level";
        System.out.println("Input : " + input8);
        DoublyNode headD = null;
        DoublyNode tailD = null;

        for(char c : input8.toCharArray()) {
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

        DoublyNode leftNode = headD;
        DoublyNode rightNode = tailD;

        boolean isDoublyPalindrome;
        for(isDoublyPalindrome = true; leftNode != null && rightNode != null && leftNode != rightNode && rightNode.next != leftNode; rightNode = rightNode.prev) {
            if (leftNode.data != rightNode.data) {
                isDoublyPalindrome = false;
                break;
            }

            leftNode = leftNode.next;
        }

        System.out.println("Is Palindrome (Doubly Linked List)? : " + isDoublyPalindrome);
        System.out.println();
        System.out.println("Use Case 10: Case-Insensitive & Space-Ignored Palindrome Check");
        String input10 = "A man a plan a canal Panama";
        System.out.println("Input : " + input10);

// Normalize string: remove spaces and convert to lowercase
        String normalizedInput = input10.replaceAll("\\s+", "").toLowerCase();

        boolean isPalUC10 = true;
        int left = 0;
        int right = normalizedInput.length() - 1;

// Two-pointer check
        while (left < right) {
            if (normalizedInput.charAt(left) != normalizedInput.charAt(right)) {
                isPalUC10 = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("Is Palindrome (case-insensitive & space-ignored)? : " + isPalUC10);
    }

    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

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
}
=======
    }
}
>>>>>>> 11867fbb8735466cf14bda3a85e5b035a2205277
