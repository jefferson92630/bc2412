import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.management.RuntimeErrorException;

public class DemoStream {
    public static void main(String[] args) {
    // traditional
    int [] arr = new int[] {1, 2, 3, 4};
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    for (int integer : arr) {
      System.out.println(integer);
    }

    // int [], Integer[], ArrayList<Integer>
    // Java 8 (2014): Stream style: List -> Stream -> List
    // Before Java 8: for loop(list)
    List<Integer> integers = Arrays.asList(1, 2, 3, 4);
    List<Integer> newIntegers = integers.stream() // Stream<Integers>
      .filter(e -> e % 2 == 0) // e -> e & 2 == 0 -> Predicate. Filter means keep the elements which satisfy the conditions
      .collect(Collectors.toList()); // always return new ArrayList

    System.out.println(integers); // [1, 2, 3, 4]
    System.out.println(newIntegers); // [2, 4]

    // Declare String array with some elements
    // filter string length > 5 & contains 'a'

    List<String> strings = Arrays.asList("address", "bye", "friend", "shopping");
    List<String> newStrings = strings.stream().filter(e -> e.length() > 5 && e.contains("a")).collect(Collectors.toList());

    System.out.println(strings); // [[address, bye, friend, shopping]
    System.out.println(newStrings); // [address]

    // Define a book list
    // filter book name contain "Herry" case insensitive

   List<Book> books = Arrays.asList(new Book("ABC Herry"), new Book("IJK HERRY"), new Book("IJK"));
   List<Book> newBooks = books.stream().filter(e -> e.getName().toUpperCase().contains("HERRY")).collect(Collectors.toList());

    System.err.println(books); // [Book[name=ABC Herry], Book[name=IJK HERRY], Book[name=IJK]]
    System.out.println(newBooks); // [Book[name=ABC Herry], Book[name=IJK HERRY]]

    // map(): Change the object type, but the quantity of element won't change
    List<String> bookNames = 
       books.stream() //
        .map(e -> e.getName()) //
          .collect(Collectors.toList());
      System.out.println(bookNames); // [ABC Herry, IJK HERRY, IJK]

    // filter + map
    // for loop + if + re-structure
      List<String> newBookNames = 
        books.stream() //
          .filter(e -> e.getName().toUpperCase().contains("HERRY")) //
            .map(e -> e.getName()) //
              .collect(Collectors.toList());
        System.out.println(newBookNames); // [ABC Herry, IJK HERRY]

    // for loop + if + procedures
        books.stream()
          .filter(e -> e.getName().startsWith(("A")))
            .forEach(e -> {
                System.out.println(e.getName()); // ABC Herry
            });

    // Convert 3 book names to 3 books
        List<String> bookNames2 = List.of("abc", "herry", "def");
        List<Book> newBooks2 = bookNames2.stream().map(e -> new Book(e)).collect(Collectors.toList());
        System.out.println(newBooks2);

    // Stream sorted() + Comparator
    // Collections.sort() + Comparator
    // Arrays.sort() + Comparator

    // Integer[] vs int[] (cannot auto convert), int vs integer (can auto convert)
        Integer[] arr2 = new Integer[] {2, 4, -1, 1, -3};
        Arrays.sort(arr2, (i1, i2) -> i1 > i2 ? -1 : 1); // Lambda expression of Comparator
        System.out.println(Arrays.toString(arr2)); // [4, 2, 1, -1, -3]

    // Integer[] -> Stream<Integer>
        List<Integer> sortedIntegers = Arrays.stream(arr2) // 
         .sorted((i1, i2) -> i1 > i2 ? -1 : 1) // 
          .collect(Collectors.toList()); //
          System.out.println(sortedIntegers); // [4, 2, 1, -1, -3]

    // Fruit
        List<String> fruits = Arrays.asList("orange", "apple", "orange", "lemon");
        Set<String> newFruits = fruits.stream().collect(Collectors.toSet());
        System.out.println(newFruits); // [orange, apple, lemon]

    // distinct() -> Remove duplicates
    // What if List<Book> by distinct()
        List<String> newFruits2 = fruits.stream().distinct().collect(Collectors.toList());
        System.out.println(newFruits2); // [orange, apple, lemon]

    Stream.of("abc", "def");
    Stream<Book> books2 = Stream.of(new Book("abc"), new Book("def"));
    List<Book> books3 = books2.filter(e -> e.getName().contains("a")).collect(Collectors.toList());

    Stream<String> ss = Stream.empty();
    System.out.println(ss.count()); // 0

    Optional<Book> targetBookBox = Stream.of(new Book("abc"), new Book("def")).
          filter(e -> "abc".equals(e.getName())).findFirst(); // find the first one
    
    // Optional (Java 8)
    // 1. targetBook never be null
    // 2. targetBook is an Optional Object, so it can use Optional method only
    // 3. You have to check the content of Optional Object before using it.
    // 4. isPresent() & ifPresent() are the ways to resolve Optional in safe mode.
    // 5. Never to resolve the Optional object by get() only. (unsafe)

    int x = 10;
    if (targetBookBox.isPresent()) { // something like peek
      Book targetBook = targetBookBox.get();
      System.out.println(targetBook.getName()); // abc
      System.out.println(x); // 10
      // x = 100;
    }

    // similar to for-each
    targetBookBox.ifPresent((e -> {
      System.out.println(e.getName()); // abc
      System.out.println(x); // 10
    }));

    // stream for-each
    String name = "oscar";
    Stream.of(100, 120, 300).forEach(e -> {
      System.out.println(e);
      System.out.println(name); // read the name
      // but cannot write the name variable
      // name = "abc";
    });

    String name2 = "ok";
    for (Integer integer : Stream.of(100, 120, 300).collect(Collectors.toList())) {
      System.out.println(integer);
      name2 = "ijk";
    }

    // Another way to resolve the Optional (safe)
    Book targetBook2 = targetBookBox.orElse(new Book("default"));

    Book targetBook3 = targetBookBox.
    orElseThrow(() -> new RuntimeException("Book is not found."));

    Book targetBook4 = targetBookBox.orElseGet(() -> new Book("default")); // similar to orElse

    // of(), ofNullale()

    String name3 = "ABC";
    Optional<String> os1 = Optional.of("ABC");

    String name4 = null;
    Optional<String> os2 = Optional.ofNullable(name4);

    Optional<String> os3 = Optional.empty();
    if (os3.isPresent()) {
      System.out.println(os3.get());
    } else {
      System.out.println("The String is null");
    }
    
    // 1. Stream intermediate operation won't execute itself, until terminal operation
    // 2. Once the terminal operation executed, the stream object can no longer be use again.
    Stream<Integer> integersLargerThan10 = Stream.of(10, 100, -1).filter(e -> e > 10);
    System.out.println(integersLargerThan10.count()); // 100

    // integersLargerThan10.collect(Collectors.toList());
    // Runtime Exception: stream has already been operated upon or closed
    
    // Intermediate operations: filter, map, distinct
    // Terminal operations: max, min, count, collect

    Stream<Integer> plusOne = Stream.of(1, 2, 3)
       .map(i -> {
        System.out.println(i);
        return i + 1;
      });

    // List<Integer> plusOneList = plusOne.collect(Collectors.toList()); // 2, 3, 4

      long count = plusOne.count();
    // Because Java thinks map() doesn't change the result of count()
    // so it won't execute map(), when the terminal operation is count()
      System.out.println(count); // 3

    }


    // Convert from List of Object A (more fields) to List of Object B (less fields)
    public static List<Book> getBookListForSearch(List<Book2> books) {
     return books.stream()
             .map(e -> new Book(e.getName()))
               .collect(Collectors.toList());
    }

    public static class Book2 {
      private String name;
      private double price;
  
      public Book2(String name, double price) {
        this.name = name;
        this.price = price;
    }
  
      public String getName() {
        return this.name;
       }

       public double getPrice() {
        return this.price;
       }
  
        @Override 
        public String toString() {
          return "Book[" 
          + "name=" + this.name + 
          ",price=" + this.price
          + "]";
        }
    }

    public static class Book {
      private String name;

      public Book(String name) {
        this.name = name;
      }

      public String getName() {
        return this.name;
      }

      @Override 
      public String toString() {
        return "Book[" 
        + "name=" + this.name
        + "]";
      }
    }
    
    }

