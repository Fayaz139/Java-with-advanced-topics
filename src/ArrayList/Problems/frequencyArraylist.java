package ArrayList.Problems;

import java.util.ArrayList;

public class frequencyArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> ul = new ArrayList<>();
        ArrayList<Integer> fl = new ArrayList<>();

        al.add(5);
        al.add(12);
        al.add(5);
        al.add(10);
        al.add(12);
        al.add(5);
        al.add(10);
        al.add(8);

        for (Integer i : al) {
            if (!ul.contains(i)) {
                ul.add(i);
            }
            else {
                continue;
            }
        }

        int count = 0;
        for (Integer i: ul) {
            for (int j = 0; j <= al.size()-1; j++) {
                if (i == al.get(j)) {
                    count++;
                }
                else {
                    continue;
                }
            }
            fl.add(count);
            count = 0;
        }

        for (int i = 0; i <= ul.size()-1; i++) {
            System.out.println("Element " + ul.get(i) + " occurs " + fl.get(i) + "-times");
        }
    }
}
