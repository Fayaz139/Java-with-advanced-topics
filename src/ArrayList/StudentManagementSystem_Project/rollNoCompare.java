package ArrayList.StudentManagementSystem_Project;

import java.util.Comparator;

public class rollNoCompare implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getRollNo(), o1.getRollNo());
    }
}
