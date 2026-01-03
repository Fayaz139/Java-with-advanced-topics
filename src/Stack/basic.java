package Stack;

import java.util.Stack;

public class basic {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(9);
        s.push(45);
        s.push(4);
        s.push(7);

        System.out.println(s);

        s.pop();
        s.pop();

        System.out.println(s.peek());

        System.out.println(s.size());
        System.out.println(s);
    }
}
