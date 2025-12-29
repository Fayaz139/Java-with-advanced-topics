package HashMap.Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class firstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();

        HashMap<Character, Integer> hm = new HashMap<>();
        for (Character i : c) {
            if (!hm.containsKey(i)) {
                hm.put(i, 1);
            }
            else {
                hm.put(i, hm.get(i)+1);
            }
        }

        for (int i = 0; i <= c.length-1; i++) {
            if (hm.get(c[i]) == 1) {
                System.out.println(c[i]);
                break;
            }
        }
    }
}
