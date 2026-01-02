package HashSet.Problems;

import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements and then enter the elements");
        int n = sc.nextInt();

        HashSet<Integer> hs = new HashSet<>();

        boolean status = false;
        for (int i = 0; i <= n-1; i++) {
            if (!hs.add(sc.nextInt())) {
                status = true;
                break;
            }
        }

        System.out.println(status);
    }
}
