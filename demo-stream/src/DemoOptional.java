import java.util.Optional;

public class DemoOptional {
  // Never use Optional type as attribute type
  // firstName still can be null. But what is this meaning?
  private Optional<String> firstName;

  public static void main(String[] args) {
    // Caller
    // Advantage: Able to avoid null pointer exception
    Optional<String> result = concat("abc", "def");
    // isPresent
    if (result.isPresent()) {
      System.out.println(result.get());
    }

    String result2 = concat(Optional.of("abc"), Optional.of("def")); // not OK. Parameter cannot be Optional
  }
    
  // 1. Optional can be only be used as a return type of method
  // If you decided to have a return type of Optional,
  // it implies the result may be null
  // if a or b is null, then result is null

  public static Optional<String> concat(String a, String b) {
    if (a == null || b == null)
      return Optional.empty();
    return Optional.of (a.concat(b));
  }

  // 2. Never use Optional as input parameter, Optional is for protect user, not author
  // x and y still can be null
  public static String concat(Optional<String> x, Optional<String> y) {
    if (x == null || y == null)
      return null;
    if (!x.isPresent() || !y.isPresent())
     return null;
    return x.get().concat(y.get());
  }
}
