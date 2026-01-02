package HashSet.EmailCollector_Project;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class UniqueEmailCollector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<String> hs = new HashSet<>();
        HashMap<String, Integer> dup = new HashMap<>();

        boolean running  = true;
        System.out.println("=========================");
        System.out.println("EMAIL COLLECTOR");
        System.out.println("=========================");
        int validEmail = 0;
        int duplicateEmail = 0;
        int invalidEmail = 0;
        int totalAttempts = 0;

        while (running) {
            System.out.println("1. Add Email");
            System.out.println("2. Remove Email");
            System.out.println("3. Check if Email Exists");
            System.out.println("4. Count Total Emails");
            System.out.println("5. Display All Emails");
            System.out.println("6. Find Duplicate Attempts");
            System.out.println("7. Clear All Emails");
            System.out.println("8. Exit");
            System.out.println();
            System.out.println("Enter the operation number which you want to continue");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Enter the Email you want to store");
                    String email = sc.nextLine();
                    email = email.toLowerCase();
                    boolean valid = email.contains("@");
                        if (hs.contains(email)) {
                            dup.put(email, dup.getOrDefault(email, 0) + 1);
                            duplicateEmail += 1;
                            totalAttempts += 1;
                            System.out.println("The Email: \"" + email + "\" already exist, try different one!!");
                        } else {
                            if (valid) {
                                hs.add(email);
                                validEmail += 1;
                                totalAttempts += 1;
                                System.out.println("\"" + email + "\" Added Successfully!");
                            }
                            else {
                                invalidEmail += 1;
                                totalAttempts += 1;
                                System.err.println("The Email is in wrong format!!");
                            }
                        }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter the Email you wish to Remove");
                    String a = sc.nextLine().toLowerCase();
                    if (hs.contains(a)) {
                        hs.remove(a);
                        dup.remove(a);
                        System.out.println("Successfully Removed \"" + a + "\"");
                    }
                    else {
                        System.err.println("The Email you've entered does not exist in the Records!");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Enter the Email you want Search");
                    String aa = sc.nextLine().toLowerCase();
                    if (hs.contains(aa)) {
                        System.out.println("Yes! the Email you've entered do exist in the Records.");
                    }
                    else {
                        System.err.println("The Email you've entered does not exist in the Records!");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("There are \"" + hs.size() + "\" Unique Emails Stored in the Records!");
                    System.out.println("There are \"" + duplicateEmail + "\" Duplicate Emails Attempted to add in the Records!");
                    System.out.println("There are \"" + invalidEmail + "\" Invalid Emails  Attempted to add in the Records!");
                    System.out.println();
                    break;

                case 5:
                    int j = 0;
                    if (!hs.isEmpty()) {
                        for (String i : hs) {
                            System.out.println(j + 1 + ". " + i);
                            j++;
                        }
                    }
                    else {
                        System.out.println("There are no Emails to be displayed!!");
                        System.err.println("The Records are Empty!!");
                    }
                    System.out.println();
                    break;

                case 6:
                    if(!dup.isEmpty()) {
                        System.out.println("The emails that were attempted to add multiple times are:");
                        for (Map.Entry<String, Integer> i : dup.entrySet()) {
                            System.out.println("Email: \"" + i.getKey() + "\" was duplicated \"" + i.getValue() + "\" times!");
                        }
                    }
                    else {
                        System.err.println("No email was attempted to store more than once!");
                    }
                    System.out.println();
                    break;

                case 7:
                    hs.clear();
                    dup.clear();
                    validEmail = 0;
                    duplicateEmail = 0;
                    invalidEmail = 0;
                    totalAttempts = 0;
                    System.out.println("The Records are Empty!!");
                    System.out.println();
                    break;

                case 8:
                    running = false;
                    break;

                default:
                    System.err.println("You've entered the wrong operation number please type only from 1 - 8 !!");
                    System.out.println();
                    break;
            }
        }
    }
}
