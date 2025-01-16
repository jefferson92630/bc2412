import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class ArrayListExercise {


  public static void main(String[] args) {

    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    // 1c. Print all the elements in the list.
    // 1d. Remove the number 30 from the list.
    // 1e. Print the size of the list.

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    numbers.add(50);
    System.out.println(numbers);
    numbers.remove(2);
    System.out.println(numbers.size());

    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.

    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");
    fruits.add("Orange");
    
      if (!(fruits.contains("Grapes"))) {
        fruits.add("Grapes");
      }
    fruits.set(2, "Peach");
    System.out.println(fruits);


    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.

    ArrayList<Integer> num = new ArrayList<>();
    num.add(10);
    num.add(20);
    num.add(10);
    num.add(30);
    num.add(40);
    num.add(20);
    num.add(50);

    HashSet<Integer> convertedList = new HashSet<>(num);
    System.out.println(convertedList);
    



    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.

    HashSet<String> countries = new HashSet<>();
      countries.add("USA");
      countries.add("India");
      countries.add("China");
      countries.add("Japan");
      countries.add("Canada");
      System.out.println(countries.add("India"));
      System.out.println(countries);

    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of integers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.

    HashSet<Double> nums2 = new HashSet<>();
    nums2.add(1.1);
    nums2.add(2.2);
    nums2.add(3.3);
    nums2.add(4.4);
    nums2.add(5.5);
    System.out.println(nums2.contains(3.3));
    nums2.remove(2.2);
    System.out.println(nums2);

    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.

    HashSet<Integer> nums3 = new HashSet<>();
    HashSet<Integer> nums4 = new HashSet<>();

    nums3.add(10);
    nums3.add(20);
    nums3.add(30);
    nums3.add(40);
    nums4.add(30);
    nums4.add(40);
    nums4.add(50);
    nums4.add(60);



    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chloe", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.

    HashSet<String> name = new HashSet<>();
    name.add("Cherry");
    name.add("Steve");
    name.add("Chloe");
    name.add("Jenny");
    name.add("Vicky");

    ArrayList<String> name2 = new ArrayList<>(name);
    System.out.println(name2);

    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // 8b. Iterate over the ArrayList and print each student's details.
    // 8c. Remove the student Bob.
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    // 8e. Create another ArrayList to store student with name starts with 'A'

    Student s1 = new Student(1, "Alice");
    Student s2 = new Student(2, "Bob");
    Student s3 = new Student(3, "Charlie");
    ArrayList<Student> students = new ArrayList<>();
      students.add(s1);
      students.add(s2);
      students.add(s3);
      for (Student s : students) {
        System.out.println(s);
      }
      students.remove(s2);






    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.

    Student s4 = new Student(1, "Alice");
    Student s5 = new Student(2, "Bob");
    Student s6 = new Student(3, "Charlie");
    HashSet<Student> student2 = new HashSet<>();
    student2.add(s4);
    student2.add(s5);
    student2.add(s6);

    Student s7 = new Student(2, "Bob");
    Student s8 = new Student(3, "Charlie");
    Student s9 = new Student(3, "David");
    HashSet<Student> student3 = new HashSet<>();
    student3.add(s7);
    student3.add(s8);
    student3.add(s9);
    
    HashSet<Student> commonStudents = new HashSet<>();
    for (Student s: student2) {
      if(student3.contains(s))
      commonStudents.add(s);
    }
    System.out.println(commonStudents); 
  }



  public static class Student {
    private int id;
    private String name;
  
    // Constructor
    // getter, setter, etc.
  
    private Student (int id, String name) {
      this.id = id;
      this.name = name;
    }

    public int getId() {
      return this.id;
    }

    public String getName() {
      return this.name;
    }

    public static String getName2(int id) {
      String notFound = "";
     if (Student(id, name).getId().equals(id))
    return "";
  }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
      return true;
      if (!(obj instanceof Student))
      return false;
      Student student = (Student) obj;
      return Objects.equals(this.id, student.getId()) 
      && Objects.equals(this.name, student.getName());
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.id, this.name);
    }

    @Override
    public String toString() {
      return "Student[" 
        + "id=" + this.id
        + ",name=" + this.name
        + "]";

    }
  
  
  }
  
  }
