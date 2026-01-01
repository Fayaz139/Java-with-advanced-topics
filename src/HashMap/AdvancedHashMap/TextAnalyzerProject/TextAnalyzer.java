package HashMap.AdvancedHashMap.TextAnalyzerProject;

import java.util.*;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean running = true;
        System.out.println("TEXT ANALYZER");
        System.out.println("------------");
        System.out.println("Enter the text to Start!");
        String t = sc.nextLine();
        System.out.println();
        String[] ta = t.split(" ");
        for (int i = 0; i <= ta.length-1; i++) {
            ta[i] = ta[i].toLowerCase(Locale.ROOT);
        }
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i <= ta.length-1; i++) {
            hm.put(ta[i], hm.getOrDefault(ta[i], 0)+1);
        }

        while (running) {
            System.out.println("1. Count Word Frequency");
            System.out.println("2. Find Most Common Word");
            System.out.println("3. Find Least Common Word");
            System.out.println("4. Find Words Appearing N Times");
            System.out.println("5. Display All Words Alphabetically");
            System.out.println("6. Search if Word Exists");
            System.out.println("7. Exit");
            System.out.println();
            System.out.println("which operation do you want to perform");
            int op = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (op) {
                case 1:
                    for (Map.Entry<String, Integer> i : hm.entrySet()) {
                        System.out.println(i);
                    }
                    break;

                case 2:
                    int count = 0;
                    String n = " ";
                    for (Map.Entry<String, Integer> i : hm.entrySet()) {
                        if (count < i.getValue()) {
                            count = i.getValue();
                            n = i.getKey();
                        }
                    }
                    System.out.println("The most common word is " + n + " which is repeated " + count + " times!");
                    break;

                case 3:
                    HashMap<String, Integer> h = new HashMap<>();

//initializing the variable with the max value possible
                    int c = Integer.MAX_VALUE;

//finding the minimum value
                    for (int val : hm.values()) {
                        if (val < c) {
                            c = val;
                        }
                    }

//populating the minimum values to the new hashmap
                    for (Map.Entry<String, Integer> i : hm.entrySet()) {
                        if (i.getValue() == c) {
                            h.put(i.getKey(), i.getValue());
                        }
                    }

//printing the values
                    System.out.println("The least common word/s is/are: ");
                    for (Map.Entry<String, Integer> i : h.entrySet()) {
                        System.out.println(i.getKey() + " -> " + i.getValue());
                    }
                    break;

                case 4:
                    System.out.println("Enter the number to see which words appear at that frequency");
                    int num = sc.nextInt();
                    sc.nextLine();
                    System.out.println();
                    if (hm.containsValue(num)) {
                        for (Map.Entry<String, Integer> i : hm.entrySet()) {
                            if (num == i.getValue()) {
                                System.out.println(i);
                            }
                        }
                    }
                    else {
                        System.out.println("There is no word that appears " + num + " times!");
                    }
                    break;

                case 5:
                    ArrayList<String> al = new ArrayList<>();
                    for (Map.Entry<String, Integer> i : hm.entrySet()) {
                        al.add(i.getKey());
                    }
                    Collections.sort(al);
                    for (int i = 0; i <= al.size()-1; i++) {
                        System.out.println(al.get(i) + " -> " + hm.get(al.get(i)));
                    }
                    break;

                case 6:
                    System.out.println("Enter the word to search");
                    String s = sc.next();
                    s = s.toLowerCase(Locale.ROOT);
                    boolean check = hm.containsKey(s);
                    if (check) {
                        System.out.println("Yes, The word \"" + s + "\" do exist!");
                    }
                    else {
                        System.out.println("No, The word \"" + s + "\" does not exist!");
                    }
                    break;

                case 7:
                    System.out.println("Enter the new text to replace");
                    t = sc.nextLine();
                    ta = t.split(" ");
                    for (int i = 0; i <= ta.length-1; i++) {
                        ta[i] = ta[i].toLowerCase(Locale.ROOT);
                    }
                    hm.clear();
                    for (int i = 0; i <= ta.length-1; i++) {
                        hm.put(ta[i], hm.getOrDefault(ta[i], 0)+1);
                    }
                    break;

                case 8:
                    running = false;
                    break;

                default:
                    System.out.println("You've entered the wrong operation number please type only from 1 - 8 !!");
                    break;
            }

        }
    }
}
