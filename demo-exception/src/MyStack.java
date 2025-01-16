import java.util.LinkedList;

public class MyStack<T> {
  private LinkedList<T> linkedlist;
  // Last in First out
  // in -> push
  // out -> pop

    public T pop() {
      return this.linkedlist.pollLast();
    }

    public void push(T data) {
      this.linkedlist.addLast(data);
    }

  public static void main(String[] args) {
    MyStack<String> strings = new MyStack<>();
    strings.push("ABC");
    strings.push("DEF");
    System.out.println(strings.pop()); // DEF
  }
}
