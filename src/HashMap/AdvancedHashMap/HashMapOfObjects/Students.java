package HashMap.AdvancedHashMap.HashMapOfObjects;

public class Students {
    String name;
    double marks;

    public Students() {
    }

    public Students(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Students{" +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
