package Stack.Problems;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Parenthesis you want to validate");
        String str = sc.next();
        char[] c = str.toCharArray();
        boolean valid = true;

        Stack<Character> s = new Stack<>();

        for (int i = 0; i <= c.length-1; i++) {
            if (c[i] == '(' || c[i] == '{' || c[i] == '[') {
                s.push(c[i]);
            }
            else {
                if (!s.isEmpty()) {
                    if (s.peek() == '(' && c[i] == ')' || s.peek() == '[' && c[i] == ']' || s.peek() == '{' && c[i] == '}' ) {
                        s.pop();
                    }
                    else if (c[i] == '(' || c[i] == '{' || c[i] == '[') {
                        s.push(c[i]);
                    }
                    else {
                        valid = false;
                        break;
                    }
                }
                else {
                    valid = false;
                    break;
                }
            }
        }

        if (s.isEmpty() && valid) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
