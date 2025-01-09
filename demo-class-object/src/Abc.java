public class Abc {

  public static void main(String[] args) {

    // constructor parameter must be same as object parameter
     Person p1 = new Person ("vincent", 18, "vincent@gmail.com", 'M');
     System.out.println(p1.getName()); // vincent
     System.out.println(p1.getAge()); // 18
     System.out.println(p1.getEmailAddress()); 

     Person p2 = new Person("lucas", 17, "lucas@gmail.com", 'M');
     System.out.println(p2.getName()); // lucas
     System.out.println(p2.getAge()); // 17
     System.out.println(p2.getEmailAddress()); 

    Person p3 = p2;
    System.out.println(p3.getAge()); // 17
    System.out.println(p3.getName()); // lucas
    System.out.println(p3.getEmailAddress()); // lucas@gmail.com

    p2.setAge(30);
    System.out.println(p2.getAge()); // 30
    System.out.println(p3.getAge()); // 30

    p2.setName("brian");
    System.out.println(p2.getName()); // brian
    System.out.println(p3.getName()); // brian

    p2.setEmailAddress("hello@gmail.com");
    System.out.println(p3.getEmailAddress()); // hello@gmail.com
    System.out.println(p3.getEmailAddress()); // hello@gmail.com


     Person[] persons = new Person[] {p1, p2, new Person ("dicky", 19, "dicky@gmail,com", 'F')};
     for (Person p: persons) {
      // vincent, 18, vincent@gmail.com
      System.out.println((p.getName() + "," + p.getAge() + "," + p.getEmailAddress()));
     }

     

     String s1 = "hello";
     String[] strings = new String[] {s1, "world"};

     // Compile time
     // Run time -> p1.getAge()

     // Person p1 = null;
     // p1.getK(); // compile error, -> p1 come from Person.class, and this class has NO getk() method

     p1.getAge();
     // p1.getAge(); 
     // Compile OK, -> p1 come from Person.class, and this class has getAge() method
     // Runtime error -> because p1 object reference finally cannot point to an object.

    }
}
