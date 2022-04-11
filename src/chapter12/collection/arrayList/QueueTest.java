package chapter12.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

class MyQueue {
    private List<String> arrayQueue = new ArrayList<>();

    public void enQueue(String data) {
        arrayQueue.add(data);
    }

    public String deQueue() {
        int len = arrayQueue.size();

        if (len == 0) {
            System.out.println("큐가 비었습니다.");
            return null;
        }

        return arrayQueue.remove(0);
    }
}

public class QueueTest {
    public static void main(String[] args) {

        MyQueue queue = new MyQueue();
        queue.enQueue("a");
        queue.enQueue("b");
        queue.enQueue("c");

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());

    }
}
