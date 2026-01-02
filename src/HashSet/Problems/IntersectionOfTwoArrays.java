package HashSet.Problems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size and then enter the elements for the First set");
        int n = sc.nextInt();
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i <= n-1; i++) {
            hs.add(sc.nextInt());
        }

        System.out.println("Enter the size and then enter the elements for the Second set");
        int n1 = sc.nextInt();
        Set<Integer> hs1 = new HashSet<>();
        for (int i = 0; i <= n1-1; i++) {
            hs1.add(sc.nextInt());
        }

        for (Integer i : hs) {
            if (hs1.contains(i)) {
                System.out.println(i);
            }
        }
    }
}
