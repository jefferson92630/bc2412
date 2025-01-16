public class Node {
  private Node node; // the next node's address
  private int value;

  public Node() {

  }

  public Node(Node node) {
    this.node = node;
  }

  public Node(int value) {
    this.value = value;
  }

  public Node(Node node, int value) {
    this.node = node;
    this.value = value;
  }

  // You are setting the next node to the current node
  public void setNode(Node node){
    this.node = node;
  }

  // getter
  // public Node getNode()
  public Node next() {
    return this.node;
  }

  public int getValue() {
    return this.value;
  }

  public static void main(String[] args) {
    // 3 objects
    Node head = new Node(40);
    Node node2 = new Node(50);
    head.setNode(node2);
    Node node3 = new Node(60);
    node2.setNode(node3);
    node3.setNode(new Node(70)); // lost "new Node(70)" address

    Node temp = head;
    while(temp != null) { // Can I exit?
      System.out.println(temp.getValue());
      temp = temp.next();
    }
    
    // array vs LinkedList/ NodeList
  }
}
