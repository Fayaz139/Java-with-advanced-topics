package ArrayListProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class removeDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> al = new ArrayList<>();
        ArrayList<String> ul = new ArrayList<>();

        System.out.println("Enter the number of elements");
        int a = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i <= a-1; i++) {
            al.add(sc.next());
        }

        for (int i = 0; i <= a-1; i++) {
            if (ul.contains(al.get(i))) {
                continue;
            }
            else {
                ul.add(al.get(i));
            }
        }
        
        System.out.println(ul);
    }
}
