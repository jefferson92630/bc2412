

public class JavaQuest6 {
  /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ...
   * 
   */
  public static void main(String[] args) {
    int first = 0, second = 1;
    System.out.println(first);
    System.out.println(second);

    int next = 0;
    int next2 = 0;
    // for loop to print first 15 numbers in Fibonacci Sequence
    for (int i = 0; i < 100; i++) {
    
    next = first + second;
    next2 = next + next;
    System.out.println(next + next2);

    }
  }
}