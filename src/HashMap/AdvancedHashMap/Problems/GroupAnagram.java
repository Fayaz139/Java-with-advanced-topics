package HashMap.AdvancedHashMap.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GroupAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to enter");
        int n = sc.nextInt();

        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i <= n-1; i++) {
            al.add(sc.next());
        }


        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        for (int i = 0; i <= n-1; i++) {
            char[] ch = al.get(i).toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            if (!hm.containsKey(str)) {
                ArrayList<String> a = new ArrayList<>();
                a.add(al.get(i));
                hm.put(str, a);
            }
            else {
                hm.get(str).add(al.get(i));
            }
        }

        for (ArrayList<String> i : hm.values()) {
            System.out.println(i);
        }
    }
}
