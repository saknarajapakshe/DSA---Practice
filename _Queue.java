

import java.util.LinkedList;
import java.util.Queue;

public class _Queue {
    public static void main(String[] args) {

        // ******************************************************** */

        // Queue is a FIFO Data Structure.
        // enqueue = offer(); or add();
        // dequeue = poll();
        // peek = peek();
        // isEmpty = isEmpty();
        // search = contains();
        // remove = remove();

        // ****************************************************** */

        // Can not create objects of Queue class directly, because it is an interface.
        Queue<String> queue = new LinkedList<String>() {
            {
                offer("Puppy");
                offer("Kitten");
                offer("Turtle");
                offer("Parrot");
                offer("Fish");
            }
        };

        // System.out.println(queue.peek());
        // System.out.println(queue.poll());
        // System.out.println(queue.peek());

        // System.out.println(queue.isEmpty());
        // System.out.println(queue.size());

        // System.out.println(queue.contains("Fish"));//true

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println(queue.isEmpty());// true
    }

}
