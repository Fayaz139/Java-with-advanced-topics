package ArrayList;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class basic {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(25);
        al.add(58);
        al.add(46);
        al.add(8);
        al.add(9);

        System.out.println(al);

        al.remove(3);

        for (int i : al) {
            System.out.println(i);
        }

        System.out.println(al.contains(9));

        System.out.println(al.size());

        System.out.println(al.isEmpty());
    }
}