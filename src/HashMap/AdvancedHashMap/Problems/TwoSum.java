package HashMap.AdvancedHashMap.Problems;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to insert");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        int[] a = new int[n];
        for (int i = 0; i <= a.length-1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the sum");
        int k = sc.nextInt();

        HashMap<Integer, Integer> hm = new HashMap<>();
        int needed = 0;
        for (int i = 0; i <= a.length-1; i++) {
            needed = k - a[i];
            if (hm.containsKey(needed)) {
                System.out.println(i + " " + hm.get(needed));
                System.out.println(a[i] + " " + needed);
                break;
            }
            hm.put(a[i], i);
        }
    }
}
