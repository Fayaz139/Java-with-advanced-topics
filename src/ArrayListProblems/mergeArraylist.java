package ArrayListProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class mergeArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> bl = new ArrayList<>();
        ArrayList<Integer> ml = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        bl.add(15);
        bl.add(25);
        bl.add(35);
        bl.add(45);
        bl.add(55);

        ml.addAll(al);
        ml.addAll(bl);

        Collections.sort(ml);
        System.out.println(ml);
    }
}
