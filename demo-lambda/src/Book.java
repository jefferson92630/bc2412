public record Book (String name, double price, String author) {
  // private String author;
  public static final double PI = 3.14;

  
  public void print() {
    System.out.println(name + price);
  }
  public static void main(String[] args) {
    Book b1 = new Book("ABC", 10.5, "jeff");
    System.out.println(b1.name()); // ABC
    System.out.println(b1.price()); // 10.5
    System.out.println(b1.author()); // jeff
    System.out.println(new Book("ABC", 10.5, "jeff").equals(b1)); // true
    System.out.println(new Book("ABC", 10.5, "jeff").hashCode()); // -933254403
    System.out.println(b1.hashCode()); // -933254403
    System.out.println(b1); // Book[name=ABC, price=10.5, author=jeff]
    b1.print(); // ABC10.5
    System.out.println(Book.PI); // 3.14

    // All-arg constructor ONLY
    // renamed getter
    // no setter (immutable)
    // Support equals() and hashCode()
    // Support toString()
    // Support static variable
    // Support custom instance method 
    // Do not support custom attribute
    // Do not support custom constructor
    // Cannot extend, implement


  }
}
