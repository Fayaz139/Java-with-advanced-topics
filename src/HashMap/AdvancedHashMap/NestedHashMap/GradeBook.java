package HashMap.AdvancedHashMap.NestedHashMap;

import java.util.HashMap;
import java.util.Scanner;

public class GradeBook {
    public static void main(String[] args) {

        HashMap<String, HashMap<String, Double>> gb = getStringHashMapHashMap();

        Double aliceMath = gb.get("Alice").get("Math");
        System.out.println("Alice has Scored " + aliceMath + " marks in Math.");

        Double sum = 0.0;
        for (Double i : gb.get("Alice").values()) {
            sum += i;
        }
        double aliceAvg = sum/gb.get("Alice").size();
        System.out.println("Alice's average is " + aliceAvg);

        Double highest = 0.0;
        for (HashMap<String, Double> i : gb.values()) {
            if (i.get("Math") > highest) {
                highest = i.get("Math");
            }
        }
        for (String i : gb.keySet()) {
            if (gb.get(i).get("Math") == highest) {
                System.out.println(i + " has Scored highest in Math with the score of " + highest + " marks.");
                break;
            }
        }
    }

    private static HashMap<String, HashMap<String, Double>> getStringHashMapHashMap() {
        HashMap<String, HashMap<String, Double>> gb = new HashMap<>();

        HashMap<String, Double> am = new HashMap<>();
        am.put("Math", 85.0);
        am.put("Science", 90.0);
        am.put("English", 88.0);
        HashMap<String, Double> bm = new HashMap<>();
        bm.put("Math", 49.0);
        bm.put("Science", 83.2);
        bm.put("English", 99.6);
        HashMap<String, Double> jm = new HashMap<>();
        jm.put("Math", 99.6);
        jm.put("Science", 100.0);
        jm.put("English", 77.01);

        gb.put("Alice", am);
        gb.put("Bob", bm);
        gb.put("John", jm);
        return gb;
    }
}
