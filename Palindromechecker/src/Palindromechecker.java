import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Palindromechecker {

    public static boolean isPalindrome(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        input = input.toLowerCase().replaceAll("\\s+", "");

        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        sc.close();
    }
}