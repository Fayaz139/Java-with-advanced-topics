package HashMap.AdvancedHashMap.HashMapOfObjects;

import java.util.HashMap;
import java.util.Scanner;

public class studentDatabase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Students> hm = new HashMap<>();
        hm.put(101, new Students("Fayaz", 94.36));
        hm.put(102, new Students("Riyaz", 89.25));
        hm.put(106, new Students("Ijaz", 79.5));
        hm.put(181, new Students("Atiya Firdose", 100));
        hm.put(107, new Students("Danish", 96.9));

        System.out.println("Enter the roll number to perform the operation");
        int roll = sc.nextInt();
        if (hm.containsKey(roll)) {
            Students s = hm.get(roll);
            System.out.println("1.Search Student by roll number");
            System.out.println("2. Update student marks");
            System.out.println("3. Find all students with marks > 80");
            System.out.println();
            System.out.println("Enter the operation number to continue");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println(s.getName() + " has scored " + s.getMarks() + " marks.");
                    break;

                case 2:
                    System.out.println("Enter the new Marks for roll number " + roll);
                    double marks = sc.nextDouble();
                    System.out.println("marks before updation");
                    System.out.println(s.toString());
                    s.setMarks(marks);
                    System.out.println("marks after updation");
                    System.out.println(s.toString());
                    break;

                case 3:
                    System.out.println("Students with marks greater than 80 are:");
                    for (Students i : hm.values()) {
                        if (i.getMarks() > 80.0) {
                            System.out.println(i.toString());
                        }
                    }
                    break;

                default:
                    System.out.println("You've entered the wrong operation number! try again!!");
            }
        }
        else {
            System.out.println("There is no student with roll number " + roll);
        }
    }
}
