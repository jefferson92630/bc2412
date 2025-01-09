import java.util.HashSet;

public class DemoHashSet {
  
  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    strings.add("ABC");
    strings.add("IJK");
    System.out.println(strings.size()); // 2

    // Difference between HashSet and ArrayList
    System.out.println(strings.add("ABC")); // false
    System.out.println(strings.size()); // 2, HashSet avoid duplicate item

    System.out.println(strings.add("XYZ")); // true
    System.out.println(strings.size()); // 3

    strings.remove("XYZ"); // method is checking value already
    System.out.println(strings.size()); // 2

    // No remove by index method, because HashSet is not ArrayList
    int targetRemoveIndex = 1;
    String targetRemoveString = null;
    int index = 0;
   for (String s: strings) {
      if (targetRemoveIndex == index) {
        targetRemoveString = s;
        break;
      }
      index++;
    }
    System.out.println(targetRemoveString); // "IJK" -> count index: 1
    System.out.println(strings.remove(targetRemoveString)); // true
  }
}
