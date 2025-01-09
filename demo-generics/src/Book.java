import java.util.Objects;

public class Book {
  private String name;
  
  public Book(String name) {
    this.name = name;
  }


  public String getName() {
    return this.name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
    return true;
    if (!(obj instanceof Book)) 
      return false;
      Book book = (Book) obj;
      return Objects.equals(this.name, book.getName());
  }

  @Override
  public String toString() {
    return "Book["
    + "name=" + this.name
    + "]";
  }
}
