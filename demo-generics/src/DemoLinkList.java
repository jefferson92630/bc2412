import java.util.LinkedList;

public class DemoLinkList {
  public static void main(String[] args) {
    LinkedList<String> strings = new LinkedList<>();
    strings.add("ABC"); // add() belongs to Collections Family
    strings.add("DEF");
    strings.add("ABC");

    System.out.println(strings.size()); // 3

  }
}
