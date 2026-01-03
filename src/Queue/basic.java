package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class basic {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();

        q.offer("Fayaz");
        q.offer("Ijaz");
        q.offer("Riyaz");
        q.offer("Imran");
        q.offer("Danish");

        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q.poll());

        System.out.println(q.peek());

        System.out.println(q.size());
        System.out.println(q);
    }
}
