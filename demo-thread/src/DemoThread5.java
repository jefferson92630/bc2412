import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DemoThread5 {
  private Map<Integer, String> map; // HashMap is not thread-safe

  // Solution
  public DemoThread5() {
    // this.map = new HashMap<>(); not thread-safe
    this.map = new Hashtable<>(); // HashMap = Array + LinkedList
  }

  // Thread-safe: Hashtable, ConcurrentHashMap, Collections.synchronizedMap(new HashMap<>())

  public String put(Integer key, String value) {
    return this.map.put(key, value);
  }

  public int size() {
    return this.map.size();
  }


  public static void main(String[] args) {

    DemoThread5 central = new DemoThread5();

    Runnable putEntryTask1 = () -> {
      for (int i = 0; i < 1000000; i++) {
        central.put(i, "abc");
      }
    };

    Runnable putEntryTask2 = () -> {
      for (int i = 1000000; i < 2000000; i++) {
        central.put(i, "abc");
      }
    };

    Thread workerB = new Thread(putEntryTask1);
    workerB.start();  // main thread initialize another thread to execute the task (workerB)
    // The workerB execute the task ONLY.

    Thread workerC = new Thread(putEntryTask2);
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
