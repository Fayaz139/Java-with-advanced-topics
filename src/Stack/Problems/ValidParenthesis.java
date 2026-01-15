package Stack.Problems;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> ch = new Stack<>();

        String s = sc.next();
        char[] c = s.toCharArray();
        boolean valid = true;

        for (int i = 0; i <= c.length - 1; i++) {
            if (c[i] == '{' || c[i] == '[' || c[i] == '(') {
                ch.push(c[i]);
            } else if (c[i] == '}' || c[i] == ']' || c[i] == ')') {
                if (ch.isEmpty()) {
                    valid = false;
                    break;
                }

                if (c[i] == '}' && ch.peek() == '{' || c[i] == ']' && ch.peek() == '[' || c[i] == ')' && ch.peek() == '(') {
                    ch.pop();
                }
                else {
                    valid = false;
                    break;
                }
            }
        }

        if (ch.isEmpty() && valid) {
            System.out.println("Valid Braces Format");
        } else {
            System.out.println("Invalid Braces Format");
        }
    }
}