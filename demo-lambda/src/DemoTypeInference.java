import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoTypeInference {
  //private var x; // 1. var cannot be defined as attribute type
  public static void main(String[] args) {
    // Java 10
    // Once you assign the value of var variable, the variable type will be defined as usual.
    // var can be defined as Local variable
    var x = 3; // x is a int variable

    // x = 3.3;

    var y = 3.3; // y is a double type.
    y = 3; // upcast
    System.out.println(y); // 3.0

    List<List<String>> stringLists = new ArrayList<>();
    stringLists.add(Arrays.asList("abc", "def"));
    stringLists.add(Arrays.asList("vincent", "lucas"));

    // List<List<String>>
    // [[abc, def], [vincent, lucas]]

    for (List<String> list: stringLists) { // 1st list
      for (String str: list) { // 2nd list
        System.out.println(str);
      }
    }
    
    // Same as above 
    // var can be defined as reference type for a certain DS (data structure)
    for (var list: stringLists) { // 1st list
      for (var str: list) { // 2nd list
        System.out.println(str);
      }
    }

   //  u has to be initialized at declaration
   //  var u = null;
   //  u = 3;

   var arr = new int[] {3, 2, 1}; // normally, var supports array
    // var arr10 = {3, 2, 1}; // NOT OK, {3, 2, 1} can be a double array
    double[] arr10 = {3, 2, 1};

    // Stream flatmap
    // List<<List<String>> -> List<String>
    List<String> result = stringLists.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
    System.out.println(result); // [abc, def, vincent, lucas]

    List<Customer> customers = Arrays.asList(new Customer("vincent", "vlau"), new Customer("lucas", "lll"));
    List<String> usernames = customers.stream().map(e -> e.getUserName()).collect(Collectors.toList());
    System.out.println(usernames); // [vlau, lll]

    // Find all nicknames of my customers
    List<Customer> customers2 = Arrays.
    asList(new Customer("vincent", "vlau", Arrays.asList("abcd", "def"))
    , new Customer("stephen", "swong", Arrays.asList("ab", "ijkm"))
    , new Customer("lucas", "lll", Arrays.asList("ijk", "xyz")));

    List<String> nicknames = customers2.stream() //
    .filter(e -> e.getName().length() > 5) // Customer
    .flatMap(e -> e.getNickName().stream()) // Customer
    .filter(e -> e.charAt(0) == 'a') // String
    .collect(Collectors.toList());

    System.out.println(nicknames); // [abcd, ab]

  }

 // 2. Java doesn't allow defining var as variable type.
 // because Java is Strong type (type has to be determined during compile time)
 // public static int sum(var x, var y) {
 //   return x + y;
 // }

  // 3. Return type cannot be defined as var type.
  // because caller doesn't know the return type of sum2() method during the compile time 
  // public static var sum2(int x, int y) {
  //  return x + y;
  // }

  public static class Customer {
    private String name;
    private String username;
    private List<String> nicknames;

    private Customer(String name, String username, List<String> nicknames) {
      this.name = name;
      this.username = username;
      this.nicknames = nicknames;
    }

    private Customer(String name, String username) {
      this.name = name;
      this.username = username;
    }

    public String getUserName() {
      return this.username;
    }

    public List<String> getNickName() {
      return this.nicknames;
    }

    public String getName() {
      return this.name;
    }
 }

}
