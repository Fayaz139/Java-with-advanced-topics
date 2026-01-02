package HashSet.Problems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> hs = new HashSet<>();

        System.out.println("Enter the number of elements you want to enter");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        for (int i = 0; i <= n-1; i++) {
            hs.add(sc.nextInt());
        }

        System.out.println(hs);
    }
}
