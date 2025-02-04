import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

// Solution
// 1. Native Data Structure (Vector)
public class DemoThread4 {
  private List<Integer> integers; // Not thread-safe

  public DemoThread4() {
    this.integers = new Vector<>(); // Polymorphism
  }

 // public ArrayList<Integer> getIntegers() {
 //   return this.integers;
 // }

 public boolean add(Integer integer) {
  return this.integers.add(integer); // lock this line of code
 }

 public int size() {
  return this.integers.size();
 }

  public static void main(String[] args) {
    DemoThread4 central = new DemoThread4();

    Runnable addMillionElements = () -> {
      for (int i = 0; i < 1000000; i++) {
        central.add(i);
      }
    };

    Thread workerB = new Thread(addMillionElements);
    workerB.start();  // main thread initialize another thread to execute the task (workerB)
    // The workerB execute the task ONLY.

    Thread workerC = new Thread(addMillionElements);
    workerC.start();  // main thread initialize another thread to execute the task (workerC)
    // The workerC execute the task ONLY.

    // Main thread
    try {
      workerB.join(); // main thread wait until workerB complete the task
      workerC.join(); // main thread wait until workerC complete the task
    } catch (InterruptedException e) {

    }
    System.out.println(central.size());
  }
  
}
