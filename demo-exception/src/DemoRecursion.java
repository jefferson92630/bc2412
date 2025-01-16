public class DemoRecursion {
  public static void main(String[] args) {
    // 1 + 2 + 3 + 4 + .... + 10
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
    }
    System.out.println(sum);

    // Recursion
    System.out.println(sum(10)); // 55

   // 1 * 3 * 5 * 7 * ....＊n
  int n = 8;
  int result = n % 2 == 1 ? product(n) : product(n - 1);
  System.out.println(result); // 105

  }

  public static int product(int n) {
    if (n <= 1)
    return 1;
    return n * product(n - 2);
 }

  public static int sum(int value) {
    // base criteria for exit, or otherwise will cause infinity loop.
    if (value <= 1)
    return value;
    // invoke myself
    return value + sum(value - 1);
  }
}
