package ArrayList.Problems;

import java.util.ArrayList;

public class reverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> cl = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        for (int i = al.size()-1; i >= 0; i--) {
            cl.add(al.get(i));
        }

//        Collections.reverse(al);
        System.out.println(cl);
    }
}
