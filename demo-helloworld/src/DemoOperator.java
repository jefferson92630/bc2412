public class DemoOperator {
  public static void main(String[] args) {
    int x = 3;
    x = x + 1;
    x++; // add one time
    ++x; // add one time
    x += 1; // += means x = x + 1
    System.out.println(x); // 7

    // - 1
    int y = 10;
    y = y - 1;
    y--;
    --y;
    y -= 1;
    System.out.println(y); // 6

    // + 2
    int b = 20;
    b = b + 2;
    b += 2;
    System.out.println(b);

    // - 2
    int c = 100;
    c = c - 2;
    c-= 2;
    System.out.println(c); // 96

    // *=, /=
    int m = 5;
    m = m * 2;
    m *= 2;
    System.out.println(m); // 20

    int u = 4;
    u = u / 2;
    u /= 2;
    System.out.println(u); // 1

    int remainder = 10 % 3;
    System.out.println(remainder); // 1

    // ++x vs x++
    int a = 8;
    int result1 = ++a + 3; // a + 1 + 3 for result1
    System.out.println(result1); // 12
    // Step 1: a become 9
    // Step 2: a + 3 (9 + 3)
    // Step 3: assign 12 to result1

    int q = 8;
    int result2 = q++ + 3; // = q + 3 for result2 & q + 1 for q
    System.out.println(result2); // 11, q add 3 first and then assign to result2, and then add itself by 1.
    System.out.println(q); // 9
    // Step 1: q + 3 (8 + 3)
    // Step 2: assign 11 to result2
    // Step 3: q become 9
    
    // String +=
    String s = "hello";
    s += "!";
    System.out.println(s); // hello!
    // int + double -> double
    // String + anything -> String

    s += 'a';
    System.out.println(s); // hello!a

    s += 1;
    System.out.println(s); // hello!a1

    s += true;
    System.out.println(s); // hello!a1true

    int x11 = 3;
    int y11 = (x11++ + 3) * x11++;
    System.out.println(y11); // 24
    System.out.println(x11); // 5
    // Step 1: 3 + 3
    // Step 2: x11 become 4
    // Step 3: 6 * 4
    // Step 4: assignment, after finish all the operation
    // Step 5: x11 become 5

    int y12 = (++x11 + 4) * x11++;
    System.out.println(y12); // 60
    System.out.println(x11); // 7
    // Step 1: 6 + 4
    // Step 2: 10 * 6 = 60 (y12)
    // Step 3: assignment to x11
    // Step 4: x11 become 7

    int x12 = 4;
    int y13 = (++x12 + 4) * x12++;
    System.out.println(y13); // 45
    System.out.println(x12); // 6
  }
}
