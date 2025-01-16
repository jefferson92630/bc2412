import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class DemoQueue {
  
  public static void main(String[] args) {

    // First in, first out (FIFO)
    
    // Queue is "Parent", LinkedList is "Child", Queue is narrow down the scope
    Queue<String> strings = new LinkedList<>(); // linkedlist -> add/remove head/tail
    // block the method of add head, remove tail in Queue.
    strings.add("Oscar"); // addLast
    strings.add("Vincent"); // addLast
    strings.add("Lucas"); // addLast
    System.out.println(strings); // [Oscar, Vincent, Lucas]

    String head = strings.poll(); // removeFirst
    System.out.println(head); // Oscar
    System.out.println(strings); // [Vincent, Lucas]

    // Queue Interface hidden lots of functions of LinkedList
    strings.remove(); // similar to poll(), but not exactly the same
    System.out.println(strings.contains("Lucas")); // true
    
    // lookup the head element, not pick up
    System.out.println(strings.peek()); // Lucas
    System.out.println(strings.size()); // 1

    // ArrayBlockingQueue
    Queue<String> qq = new ArrayBlockingQueue<>(3); // fixed the length of Queue
    // offer() means insert an element into the queue if space is available
    System.out.println(qq.offer("ABC")); // true
    System.out.println(qq.offer("DEF")); // true
    System.out.println(qq.offer("IJK")); // true
    System.out.println(qq.offer("XYZ")); // false, the queue is full


   // for-each support Queue
    for (String s : strings) {
    System.out.println(s);
  }

    List<String> newStrings = new ArrayList<>();
    newStrings.add("AAA");
    newStrings.add("BBB");
    strings.addAll(newStrings);
    System.out.println(strings); // [Lucas, Jenny, AAA, BBB]


    

  }



}
