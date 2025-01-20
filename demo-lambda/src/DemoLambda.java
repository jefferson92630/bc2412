import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DemoLambda {

  public static void main(String[] args) {
    

    // define function
    // s (input)
    // s.length() (output)
    Function<String, Integer> stringLength = s -> s.length(); // skip "return" keyword 
    System.out.println(stringLength.apply("hello")); // 5
    stringLength = s -> s.length() + 10;
    System.out.println(stringLength.apply("hello")); // 15

    // Input (String & String) s1 & s2
    // Output (Integer)
    BiFunction<String, String, Integer> totalLength = 
      (s1, s2) -> s1.length() + s2.length(); // skip "return" keyword 
      System.out.println(totalLength.apply("hello", "bye")); // 8


     Consumer<String> printString = s -> System.out.println("The String is " + s); // <> is parameter
     printString.accept("hello"); // The String is hello

     Supplier<Integer> randomMarkSixNumber = () -> new Random().nextInt(49) + 1;
     System.out.println(randomMarkSixNumber.get());

     // Custom FunctionInterface Swimable
     // Java before 8: Interface -> Class -> Object
     // Java after 8: Interface -> Object
     Swimable lucas = () -> System.out.println("Lucas is swimming");
     lucas.swim(); // Lucas is swimming

     // Lambda Assumption: FunctionalInterface -> one method only -> lambda expression

     // MathOperation
     MathOperation add = (x, y) -> x + y;
      System.out.println(add.operate(3, 4)); // 7

     MathOperation subtract = (x, y) -> x - y;
      System.out.println(subtract.operate(5, 3)); // 2

     MathOperation mulitiply = (x, y) -> x * y;
      System.out.println(mulitiply.operate(3, 4)); // 12

     MathOperation divide = (x, y) -> x / y;
      System.out.println(divide.operate(10, 2)); // 5

      List<Book> books = new ArrayList<>();
      books.add(new Book(1));
      books.add(new Book(3));
      books.add(new Book(10));
      books.add(new Book(12));
      for (Book book : books) {
        System.out.println(book.getId()); // 1, 3, 10
      }
      books.forEach(b -> System.out.println(b.getId())); // 1, 3, 10

      // More than one line, means can add more than one commend, not only sysout. Like below add "hello" message.
      books.forEach(b -> {
        String message = "hello";
        System.out.println(b.getId() + " " + message);
      }); // 1 hello ......

      Map<String, String> fruitMap = new HashMap<>();
      fruitMap.put("orange", "abc");
      fruitMap.put("apple", "def");

      fruitMap.forEach ((key, value) ->
        System.out.println("key=" + key + ", value=" + value));
     

      // Predicate
      // x > 8 -> boolean
      // x -> x > 8 -> Predicate (formula)

      int x1 = -1;
      boolean isLargeThanEight = x1 > 8; 
      System.out.println(isLargeThanEight); // false

      Predicate<Integer> isLargeThan8 = x -> x > 8;
      System.out.println(isLargeThan8.test(9)); // true
      System.out.println(isLargeThan8.test(8)); // false

      // check if the integer is even number

      Predicate<Integer> isEvenNumber = x -> x % 2 == 0;
      System.out.println(isEvenNumber.test(9)); // false
      System.out.println(isEvenNumber.test(8)); // true
      // check muliple conditions
      System.out.println(isLargeThan8.and(isEvenNumber).test(10)); // true, use and()
      System.out.println(isLargeThan8.or(isEvenNumber).test(9)); // true, use or()

      System.out.println(books.size()); // 4, before remove books
      books.removeIf(book -> book.getId() % 2 == 0);
      System.out.println(books.size()); // 2, after remove books

      BiFunction<String, String, String> appendHello = (oldV, newV) -> oldV + newV;
      fruitMap.merge("lemon", "xyz", appendHello);
      fruitMap.merge("apple", "mmo", appendHello);
      fruitMap.merge("orange", "yyy", appendHello);
      System.out.println(fruitMap); // {orange=abcyyy, apple=defmmo, lemon=xyz}

      // SuperFunction (Interface), 3 Input 1 Output
      SuperFunction<String, String, String, Integer> superfunction = (s1, s2, s3) -> s1.length() + s2.length() + s3.length();
      System.out.println(superfunction.apply("jeff", "jason", "steve")); // 14

      // UnaryOperator<String> -> Function<String, String>
      UnaryOperator<String> toUpperCase = s -> s.toUpperCase();
      System.out.println(toUpperCase.apply("hello")); // HELLO

      UnaryOperator<String> transform = s -> {
        if(s.length() > 5) {
          return s.substring(0, 5);
        } else {
          if (s.startsWith("a")) {
          return "Wrong String.";
          }
          return s;
        }
      };

      System.out.println(transform.apply("abcdef")); // abcde
      System.out.println(transform.apply("abcde")); // Wrong String
      System.out.println(transform.apply("edcba")); // edcba
  }

  public static class Book {
    private int id;

    public Book(int id) {
      this.id = id;
    }

    public int getId() {
      return this.id;
    }
  }
  
  // Similar to Consumer.class
  public static void printString(String s) {
    System.out.println("The String is " + s);
  }

  // Similar to Supplier.class
  public static int randomMarkSixNumber() {
    return new Random().nextInt(49) + 1; // 1 - 49
  }

  // Similar to Function.class
  public static Integer stringLength(String s) {
    return s.length();
  }
}
