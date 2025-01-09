public class Person { // blueprint - define a Person
  // attributes, describe Person features
  private String name;
  private int age;
  private String emailAddress;
  private char gender; // F,M
  private int nameLength;

  // constructor (not method)
  // constructor is to create object
   public Person(String name, int age, String emailAddress, char gender) {
    this.name = name;
    this.age = age;
    this.emailAddress = emailAddress;
    this.gender = gender;
   }

   public int getNameLength() {
    return this.name.length();
  }

  public boolean isElderly() {
    return this.age > 65;
  }

   public boolean isMale() {
    return this.gender == 'M' ? true : false;
   }

  // getter (instance = object)
  // instance method is able to return self value
  public String getName() {
    return this.name;
  }
  public int getAge() {
    return this.age;
  }
  public String getEmailAddress() {
    return this.emailAddress;
  }

  // setter
  // void -> return type (return nothing)
  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

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
     System.out.println(p2.getNameLength()); // 5
     System.out.println(p2.isMale());

     Person[] persons = new Person[] {p1, p2, new Person ("dicky", 19, "dicky@gmail,com", 'F')};
     for (Person p: persons) {
      // vincent, 18, vincent@gmail.com
      System.out.println((p.getName() + "," + p.getAge() + "," + p.getEmailAddress() + "," + p.isMale()));
     }

     Person p4 = new Person("Jimmy", 5, "jimmy@gmail.com", 'M');
     System.out.println(p4.isMale()); // true
     System.out.println(p4.getName().length()); // 5
     System.out.println(p4.getNameLength()); // 5
     System.out.println(p4.isElderly()); // false
     p1.setAge(66);
     System.out.println(p4.isElderly()); // true
     
     }
    }
