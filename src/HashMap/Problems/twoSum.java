package HashMap.Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        for (int i = 0; i <= n-1; i++) {
            al.add(sc.nextInt());
        }
        System.out.println("Enter the target sum");
        int target = sc.nextInt();

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i <= al.size()-1; i++) {
            if (!hm.containsKey(target-al.get(i))) {
                hm.put(al.get(i), i);
            }
            else {
                System.out.println((target-al.get(i)) + " " + al.get(i));
                break;
            }
        }
    }
}
