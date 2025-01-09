// Generics Design -> Reduce number of class
public class GeneralPrinter<T> { // <T> present the scope of "T" inside the class
  private T value;

  public GeneralPrinter(T value) {
    this.value = value;
  }

  public T getValue() {
    return this.value;
  }

  public String print() {
    return "this is " + this.value.toString(); // toString() is implicit.
  }

  public static void main(String[] args) {
    GeneralPrinter<Integer> printer = new GeneralPrinter<>(Integer.valueOf(3));
    GeneralPrinter<Object> printer2 = new GeneralPrinter<>(new Book("IJK"));

    Object obj = new Book("ABC");
    if (obj instanceof Integer) { // safety concern
      Integer integer = (Integer) obj;
      System.out.println(integer.compareTo(2));
    }
  }
}
