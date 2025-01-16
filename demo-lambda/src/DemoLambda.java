import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoLambda {

  public static void main(String[] args) {
    

    // define function
    // s (input)
    // s.length() (output)
    Function<String, Integer> stringLength = s -> s.length(); // skip "return" keyword 
    System.out.println(stringLength.apply("hello")); // 5
    stringLength = s -> s.length() + 10;

    // Input (String & String) s1 & s2
    // Output (Integer)
    BiFunction<String, String, Integer> totalLength = 
      (s1, s2) -> s1.length() + s2.length(); // skip "return" keyword 
      System.out.println(totalLength.apply("hello", "bye")); // 8

      // SuperFunction (Interface), 3 Input 1 Output
      SuperFunction<String, String, String, Integer> superfunction = (s1, s2, s3) -> s1.length() + s2.length() + s3.length();
      System.out.println(superfunction.apply("jeff", "jason", "steve")); // 14

     Consumer<String> printString = s -> System.out.println("The String is " + s);
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
