package queue_interface;

import java.util.Queue;
import java.util.LinkedList;

class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q);       // [10, 20, 30]
        System.out.println(q.poll()); // 10
        System.out.println(q.peek()); // 20
    }
}

