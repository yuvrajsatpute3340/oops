package queue_interface;

import java.util.Queue;
import java.util.ArrayDeque;

class Example3 {
    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println(queue);        // [A, B, C]
        System.out.println(queue.remove()); // A
    }
}
