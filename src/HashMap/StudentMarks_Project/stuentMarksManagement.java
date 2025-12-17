package HashMap.StudentMarks_Project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class stuentMarksManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Double> s = new HashMap<>();

        s.put(01, 45.0);
        s.put(81, 99.0);
        s.put(05, 90.0);
        s.put(13, 83.0);
        s.put(06, 70.0);

        System.out.println("Marks of roll number 81 is: " + s.get(81));

        System.out.println(s.containsKey(07));

        double sum = 0;
        for (Double i : s.values()) {
            sum += i;
        }
        double avg = sum/s.size();
        System.out.println("The average is: " + avg);
    }
}
