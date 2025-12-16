package ArrayListProblems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

        System.out.println("Enter the number of elements");
        int b = sc.nextInt();

        for (int i = 0; i <= b-1; i++) {
            al.add(sc.nextInt());
        }

        int min = al.get(0);
        int max = al.get(0);

        for (int i : al) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("The minimum is " + min);
        System.out.println("The maximum is " + max);
    }
}
