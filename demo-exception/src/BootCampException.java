public class BootCampException extends RuntimeException {
  // once you extends Exception Family, your class become an exception class
  // you can now throw the object of the class

  public static void main(String[] args) {
    throw new BootCampException();
    // throw new Cat(); // Class Cat didn't extend Exception Family, it cannot be thrown.

    // caller: call the below method by try-catch
  }

  // Write a method to throw BootcampException
}
