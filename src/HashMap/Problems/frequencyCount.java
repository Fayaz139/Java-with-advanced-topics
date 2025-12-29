package HashMap.Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class frequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter the number of elements you want to enter");
        int n = sc.nextInt();
        for (int i = 0; i <= n-1; i++) {
            al.add(sc.nextInt());
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (Integer i : al) {
            if (!hm.containsKey(i)) {
                hm.put(i, 1);
            }
            else {
                hm.put(i, hm.get(i) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> i : hm.entrySet()) {
            System.out.println(i);
        }
    }
}
