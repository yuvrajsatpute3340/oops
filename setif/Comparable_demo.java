package setif;

import java.util.TreeSet;

public class Comparable_demo {

    public static void main(String[] args) {

        Student_1 first = new Student_1(33, "yuvi");
        Student_1 second = new Student_1(40, "Avi");
        Student_1 third = new Student_1(37, "Aaru");
        Student_1 fourth = new Student_1(35, "samu");
        Student_1 fifth = new Student_1(44, "johan");

        TreeSet<Student_1> set = new TreeSet<>();

        set.add(first);
        set.add(second);
        set.add(fourth);
        set.add(third);
        set.add(fifth);

        System.out.println(set);
    }
}

class Student_1 implements Comparable<Student_1> {

    int mark;
    String name;

    public Student_1(int mark, String name) {
        this.mark = mark;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.mark + " " + this.name;
    }

    @Override
    public int compareTo(Student_1 o) {
        System.out.println("TreeSet is calling the compareTo() method to decide the order...");
        return Integer.compare(this.mark, o.mark); 
    }
}
