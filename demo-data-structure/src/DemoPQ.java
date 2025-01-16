import java.util.Comparator;
import java.util.PriorityQueue;

public class DemoPQ {

  public static class Person {
    private int age;

    public Person(int age) {
      this.age = age;
    }

    public int getAge() {
      return this.age;
    }

    public String toString() {
      return "[Age="
             + this.age
             + "]";
    }
  }

  public static class SortByAge implements Comparator<DemoPQ.Person> {
    @Override
    public int compare(Person p1, Person p2) {
     return p1.getAge() > p2.getAge() ? -1 : 1;
    }
  }
  
  public static void main(String[] args) {
    PriorityQueue<String> pq = new PriorityQueue<>();
    pq.add("Vincent");
    System.out.println((pq)); // Vincent
    pq.add("Oscar");
    System.out.println((pq)); // Oscar, Vincent
    pq.add("Lucas");
    System.out.println((pq)); // Lucas, Vincent, Oscar (no ordering)
    System.out.println(pq.size()); // 3

    // For poll(), ordering -> String natural order
    System.out.println(pq.poll()); // Lucas
    System.out.println(pq.poll()); // Oscar
    System.out.println(pq.poll()); // Vincent
    


    PriorityQueue<Person> pq2 = new PriorityQueue<>(new SortByAge());
    pq2.add(new Person(65));
    pq2.add(new Person(70));
    pq2.add(new Person(80));
    System.out.println(pq2.poll()); // [Age=80]
    System.out.println(pq2.poll()); // [Age=70]
    pq2.add(new Person(75));
    System.out.println(pq2.poll()); // [Age=75]

  }
}
