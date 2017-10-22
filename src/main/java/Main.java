import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue();

        System.out.println("priorityQueue: " + priorityQueue);
        System.out.println("priorityQueue size: " + priorityQueue.size());
        System.out.println("priorityQueue is empty: " + priorityQueue.isEmpty());

        priorityQueue.add(11);
        priorityQueue.add(13);
        priorityQueue.add(15);
        priorityQueue.add(15);
        priorityQueue.offer(16);
        priorityQueue.offer(18);
        priorityQueue.offer(18);
        priorityQueue.offer(22);

        System.out.println("------------------------------------------");
        System.out.println("priorityQueue: " + priorityQueue);
        System.out.println("priorityQueue size: " + priorityQueue.size());
        System.out.println("priorityQueue is empty: " + priorityQueue.isEmpty());

        System.out.println("------------------------------------------");
        System.out.println("priorityQueue: " + priorityQueue);
        System.out.println("priorityQueue.element(): " + priorityQueue.element());
        System.out.println("priorityQueue.peek(): " + priorityQueue.peek());
        System.out.println("priorityQueue.poll(): " + priorityQueue.poll());
        System.out.println("priorityQueue: " + priorityQueue);
        System.out.println("priorityQueue.remove(): " + priorityQueue.remove());
        System.out.println("priorityQueue: " + priorityQueue);

        priorityQueue.clear();

        System.out.println("------------------------------------------");
        System.out.println("priorityQueue: " + priorityQueue);
        System.out.println("priorityQueue size: " + priorityQueue.size());
        System.out.println("priorityQueue is empty: " + priorityQueue.isEmpty());
    }

}
