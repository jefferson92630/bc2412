public class DemoThread {

// main thread (Worker A)
// Another thread (Worker B)
  public static void main(String[] args) {
    int x = 3;
    x++;
    ++x;
    x += 1;
    System.out.println(x); // 6

    // Create another thread.
    // 1. Task, 2. Thread.
    Runnable sayHelloTask = () -> System.out.println("hello");
    StringBuilder sb = new StringBuilder("");
    Runnable concatStringMillionTimes = () -> {
    for (int i = 0 ; i < 1_000_000; i++) {
      sb.append("!");
    }
   // System.out.println(sb.length()); // 1,000,000, executed by Worker B
  };

    Thread workerB = new Thread(concatStringMillionTimes); // () place task
    workerB.start(); // main thread (workerA) executes a new thread (Worker B)
    // main thread proceed its own task
    System.out.println(sb.length()); // 0, executed by Worker A (main thread), because this commmend may runs faster than Worker B

    System.out.println("Program end.");
  }
}
