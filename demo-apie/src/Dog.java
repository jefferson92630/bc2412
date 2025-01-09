public class Dog extends Animal implements KeepAlive {

  private String color;

  // constructor (Class CANNOT inherit Parent Constructor)
  public Dog (String name) {
   super(name);
  }


  // walk()
  public void walk() {
    System.out.println("Dog is walking ......");
  }

  @Override
  public void drink() {
    System.out.println("Dog is drinking ......");
  }


  @Override 
  public void sleep() {
    System.out.println("Dog is sleeping ......");
  }


  public static void main(String[] args) {
    Dog dog = new Dog("DEF");
    dog.walk();
    System.out.println(dog.getName());
    
    dog.eat();
    dog.sleep();
    dog.walk();
  }
}

