public class DemoStringBuilder {
  public static void main(String[] args) {
    String s = "hello";
    s += "!!!";
    s += "???";

    s = "";
    System.out.println(System.currentTimeMillis()); // 1737012402294
    long before = System.currentTimeMillis();
    for (int i = 0; i < 100; i++) {
      s += "!";
    }
    
    long after = System.currentTimeMillis();
    System.out.println(after - before); // 634ms


    StringBuilder sb = new StringBuilder("");
    before = System.currentTimeMillis();
    for (int i = 0; i < 100; i++) {
      sb.append("!"); // just like setter
    }
    after = System.currentTimeMillis();
    System.out.println(after - before); // 0ms

    sb = new StringBuilder("abcd");
    sb.reverse(); // String does not have reverse()
    System.out.println(sb); // dcba

    System.out.println(sb.charAt(2)); // b
    sb.replace(0, 2, "yy"); // remember end index is (end - 1)
    System.out.println(sb); // yyba

    sb.deleteCharAt(2);
    System.out.println(sb); // yya

    sb.setCharAt(2, 'o');
    System.out.println(sb); // yyo, 'a' change to 'o'

    sb.insert(1,"!!!");
    System.out.println(sb); // y!!!yo
  }
}
