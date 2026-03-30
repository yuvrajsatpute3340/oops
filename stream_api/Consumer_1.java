package stream_api;

import java.util.*;
import java.util.function.Consumer;

public class Consumer_1 {

    public static void main(String[] args) {

        // 1D (Student marks)
        List<Integer> student1 = Arrays.asList(50, 60, 70);
        List<Integer> student2 = Arrays.asList(80, 90, 100);

        List<Integer> student3 = Arrays.asList(40, 40, 40);
        List<Integer> student4 = Arrays.asList(30, 30, 30);

        // 2D (Class)
        List<List<Integer>> class1 = new ArrayList<>();
        class1.add(student1);
        class1.add(student2);

        List<List<Integer>> class2 = new ArrayList<>();
        class2.add(student3);
        class2.add(student4);

        // 3D (School)
        List<List<List<Integer>>> school = new ArrayList<>();
        school.add(class1);
        school.add(class2);

        // Consumer call
        Consumer3D consumer = new Consumer3D();
        consumer.accept(school);
    }
}

// 1D Consumer (sum of marks)
class Consumer1D implements Consumer<List<Integer>> {
    public void accept(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        System.out.println("Total Marks: " + sum);
    }
}

// 2D Consumer (class)
class Consumer2D implements Consumer<List<List<Integer>>> {
    public void accept(List<List<Integer>> lists) {
        for (List<Integer> l : lists) {
            new Consumer1D().accept(l);
            System.out.println("-----------");
        }
    }
}

// 3D Consumer (school)
class Consumer3D implements Consumer<List<List<List<Integer>>>> {
    public void accept(List<List<List<Integer>>> lists) {
        for (List<List<Integer>> l : lists) {
            new Consumer2D().accept(l);
            System.out.println("*************");
        }
    }
}