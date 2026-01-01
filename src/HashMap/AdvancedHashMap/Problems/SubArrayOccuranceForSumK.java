package HashMap.AdvancedHashMap.Problems;

import java.util.HashMap;
import java.util.Scanner;

public class SubArrayOccuranceForSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to enter");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements");
        int[] a = new int[n];
        for (int i = 0; i <= n-1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the sum to find the subarray");
        int k = sc.nextInt();

        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int prefixSum = 0;
        int count = 0;
        for (int i = 0; i <= n-1; i++) {
            prefixSum += a[i];
            if (hm.containsKey(prefixSum-k)) {
                count += hm.get(prefixSum-k);
            }
            hm.put(prefixSum, hm.getOrDefault(prefixSum, 0)+1);

        }
        System.out.println(count);
    }
}


