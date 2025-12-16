package ArrayListProblems.StudentManagementSystem_Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> al = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("Features");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students Sorted by Name");
            System.out.println("3. View All Students Sorted by Roll Number");
            System.out.println("4. View All Students Sorted by Marks");
            System.out.println("5. Search Student by Roll Number");
            System.out.println("6. Update Student Details");
            System.out.println("7. Delete Student");
            System.out.println("8. Show Top 3 Students");
            System.out.println("9. Calculate Class Average");
            System.out.println("10. Exit");
            System.out.println();
            System.out.println("Enter the Feature number to start:");
            int t = sc.nextInt();
            sc.nextLine();
            
            switch (t) {
                case 1:
                    System.out.println("Enter the Student details");
                    System.out.println("Name");
                    String n = sc.nextLine();
                    System.out.println("RollNo");
                    int r = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Marks");
                    double m = sc.nextDouble();
                    al.add(new Student(n, r, m));
                    System.out.println();
                    break;

                case 2:
                    if (!al.isEmpty()) {
                        System.out.println("All Students Sorted by Name are:");
                        al.sort(new nameCompare());
                        for (Student i : al) {
                            System.out.println(i);
                        }
                    }
                    else {
                        System.out.println("There is no Student data");
                    }
                    break;

                case 3:
                    if (!al.isEmpty()) {
                        System.out.println("All Students Sorted by Roll Number are:");
                        al.sort(new rollNoCompare());
                        for (Student i : al) {
                            System.out.println(i);
                        }
                    }
                    else {
                        System.out.println("There is no Student data");
                    }
                    break;

                case 4:
                    if (!al.isEmpty()) {
                        System.out.println("All Students Sorted by Marks are:");
                        al.sort(new marksCompare());
                        for (Student i : al) {
                            System.out.println(i);
                        }
                    }
                    else {
                        System.out.println("There is no Student data");
                    }
                    break;

                case 5:
                    System.out.println("Enter the Roll Number of the Student to find");
                    int x = sc.nextInt();
                    if (!al.isEmpty()) {
                        boolean notFound = true;
                        for (Student j : al) {
                            if (j.getRollNo() == x) {
                                System.out.println("The student details are:");
                                System.out.println(j);
                                notFound = false;
                                break;
                            }
                        }
                        if (notFound)
                            System.out.println("There is no Student present with Roll No " + x);
                    }
                    else {
                        System.out.println("There is no Student data present with Roll No " + x);
                    }
                    break;

                case 6:
                    System.out.println("Enter the Roll Number of the Student to update the Student details");
                    int z = sc.nextInt();
                    sc.nextLine();
                    if (!al.isEmpty()) {
                        boolean notFound = true;
                        for (Student j : al) {
                            if (j.getRollNo() == z) {
                                System.out.println("Enter the student details to update:");
                                System.out.println("Name");
                                String na = sc.nextLine();
                                System.out.println("Marks");
                                double ma = sc.nextDouble();
                                sc.nextLine();
                                j.setName(na);
                                j.setMarks(ma);
                                System.out.println(j);
                                notFound = false;
                                break;
                            }
                        }
                        if (notFound)
                            System.out.println("There is no Student present with Roll No " + z);
                    }
                    else {
                        System.out.println("There is no Student data present with Roll No " + z);
                    }
                    break;

                case 7:
                    System.out.println("Enter the Roll Number of the Student to Delete");
                    int k = sc.nextInt();
                    if (!al.isEmpty()) {
                        boolean notFound = true;
                        for (int i = 0; i <= al.size()-1; i++) {
                            if (al.get(i).getRollNo() == k) {
                                al.remove(i);
                                notFound = false;
                                break;
                            }
                        }
                        if (notFound)
                            System.out.println("There is no Student present with Roll No " + k);
                    }
                    else {
                        System.out.println("There is no Student data present with Roll No " + k);
                    }
                    break;

                case 8:
                    if (!al.isEmpty()) {

                        al.sort(new marksCompare());

                        if (al.size() >= 3) {
                            System.out.println("The top 3 Students with highest marks are:");
                            for (int i = 0; i <= 3 - 1; i++) {
                                System.out.println(al.get(i));
                            }
                        }
                        else  {
                            System.out.println("Students with highest marks are:");
                            for (int i = 0; i <= al.size()-1; i++) {
                                System.out.println(al.get(i));
                            }
                        }
                    }
                    else {
                        System.out.println("There is no Student data");
                    }
                    break;

                case 9:
                    if (!al.isEmpty()) {
                        double sum = 0;
                        for (Student s : al) {
                            sum += s.getMarks();
                        }
                        double avg = sum / al.size();
                        System.out.println("The total average of the class is: " + avg);
                    }
                    else {
                        System.out.println("There is no Student data");
                    }
                    break;

                case 10:
                    running = false;
                    break;

                default:
                    System.out.println("The tasks are in between 1-10 so enter number accordingly");
                    break;
            }
        }
    }
}
