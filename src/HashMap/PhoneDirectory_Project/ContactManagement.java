package HashMap.PhoneDirectory_Project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> c = new HashMap<>();

        boolean running = true;

        while (running) {
            System.out.println("Features:");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact by Name");
            System.out.println("3. Update Phone Number");
            System.out.println("4. Delete Contact");
            System.out.println("5. Show All Contact");
            System.out.println("6. Count Total Contacts");
            System.out.println("7. Check if Contact Exists");
            System.out.println("8. Exit");
            System.out.println();

            System.out.println("Enter the feature number to start:");
            int t = sc.nextInt();
            sc.nextLine();

            switch (t) {
                case 1:
                    System.out.println("Enter the name of the Contact:");
                    String s = sc.nextLine();
                    System.out.println("Enter the Phone number of the Contact:");
                    String p = sc.nextLine();
                    c.put(s, p);
                    break;

                case 2:
                    System.out.println("Enter the name of the contact to Search:");
                    String n = sc.nextLine();
                    if (c.containsKey(n)) {
                        System.out.println(c.get(n));
                    }
                    else  {
                        System.out.println("No Contact exist with name " + n);
                    }
                    break;

                case 3:
                    System.out.println("Enter the name of the contact to Update the Phone number:");
                    String cn = sc.nextLine();
                    if (c.containsKey(cn)) {
                        System.out.println("Enter the new Phone Number:");
                        String no = sc.nextLine();
                        c.put(cn, no);
                        System.out.println("Contact updated Successfully!");
                    }
                    else {
                        System.out.println("No Contact exist with name " + cn);
                    }
                    break;

                case 4:
                    System.out.println("Enter the name of the contact to Delete the Contact:");
                    String cna = sc.nextLine();
                    if (c.containsKey(cna)) {
                        c.remove(cna);
                        System.out.println("Contact Deleted Successfully!");
                    }
                    else {
                        System.out.println("No Contact exist with name " + cna);
                    }
                    break;

                case 5:
                    if (c.size() >= 1) {
                        System.out.println("All Contacts:");
                        for (Map.Entry<String, String> i : c.entrySet()) {
                            System.out.println("Name: " + i.getKey() + "-> Number: " + i.getValue());
                        }
                    }
                    else  {
                        System.out.println("Phone Book is Empty");
                    }
                    break;

                case 6:
                    if (c.size() >= 1) {
                        System.out.println("The total number of Contacts are: " + c.size());
                    }
                    else {
                        System.out.println("Phone Book is Empty");
                    }
                    break;

                case 7:
                    if (c.size() >= 1) {
                        System.out.println("Enter the Name of Contact to search");
                        String cnam = sc.nextLine();
                        if (c.containsKey(cnam)) {
                            System.out.println(c.get(cnam));
                        }
                        else {
                            System.out.println("No Contact exist with name " + cnam);
                        }
                    }
                    else {
                        System.out.println("Phone Book is Empty");
                    }
                    break;

                case 8:
                    running = false;
                    break;

                default:
                    System.out.println("The tasks are in between 1-8 so enter number accordingly");
                    break;
            }
        }
    }
}
