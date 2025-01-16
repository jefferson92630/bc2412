import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
  public static void main(String[] args) {
    LinkedList<String> strings = new LinkedList<>();
    strings.add("ABC"); // add() belongs to Collections Family
    strings.add("DEF");
    strings.add("ABC");
    System.out.println(strings.size()); // 3

    strings.remove(0); // remove by index
    System.out.println(strings); // [DEF, ABC]
    strings.remove("ABC"); // remove by objects
    System.out.println(strings); // [DEF]
    
    
    strings.add("Oscar");
    strings.add("Jenny");
    strings.remove(); // remove the head element
    System.out.println(strings); // [Oscar, Jenny]

    System.out.println(strings.contains("Jenny")); // true
    System.out.println(strings.contains("Vincent")); // false

    // contains(), add(), remove(Object obj), etc are common method for ArrayList and LinkedList
    System.out.println(strings.isEmpty()); // false

    for (String s : strings) { // for-each loop is possible.
      System.out.println(s);
    }

    strings.clear();
    System.out.println(strings.size()); // 0

    // LinkedList advantages: add/remove head/tail
    // Array/ArrayList advantages: point the objects directly if you know the position
    // Person.class (name)

   // Polymorphism.
   // List<Integer> ss = new ArrayList<>();
    List<Integer> ss = new LinkedList<>();
    ss.add(100);
    ss.add(1000);
    // Because of Interface List, ss object can invoke add() at compile time.
    // During runtime, we found the object is LinkedList, the add() will be the LinkedList one.
    ss.remove(1);

    // ss.remove(); // NOT OK, List Interface doesn't contain remove()

    LinkedList<Integer> ss2 = (LinkedList<Integer>) ss;
    ss2.remove();

    List<Animal> animals = new ArrayList<>();
    animals.add(new Panda());
    animals.add(new Tiger());
    for (Animal animal : animals) {
      System.out.println(animal.run());
    }
  }
}
