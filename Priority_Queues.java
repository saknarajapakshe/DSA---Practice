import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queues {
    public static void main(String[] args){
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("A");
        queue.offer("X");
        queue.offer("C");
        queue.offer("Y");
        queue.offer("a");
        queue.offer("Z");

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        // queue.offer("A");
        // queue.offer("K");
        // System.out.println(queue.peek());// A
        
    }
    
}
