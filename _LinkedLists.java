import java.util.LinkedList;

public class _LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        /*******************************************************************************/

        //Linked list as a stack(removes the top most/last element)
            // list.push("A");
            // list.push("B");
            // list.push("C");
            // list.push("D");
            // list.push("E");
            // list.push("F");

            // list.pop(); // removes the last element (F)
            // list.pop(); // removes the last element (E)
            // list.pop(); // removes the last element (D)

            // System.out.println(list); 

            /*************************************************************************/

            //Linked list as a queue (removes the first element)
            list.offer("A");
            list.offer("B");
            list.offer("C");
            list.offer("D");
            list.offer("E");
            list.offer("F");

            // list.add(4, "G"); // adds G at index 4
            // list.remove("E");
            // System.out.println(list.indexOf("C")); // returns 2

            System.out.println(list.peekFirst());
            System.out.println(list.peekLast());

            list.addFirst("Z"); // adds Z at the first node
            list.addLast("Y"); // adds Y at the last node


            String First = list.removeFirst(); // removes the first node
            System.out.println(First); // prints the first node

            String Last = list.removeLast(); // removes the last node
            System.out.println(Last); // prints the last node

            // list.poll(); 
            // list.poll(); 
            // list.poll(); 

            System.out.println(list); 
        }
}


/****************************************************************/

/* 
Advantages of LinkedLists
    1.Dynamic Data Structure - Linked lists can grow and shrink in size dynamically, allowing 
                               for efficient memory usage. (Allocates needed memory while running)
    2.Insertion and deletion of a node is easy.  O(1) time complexity.
    3.Linked lists can be used to implement other data structures, such as stacks, queues, and hash tables.
    4.No/Low memory usage

Disadvantages of LinkedLists
    1.Random access is not possible. O(n) time complexity.
    2.Linked lists require more memory than arrays due to the overhead of storing pointers.
    3.Linked lists are less cache-friendly than arrays, which can lead to performance issues in some cases.
    4.Linked lists are more complex to implement and maintain than arrays.
    5. Accessing/Searching is slower than arrays. O(n) time complexity.

Uses ??
    1.Implemet stacks and Queues
    2.GPS Navigation systems
    3.Image Viewer
    4.Music Player

*/
    