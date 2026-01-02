package HashSet;

import java.util.HashSet;

public class basic {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(20);
        hs.add(99);
        hs.add(93);
        hs.add(73);
        hs.add(86);
        System.out.println(hs);

        boolean a = hs.contains(30);
        System.out.println(a);
        boolean c = hs.remove(93);
        System.out.println(c);
    }
}
