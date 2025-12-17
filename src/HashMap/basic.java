package HashMap;

import java.util.HashMap;
import java.util.Map;

public class basic {
    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<>();
        hm.put("2JH21CS081", "Fayaz");
        hm.put("2JH21CS001", "Abdul");
        hm.put("2JH21CV005", "Junaid");

//        System.out.println(hm.get("2JH21CS081"));
//        System.out.println(hm.containsKey("2JH21CS081"));
//        System.out.println(hm.containsValue("Fayaz"));
//        System.out.println(hm);
//        System.out.println(hm.size());
//        System.out.println(hm.remove("2JH21CS081"));
//        System.out.println(hm);
//        System.out.println(hm.size());

        System.out.println("Print key value set");
        for (Map.Entry<String, String> i : hm.entrySet()) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Print only keys");
        for (String i : hm.keySet()) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Print only values");
        for (String i : hm.values()) {
            System.out.println(i);
        }
    }
}
