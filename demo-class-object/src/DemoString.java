public class DemoString {
  public static void main(String[] args) {
    String s = "hello"; // Literal Pool
    String s2 = "hello"; // Literal Pool
    String s3 = s; // s3 and s pointing same object
    String s4 = "hello!";
    String s5 = new String("hello");
    String s6 = String.valueOf("hello"); // leverage literal pool
    String s7 = new String("hello");

    // identityHashCode -> object reference (address)
    System.out.println(System.identityHashCode(s)); // 617901222
    System.out.println(System.identityHashCode(s3)); // 617901222
    System.out.println(System.identityHashCode(s2)); // 617901222
    System.out.println(System.identityHashCode(s4)); // 1159190947
    System.out.println(System.identityHashCode(s5)); // 925858445
    System.out.println(System.identityHashCode(s6)); // 617901222
    System.out.println(System.identityHashCode(s7)); // 798154996

    // equals(), ==

    // If you use "==" for non-primitive, you are checking the object reference
    // Besides, s.equals() is checking the String value itself
    System.out.println(s == s2); // true
    System.out.println(s.equals(s2)); // true

    System.out.println(s == s5); // false
    System.out.println(s.equals(s5)); // true

    System.out.println(s5 == s7); // false
    System.out.println(s5.equals(s7)); // true

    // String is immutable (Purpose: reduce risk)

    // Question: after appending "?", is "s" still the same object? NO.
    s = s + "?";
    System.out.println(System.identityHashCode(s)); // 1450495309



  }
}
