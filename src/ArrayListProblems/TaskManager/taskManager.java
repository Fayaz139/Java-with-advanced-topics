package ArrayListProblems.TaskManager;

import java.util.ArrayList;
import java.util.Scanner;

public class taskManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> al = new ArrayList<>();
        ArrayList<String> cl = new ArrayList<>();

        boolean running = true;
        while (running) {
            System.out.println("Features:");
            System.out.println("1. Add task");
            System.out.println("2. View all tasks");
            System.out.println("3. Delete task by number");
            System.out.println("4. Mark task as complete");
            System.out.println("5. View all completed tasks");
            System.out.println("6. Exit");

            int t = sc.nextInt();
            sc.nextLine();

            switch (t) {
                case 1:
                    System.out.println("Enter the task");
                    String task = sc.nextLine();
                    al.add(task);
                    System.out.println();
                    System.out.println("Do you want to continue? y/n");
                    char a = sc.next().charAt(0);
                    if (a == 'y') {
                        break;
                    }
                    else if (a == 'n') {
                        running = false;
                        break;
                    }
                    else {
                        System.out.println("Enter either 'y' or 'n'");
                        break;
                    }

                case 2:
                    if (!al.isEmpty()) {
                        for (String i : al) {
                            System.out.println(i);
                        }
                    } else {
                        System.out.println("There are no tasks");
                    }
                    System.out.println();
                    System.out.println("Do you want to continue? y/n");
                    char b = sc.next().charAt(0);
                    if (b == 'y') {
                        break;
                    }
                    else if (b == 'n') {
                        running = false;
                        break;
                    }
                    else {
                        System.out.println("Enter either 'y' or 'n'");
                        break;
                    }

                case 3:
                    if (!al.isEmpty()) {
                        System.out.println("Enter the task number which you want to delete");
                        int tn = sc.nextInt();
                        if (tn <= al.size() && tn > 0) {
                            al.remove(tn - 1);
                        } else {
                            System.out.println("Enter the correct number");
                        }
                    } else {
                        System.out.println("There are no tasks available to delete");
                    }
                    System.out.println();
                    System.out.println("Do you want to continue? y/n");
                    char c = sc.next().charAt(0);
                    if (c == 'y') {
                        break;
                    }
                    else if (c == 'n') {
                        running = false;
                        break;
                    }
                    else {
                        System.out.println("Enter either 'y' or 'n'");
                        break;
                    }

                case 4:
                    if (!al.isEmpty()) {
                        System.out.println("Enter the task number which you want to mark complete");
                        int tn = sc.nextInt();
                        if (tn <= al.size() && tn > 0) {
                            cl.add(al.remove(tn - 1));
                            System.out.println("Your completed tasks are:");
                            for (String i : cl) {
                                System.out.println(i);
                            }
                        } else {
                            System.out.println("Enter the correct number");
                        }
                    } else {
                        System.out.println("There are no tasks available to mark as complete");
                    }
                    System.out.println();
                    System.out.println("Do you want to continue? y/n");
                    char d = sc.next().charAt(0);
                    if (d == 'y') {
                        break;
                    }
                    else if (d == 'n') {
                        running = false;
                        break;
                    }
                    else {
                        System.out.println("Enter either 'y' or 'n'");
                        break;
                    }

                case 5:
                    if (!cl.isEmpty()) {
                        for (String j : cl) {
                            System.out.println(j);
                        }
                    } else {
                        System.out.println("There are no tasks");
                    }
                    System.out.println();
                    System.out.println("Do you want to continue? y/n");
                    char x = sc.next().charAt(0);
                    if (x == 'y') {
                        break;
                    }
                    else if (x == 'n') {
                        running = false;
                        break;
                    }
                    else {
                        System.out.println("Enter either 'y' or 'n'");
                        break;
                    }

                case 6:
                    running = false;
                    break;

                default:
                    System.out.println("The tasks are in between 1-6 so enter number accordingly");
                    break;
            }
        }
    }
}